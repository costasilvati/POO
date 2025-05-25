package view;

import controller.SistemaController;
import java.util.List;
import java.util.Scanner;
import model.Cartao;
import model.Cliente;
import model.Funcionario;

public class MenuView {
    private SistemaController controller;
    private Scanner scanner;

    public MenuView(SistemaController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenuPrincipal() {
        // Cadastrar um funcionário admin inicial se não houver nenhum
        if (controller.listarFuncionarios().isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado. Vamos cadastrar o administrador inicial.");
            System.out.print("Nome do admin: ");
            String nomeAdmin = scanner.next();
            System.out.print("Email do admin: ");
            String emailAdmin = scanner.next();
            System.out.print("Senha do admin: ");
            String senhaAdmin = scanner.next();
            controller.cadastrarFuncionario(nomeAdmin, emailAdmin, senhaAdmin);
            System.out.println("Administrador cadastrado. Por favor, faça o login.");
        }


        int opcao;
        do {
            System.out.println("\n### MENU PRINCIPAL ###");
            if (controller.getFuncionarioLogado() == null) {
                System.out.println("1. Login Funcionário");
            } else {
                System.out.println("Funcionário Logado: " + controller.getFuncionarioLogado().getNome());
                System.out.println("----------------------");
                System.out.println("2. Cadastrar Novo Funcionário");
                System.out.println("3. Cadastrar Novo Cliente");
                System.out.println("4. Cadastrar Novo Cartão para Cliente");
                System.out.println("5. Listar Funcionários");
                System.out.println("6. Listar Clientes");
                System.out.println("7. Listar Todos os Cartões");
                System.out.println("8. Listar Cartões de um Cliente Específico");
                System.out.println("9. Logout");
            }
            System.out.println("0. Sair do Sistema");
            System.out.print("Escolha uma opção: ");
            
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcao = -1; // Opção inválida para forçar mensagem de erro
            }


            if (controller.getFuncionarioLogado() == null) {
                switch (opcao) {
                    case 1:
                        loginFuncionario();
                        break;
                    case 0:
                        System.out.println("Saindo do sistema...");
                        scanner.close();
                        break;
                    default:
                        System.out.println("Opção inválida ou não permitida. Tente novamente.");
                }
            } else { // Funcionário está logado
                switch (opcao) {
                    case 2:
                        cadastrarNovoFuncionario();
                        break;
                    case 3:
                        cadastrarNovoCliente();
                        break;
                    case 4:
                        cadastrarNovoCartao();
                        break;
                    case 5:
                        listarFuncionarios();
                        break;
                    case 6:
                        listarClientes();
                        break;
                    case 7:
                        listarTodosCartoes();
                        break;
                    case 8:
                        listarCartoesDeCliente();
                        break;
                    case 9:
                        controller.logoutFuncionario();
                        break;
                    case 0:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        } while (opcao != 0);
        scanner.close();
    }

    private void loginFuncionario() {
        System.out.println("\n--- Login Funcionário ---");
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        if (controller.loginFuncionario(email, senha)) {
            System.out.println("Login bem-sucedido! Bem-vindo, " + controller.getFuncionarioLogado().getNome());
        } else {
            System.out.println("Email ou senha incorretos.");
        }
    }

    private void cadastrarNovoFuncionario() {
        System.out.println("\n--- Cadastrar Novo Funcionário ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        controller.cadastrarFuncionario(nome, email, senha);
    }

    private void cadastrarNovoCliente() {
        System.out.println("\n--- Cadastrar Novo Cliente ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF (somente números): ");
        String cpf = scanner.nextLine();
        System.out.print("UF (Ex: SP, RJ): ");
        String uf = scanner.nextLine().toUpperCase();
        controller.cadastrarCliente(nome, cpf, uf);
    }

    private void cadastrarNovoCartao() {
        System.out.println("\n--- Cadastrar Novo Cartão ---");
        System.out.print("ID do Cliente titular: ");
        int idCliente;
        try {
            idCliente = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("ID do cliente inválido.");
            return;
        }

        System.out.print("Número do Cartão (16 dígitos): ");
        String numeroCartao = scanner.nextLine();
        System.out.print("Data de Vencimento (MM/AA): ");
        String vencimento = scanner.nextLine();
        System.out.print("Código de Segurança (3 dígitos): ");
        String codSeguranca = scanner.nextLine();
        
        controller.cadastrarCartao(idCliente, numeroCartao, vencimento, codSeguranca);
    }

    private void listarFuncionarios() {
        System.out.println("\n--- Lista de Funcionários ---");
        List<Funcionario> funcionarios = controller.listarFuncionarios();
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (Funcionario f : funcionarios) {
                System.out.println(f);
            }
        }
    }

    private void listarClientes() {
        System.out.println("\n--- Lista de Clientes ---");
        List<Cliente> clientes = controller.listarClientes();
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente c : clientes) {
                System.out.println(c);
            }
        }
    }

    private void listarTodosCartoes() {
        System.out.println("\n--- Lista de Todos os Cartões ---");
        List<Cartao> cartoes = controller.listarCartoes();
        if (cartoes.isEmpty()) {
            System.out.println("Nenhum cartão cadastrado.");
        } else {
            for (Cartao c : cartoes) {
                System.out.println(c);
            }
        }
    }
    
    private void listarCartoesDeCliente() {
        System.out.println("\n--- Listar Cartões de um Cliente Específico ---");
        System.out.print("Digite o ID do Cliente: ");
        int idCliente;
        try {
            idCliente = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("ID do cliente inválido.");
            return;
        }

        Cliente cliente = controller.buscarClientePorId(idCliente);
        if (cliente == null) {
            System.out.println("Cliente com ID " + idCliente + " não encontrado.");
            return;
        }

        System.out.println("Cartões do Cliente: " + cliente.getNome() + " (ID: " + cliente.getId() + ")");
        List<Cartao> cartoes = controller.listarCartoesPorCliente(cliente);
        if (cartoes.isEmpty()) {
            System.out.println("Nenhum cartão encontrado para este cliente.");
        } else {
            for (Cartao cartao : cartoes) {
                System.out.println(cartao);
            }
        }
    }
}