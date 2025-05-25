package dao;

import java.util.ArrayList;
import java.util.List;

import model.Cartao;
import model.Cliente;
import model.Funcionario;

public class CartaoDAO {
    private ClienteDAO clienteDAO;
    private FuncionarioDAO funcionarioDAO;

    public CartaoDAO() {
        this.clienteDAO = new ClienteDAO();
        this.funcionarioDAO = new FuncionarioDAO();
    }

    public void salvarCartao(Cartao cartao) {
        if (cartao.getId() == 0) {
            cartao.setId(FileHandler.getNextId("Cartao"));
        }
        
        int idTitular = (cartao.getTitular() != null) ? cartao.getTitular().getId() : -1;
        int idFuncionario = (cartao.getIdFuncionario() != null) ? cartao.getIdFuncionario().getId() : -1;

        String insertSQL = String.format(
            "INSERT INTO Cartao (id, idTitular, numeroCartao, vencimento, codSeguranca, bloqueado, idFuncionario) VALUES (%d, %d, '%s', '%s', '%s', %b, %d);",
            cartao.getId(),
            idTitular,
            cartao.getNumeroCartao(),
            cartao.getVencimento(),
            cartao.getCodSeguranca(),
            cartao.isBloqueado(),
            idFuncionario
        );
        FileHandler.writeInsertStatement(insertSQL);
    }

    public List<Cartao> listarTodos() {
        List<Cartao> cartoes = new ArrayList<>();
        List<String> lines = FileHandler.readLines();

        for (String line : lines) {
            if (line.startsWith("INSERT INTO Cartao")) {
                try {
                    int id = Integer.parseInt(FileHandler.getValueFromInsert(line, "id"));
                    String idTitularStr = FileHandler.getValueFromInsert(line, "idTitular");
                    String numeroCartao = FileHandler.getValueFromInsert(line, "numeroCartao");
                    String vencimento = FileHandler.getValueFromInsert(line, "vencimento");
                    String codSeguranca = FileHandler.getValueFromInsert(line, "codSeguranca");
                    // Para boolean: 'true' ou 'false' (sem aspas no SQL gerado)
                    String bloqueadoStr = FileHandler.getValueFromInsert(line, "bloqueado"); 
                    boolean bloqueado = Boolean.parseBoolean(bloqueadoStr);
                    String idFuncStr = FileHandler.getValueFromInsert(line, "idFuncionario");

                    Cliente titular = null;
                    if (idTitularStr != null && !idTitularStr.equals("-1")) {
                        titular = clienteDAO.buscarPorId(Integer.parseInt(idTitularStr));
                    }

                    Funcionario func = null;
                    if (idFuncStr != null && !idFuncStr.equals("-1")) {
                        func = funcionarioDAO.buscarPorId(Integer.parseInt(idFuncStr));
                    }
                    
                    cartoes.add(new Cartao(id, titular, numeroCartao, vencimento, codSeguranca, bloqueado, func));
                } catch (Exception e) {
                     System.err.println("Erro ao parsear cartão da linha: " + line + " - " + e.getMessage());
                }
            }
        }
        return cartoes;
    }
    
    public List<Cartao> listarPorCliente(Cliente cliente) {
        List<Cartao> cartoesDoCliente = new ArrayList<>();
        if (cliente == null) return cartoesDoCliente;

        List<String> lines = FileHandler.readLines();
        for (String line : lines) {
            if (line.startsWith("INSERT INTO Cartao")) {
                String idTitularStr = FileHandler.getValueFromInsert(line, "idTitular");
                if (idTitularStr != null && Integer.parseInt(idTitularStr) == cliente.getId()) {
                     try {
                        int id = Integer.parseInt(FileHandler.getValueFromInsert(line, "id"));
                        String numeroCartao = FileHandler.getValueFromInsert(line, "numeroCartao");
                        String vencimento = FileHandler.getValueFromInsert(line, "vencimento");
                        String codSeguranca = FileHandler.getValueFromInsert(line, "codSeguranca");
                        boolean bloqueado = Boolean.parseBoolean(FileHandler.getValueFromInsert(line, "bloqueado"));
                        String idFuncStr = FileHandler.getValueFromInsert(line, "idFuncionario");

                        Funcionario func = null;
                        if (idFuncStr != null && !idFuncStr.equals("-1")) {
                            func = funcionarioDAO.buscarPorId(Integer.parseInt(idFuncStr));
                        }
                        cartoesDoCliente.add(new Cartao(id, cliente, numeroCartao, vencimento, codSeguranca, bloqueado, func));
                    } catch (Exception e) {
                         System.err.println("Erro ao parsear cartão (para cliente) da linha: " + line + " - " + e.getMessage());
                    }
                }
            }
        }
        return cartoesDoCliente;
    }
}