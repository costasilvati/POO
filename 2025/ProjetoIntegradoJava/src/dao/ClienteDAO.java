package dao;
import model.Cliente;
import model.Funcionario;
import java.util.ArrayList;
import java.util.List;


public class ClienteDAO {

    private FuncionarioDAO funcionarioDAO; // Para buscar o objeto Funcionario

    public ClienteDAO() {
        this.funcionarioDAO = new FuncionarioDAO();
    }

    public void salvarCliente(Cliente cliente) {
        if (cliente.getId() == 0) {
            cliente.setId(FileHandler.getNextId("Cliente"));
        }
        
        int idFuncionario = (cliente.getIdFuncionario() != null) ? cliente.getIdFuncionario().getId() : -1; // -1 ou algum valor para indicar nulo

        String insertSQL = String.format(
            "INSERT INTO Cliente (id, nome, cpf, uf, idFuncionario) VALUES (%d, '%s', '%s', '%s', %d);",
            cliente.getId(),
            cliente.getNome(),
            cliente.getCpf(),
            cliente.getUf(),
            idFuncionario
        );
        FileHandler.writeInsertStatement(insertSQL);
    }

    public Cliente buscarPorId(int id) {
        List<String> lines = FileHandler.readLines();
        for (String line : lines) {
            if (line.startsWith("INSERT INTO Cliente")) {
                String idStr = FileHandler.getValueFromInsert(line, "id");
                if (idStr != null && Integer.parseInt(idStr) == id) {
                    String nome = FileHandler.getValueFromInsert(line, "nome");
                    String cpf = FileHandler.getValueFromInsert(line, "cpf");
                    String uf = FileHandler.getValueFromInsert(line, "uf");
                    String idFuncStr = FileHandler.getValueFromInsert(line, "idFuncionario");
                    
                    Funcionario func = null;
                    if (idFuncStr != null && !idFuncStr.equals("-1")) {
                        func = funcionarioDAO.buscarPorId(Integer.parseInt(idFuncStr));
                    }
                    return new Cliente(id, nome, cpf, uf, func);
                }
            }
        }
        return null;
    }
    
    public Cliente buscarPorCpf(String cpfToFind) {
        List<String> lines = FileHandler.readLines();
        for (String line : lines) {
            if (line.startsWith("INSERT INTO Cliente")) {
                String cpf = FileHandler.getValueFromInsert(line, "cpf");
                if (cpf != null && cpf.equals(cpfToFind)) {
                    int id = Integer.parseInt(FileHandler.getValueFromInsert(line, "id"));
                    String nome = FileHandler.getValueFromInsert(line, "nome");
                    String uf = FileHandler.getValueFromInsert(line, "uf");
                    String idFuncStr = FileHandler.getValueFromInsert(line, "idFuncionario");
                    
                    Funcionario func = null;
                    if (idFuncStr != null && !idFuncStr.equals("-1")) {
                        func = funcionarioDAO.buscarPorId(Integer.parseInt(idFuncStr));
                    }
                    return new Cliente(id, nome, cpf, uf, func);
                }
            }
        }
        return null;
    }

    public List<Cliente> listarTodos() {
        List<Cliente> clientes = new ArrayList<>();
        List<String> lines = FileHandler.readLines();
        for (String line : lines) {
            if (line.startsWith("INSERT INTO Cliente")) {
                try {
                    int id = Integer.parseInt(FileHandler.getValueFromInsert(line, "id"));
                    String nome = FileHandler.getValueFromInsert(line, "nome");
                    String cpf = FileHandler.getValueFromInsert(line, "cpf");
                    String uf = FileHandler.getValueFromInsert(line, "uf");
                    String idFuncStr = FileHandler.getValueFromInsert(line, "idFuncionario");
                    
                    Funcionario func = null;
                    if (idFuncStr != null && !idFuncStr.equals("-1") && !idFuncStr.equalsIgnoreCase("null")) {
                         try {
                            func = funcionarioDAO.buscarPorId(Integer.parseInt(idFuncStr));
                         } catch (NumberFormatException e){
                             System.err.println("ID de funcionário inválido para cliente " + id + ": " + idFuncStr);
                         }
                    }
                    clientes.add(new Cliente(id, nome, cpf, uf, func));
                } catch (Exception e) { // Captura mais genérica para outros possíveis erros de parse
                    System.err.println("Erro ao parsear cliente da linha: " + line + " - " + e.getMessage());
                }
            }
        }
        return clientes;
    }
}