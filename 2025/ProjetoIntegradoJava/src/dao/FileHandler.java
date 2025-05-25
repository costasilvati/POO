package dao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileHandler {
    private static final String FILE_NAME = "inserts.sql";

    public static synchronized void writeInsertStatement(String insertStatement) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true); // true para append
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(insertStatement);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo '" + FILE_NAME + "': " + e.getMessage());
        }
    }

    public static synchronized List<String> readLines() {
        try {
            if (!Files.exists(Paths.get(FILE_NAME))) {
                return new ArrayList<>(); // Retorna lista vazia se o arquivo não existe
            }
            return Files.readAllLines(Paths.get(FILE_NAME));
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo '" + FILE_NAME + "': " + e.getMessage());
            return new ArrayList<>();
        }
    }
    
    // Método auxiliar para extrair valor de um campo específico de uma linha de INSERT
    // Exemplo: getValueFromInsert(line, "nome")
    public static String getValueFromInsert(String insertLine, String fieldName) {
        // Regex para capturar: campo='valor' ou campo=valorNumérico
        Pattern pattern = Pattern.compile(fieldName + "\\s*=\\s*'([^']*)'|" + fieldName + "\\s*=\\s*([^,)]+)");
        Matcher matcher = pattern.matcher(insertLine);
        if (matcher.find()) {
            if (matcher.group(1) != null) return matcher.group(1); // Valor string
            if (matcher.group(2) != null) return matcher.group(2); // Valor numérico
        }

        // Tentativa mais genérica baseada na ordem dos VALUES
        // INSERT INTO Tabela (col1, col2) VALUES (val1, 'val2');
        // Isso é mais frágil e depende da ordem exata e do tipo de aspas.
        // Para simplicidade, a regex acima é mais direcionada.
        // Se precisar de algo mais robusto, a estrutura do INSERT precisa ser muito consistente
        // ou usar um parser SQL mais completo (o que está fora do escopo aqui).
        
        // Exemplo de parser simples para VALUES (id, 'nome', 'email', 'senha')
        // Para Funcionario: VALUES (1, 'Admin', 'admin@mail.com', 'pass')
        if (insertLine.contains("VALUES (")) {
            String valuesPart = insertLine.substring(insertLine.indexOf("VALUES (") + 8, insertLine.lastIndexOf(")"));
            String[] values = valuesPart.split(",\\s*"); // Divide por vírgula e espaços opcionais

            if (insertLine.startsWith("INSERT INTO Funcionario")) {
                if (fieldName.equals("id") && values.length > 0) return values[0].trim();
                if (fieldName.equals("nome") && values.length > 1) return values[1].trim().replace("'", "");
                if (fieldName.equals("email") && values.length > 2) return values[2].trim().replace("'", "");
                if (fieldName.equals("senha") && values.length > 3) return values[3].trim().replace("'", "");
            } else if (insertLine.startsWith("INSERT INTO Cliente")) {
                // id, nome, cpf, uf, idFuncionario
                if (fieldName.equals("id") && values.length > 0) return values[0].trim();
                if (fieldName.equals("nome") && values.length > 1) return values[1].trim().replace("'", "");
                if (fieldName.equals("cpf") && values.length > 2) return values[2].trim().replace("'", "");
                if (fieldName.equals("uf") && values.length > 3) return values[3].trim().replace("'", "");
                if (fieldName.equals("idFuncionario") && values.length > 4) return values[4].trim();
            } else if (insertLine.startsWith("INSERT INTO Cartao")) {
                // id, idTitular, numeroCartao, vencimento, codSeguranca, bloqueado, idFuncionario
                 if (fieldName.equals("id") && values.length > 0) return values[0].trim();
                 if (fieldName.equals("idTitular") && values.length > 1) return values[1].trim();
                 // Adicionar outros campos se necessário para Cartao
            }
        }
        return null;
    }

    // Método para obter o próximo ID baseado nas linhas do arquivo
    public static int getNextId(String entityTypePrefix) {
        List<String> lines = readLines();
        int maxId = 0;
        String idMarker = "VALUES ("; // Assumindo que ID é o primeiro valor

        for (String line : lines) {
            if (line.startsWith("INSERT INTO " + entityTypePrefix)) {
                try {
                    int startIndex = line.indexOf(idMarker) + idMarker.length();
                    int endIndex = line.indexOf(",", startIndex);
                    if (endIndex == -1) { // Caso seja o único valor ou o último sem vírgula antes do ')'
                        endIndex = line.indexOf(")", startIndex);
                    }
                    if (startIndex < endIndex) {
                        String idStr = line.substring(startIndex, endIndex).trim();
                        int id = Integer.parseInt(idStr);
                        if (id > maxId) {
                            maxId = id;
                        }
                    }
                } catch (Exception e) {
                    System.err.println("Erro ao parsear ID da linha: " + line + " - " + e.getMessage());
                }
            }
        }
        return maxId + 1;
    }
}