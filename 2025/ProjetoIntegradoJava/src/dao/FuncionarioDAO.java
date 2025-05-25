package dao;
import model.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {

    public void salvarFuncionario(Funcionario funcionario) {
        // Define o ID antes de salvar
        if (funcionario.getId() == 0) { // Assume 0 como ID não definido
             funcionario.setId(FileHandler.getNextId("Funcionario"));
        }

        String insertSQL = String.format(
            "INSERT INTO Funcionario (id, nome, email, senha) VALUES (%d, '%s', '%s', '%s');",
            funcionario.getId(),
            funcionario.getNome(),
            funcionario.getEmail(),
            funcionario.getSenha() // Cuidado: armazenar senhas em texto plano não é seguro
        );
        FileHandler.writeInsertStatement(insertSQL);
    }

    public Funcionario autenticarFuncionario(String email, String senha) {
        List<String> lines = FileHandler.readLines();
        for (String line : lines) {
            if (line.startsWith("INSERT INTO Funcionario")) {
                // Extração simples, pode ser melhorada com regex ou parser mais robusto
                String storedEmail = FileHandler.getValueFromInsert(line, "email");
                String storedSenha = FileHandler.getValueFromInsert(line, "senha");
                
                if (email.equals(storedEmail) && senha.equals(storedSenha)) {
                    int id = Integer.parseInt(FileHandler.getValueFromInsert(line, "id"));
                    String nome = FileHandler.getValueFromInsert(line, "nome");
                    return new Funcionario(id, nome, storedEmail, storedSenha);
                }
            }
        }
        return null; // Não encontrado ou senha incorreta
    }
    
    public Funcionario buscarPorId(int id) {
        List<String> lines = FileHandler.readLines();
        for (String line : lines) {
            if (line.startsWith("INSERT INTO Funcionario")) {
                String idStr = FileHandler.getValueFromInsert(line, "id");
                if (idStr != null && Integer.parseInt(idStr) == id) {
                    String nome = FileHandler.getValueFromInsert(line, "nome");
                    String email = FileHandler.getValueFromInsert(line, "email");
                    // Senha não é normalmente retornada em buscas, mas o objeto precisa dela
                    String senha = FileHandler.getValueFromInsert(line, "senha"); 
                    return new Funcionario(id, nome, email, senha);
                }
            }
        }
        return null;
    }

    public List<Funcionario> listarTodos() {
        List<Funcionario> funcionarios = new ArrayList<>();
        List<String> lines = FileHandler.readLines();
        for (String line : lines) {
            if (line.startsWith("INSERT INTO Funcionario")) {
                try {
                    int id = Integer.parseInt(FileHandler.getValueFromInsert(line, "id"));
                    String nome = FileHandler.getValueFromInsert(line, "nome");
                    String email = FileHandler.getValueFromInsert(line, "email");
                    String senha = FileHandler.getValueFromInsert(line, "senha"); // Para consistência do objeto
                    funcionarios.add(new Funcionario(id, nome, email, senha));
                } catch (NumberFormatException e) {
                    System.err.println("Erro ao parsear funcionário da linha: " + line + " - " + e.getMessage());
                }
            }
        }
        return funcionarios;
    }
}