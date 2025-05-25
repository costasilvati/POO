package controller;

import model.Funcionario;
import model.Cliente;
import model.Cartao;
import dao.FuncionarioDAO;
import dao.ClienteDAO;
import dao.CartaoDAO;
import java.util.List;

public class SistemaController {
    private FuncionarioDAO funcionarioDAO;
    private ClienteDAO clienteDAO;
    private CartaoDAO cartaoDAO;
    private Funcionario funcionarioLogado;

    public SistemaController() {
        this.funcionarioDAO = new FuncionarioDAO();
        this.clienteDAO = new ClienteDAO();
        this.cartaoDAO = new CartaoDAO();
        this.funcionarioLogado = null;
    }

    public boolean loginFuncionario(String email, String senha) {
        this.funcionarioLogado = funcionarioDAO.autenticarFuncionario(email, senha);
        return this.funcionarioLogado != null;
    }

    public void logoutFuncionario() {
        this.funcionarioLogado = null;
        System.out.println("Logout realizado com sucesso.");
    }

    public Funcionario getFuncionarioLogado() {
        return funcionarioLogado;
    }

    public boolean cadastrarFuncionario(String nome, String email, String senha) {
        if (funcionarioLogado == null) {
            // Permitir cadastro do primeiro funcionário mesmo sem login
            // ou ter uma lógica de admin inicial.
            // Para este caso, vamos permitir cadastro se for o primeiro ou se estiver logado.
            List<Funcionario> funcs = funcionarioDAO.listarTodos();
            if (!funcs.isEmpty()) {
                 System.out.println("Apenas funcionários logados podem cadastrar novos funcionários.");
                 return false;
            }
        }
        // Verificar se email já existe
        if (funcionarioDAO.autenticarFuncionario(email, "") != null && funcionarioDAO.autenticarFuncionario(email,senha) == null){ //Pode existir mas com outra senha
             for(Funcionario f : funcionarioDAO.listarTodos()){
                 if(f.getEmail().equalsIgnoreCase(email)){
                     System.out.println("Erro: Email já cadastrado para outro funcionário.");
                     return false;
                 }
             }
        }

        Funcionario novoFuncionario = new Funcionario(0, nome, email, senha); // ID será gerado pelo DAO
        funcionarioDAO.salvarFuncionario(novoFuncionario);
        System.out.println("Funcionário cadastrado com sucesso! ID: " + novoFuncionario.getId());
        return true;
    }
    
    public boolean cadastrarCliente(String nome, String cpf, String uf) {
        if (funcionarioLogado == null) {
            System.out.println("Erro: Nenhum funcionário logado. Faça o login para cadastrar clientes.");
            return false;
        }
        if (clienteDAO.buscarPorCpf(cpf) != null) {
            System.out.println("Erro: CPF já cadastrado.");
            return false;
        }

        Cliente novoCliente = new Cliente(0, nome, cpf, uf, funcionarioLogado); // ID será gerado
        clienteDAO.salvarCliente(novoCliente);
        System.out.println("Cliente cadastrado com sucesso! ID: " + novoCliente.getId());
        return true;
    }

    public boolean cadastrarCartao(int idCliente, String numeroCartao, String vencimento, String codSeguranca) {
        if (funcionarioLogado == null) {
            System.out.println("Erro: Nenhum funcionário logado. Faça o login para cadastrar cartões.");
            return false;
        }
        Cliente titular = clienteDAO.buscarPorId(idCliente);
        if (titular == null) {
            System.out.println("Erro: Cliente com ID " + idCliente + " não encontrado.");
            return false;
        }

        // Validação simples do número do cartão (ex: 16 dígitos)
        if (numeroCartao == null || !numeroCartao.matches("\\d{16}")) {
            System.out.println("Erro: Número do cartão inválido. Deve conter 16 dígitos.");
            return false;
        }
        // Validação do código de segurança (ex: 3 dígitos)
        if (codSeguranca == null || !codSeguranca.matches("\\d{3}")) {
            System.out.println("Erro: Código de segurança inválido. Deve conter 3 dígitos.");
            return false;
        }
        // Validação da data de vencimento (ex: MM/AA)
        if (vencimento == null || !vencimento.matches("(0[1-9]|1[0-2])\\/([0-9]{2})")) {
            System.out.println("Erro: Data de vencimento inválida. Use o formato MM/AA.");
            return false;
        }


        Cartao novoCartao = new Cartao(0, titular, numeroCartao, vencimento, codSeguranca, false, funcionarioLogado); // ID será gerado
        cartaoDAO.salvarCartao(novoCartao);
        System.out.println("Cartão cadastrado com sucesso! ID: " + novoCartao.getId() + " para o cliente " + titular.getNome());
        return true;
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarioDAO.listarTodos();
    }

    public List<Cliente> listarClientes() {
        return clienteDAO.listarTodos();
    }
    
    public Cliente buscarClientePorId(int id) {
        return clienteDAO.buscarPorId(id);
    }

    public List<Cartao> listarCartoes() {
        return cartaoDAO.listarTodos();
    }

    public List<Cartao> listarCartoesPorCliente(Cliente cliente) {
        if (cliente == null) {
            System.out.println("Cliente não fornecido para listar cartões.");
            return List.of();
        }
        return cartaoDAO.listarPorCliente(cliente);
    }
}