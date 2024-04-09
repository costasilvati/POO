import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String textoMenu = " --- BANCO ---- \n"
				+ "1 - Cadastrar conta; \n"
				+ "2 - Listar contas; \n"
				+ "3 - Saque; \n"
				+ "4 - Depósito \n"
				+ "5 - PIX; \n"
				+ "6 - Detalhar Conta\n"
				+ "7 - Cadastrar Cliente \n"
				+ "0 - Sair";
		ArrayList<Conta> contas = new ArrayList<>();
		ArrayList<Cliente> clientes = new ArrayList<>();
		int option = 0; // Variável de opção
		do {
			System.out.println(textoMenu); // exibe Menu
			System.out.println("Digite a opção desejada"); 
			option = sc.nextInt(); // Lê a opção
			if(option == 1) { // Cadastrar Conta
				/*
				 * 1. Ler o CPF do cliente
				 * 2. Percorrer o array de clientes até encontrar um cliente com o CPF digitado
				 * 3. Guardar o obj em uma variável cliente
				 * 4. Associar a variável a conta;
				 */
				// Parametros do construtor de Conta	
				System.out.println("Digite o número da conta");
				int n = sc.nextInt();
				System.out.println("Digite o saldo da conta");
				double saldo = sc.nextDouble();
				// Criar conta
				Conta conta1 = new Conta(cli); // instancia objeto
				System.out.println("Digite o limite da conta");
				conta1.setLimite(sc.nextDouble());
				System.out.println(conta1.toString());
				// Adiciona itens no ArrayList
				contas.add(conta1);
			}else if(option == 2) {
				// Listar contas == percorrer um ArrayList
				for(Conta itemConta : contas) {
					System.out.println(itemConta.toString());
				}
			}else if(option == 3) {
				// pegar o número da conta
				System.out.println("--- SAQUE --- \n"
						+ "Digite o número da conta:");
				int nContaSaque = sc.nextInt();
				// recupera o obj conta
				for(Conta itemConta: contas) {
					if(itemConta.getNumero() == nContaSaque) {
						System.out.println("Saldo atual R$" +itemConta.getSaldo());
						System.out.println("Digite o valor do saque:");
						double valorSaque = sc.nextDouble();
						itemConta.sacar(valorSaque);
						System.out.println("Saldo atualizado R$" +itemConta.getSaldo());
					}
				}
			}else if(option== 4) {
				System.out.println("-- DEPÓSITO --- \n"
						+ "Digite o número da conta");
				int nContaDeposito = sc.nextInt();
				for(Conta itemConta: contas) {
					if(itemConta.getNumero() == nContaDeposito) {
						System.out.println("Saldo atual R$" +itemConta.getSaldo());
						System.out.println("Digite o valor a ser depositado");
						double valorDep = sc.nextDouble();
						itemConta.depositar(valorDep);
						System.out.println("Saldo atualizado R$" +itemConta.getSaldo());
					}
				}
			}else if (option == 5) { // PIX
				System.out.println("-- PIX --- \n"
						+ "Digite o número da conta de origem ");
				int nContaOrigem = sc.nextInt();
				System.out.println("Digite o número da conta destino");
				int nContaDestino = sc.nextInt();
				Conta cOrigem = null; 
				Conta cDestino = null;// duas contas
				for(Conta itemConta: contas) {
					if(itemConta.getNumero() == nContaOrigem) {
						cOrigem = itemConta;
					}else if(itemConta.getNumero() == nContaDestino) {
						cDestino = itemConta;
					}
				}
				//Ler valor
				if(cOrigem != null & cDestino != null) {
					cOrigem.pix(cDestino, 0.0);
				}else {
					System.out.println("Uma ou duas das contas não foi encontrada");
				}
			}else if (option == 6) {
				System.out.println("** DETALHAR CONTA ---"
						+ "\n Digite o número da conta");
				int nConta = sc.nextInt();
				//System.out.println(contas.get(nConta));// usando índice do array
				for(Conta itemConta: contas) {
					if(itemConta.getNumero() == nConta) {
						System.out.println(itemConta.toString());
					}
				}
			}else if(option == 7) {
				// Cadastra Cliente
				Cliente cli = new Cliente();
				System.out.println("Nome do cliente");
				cli.setNome(sc.next());
				System.out.println("CPF do cliente");
				cli.setCpf(sc.next());
				System.out.println("Celular do cliente");
				cli.setCelular(sc.next());
				System.out.println("E-mail do cliente");
				cli.setEmail(sc.next());
				System.out.println("Nascimento dd/mm/aaaa");
				cli.setNascimento(sc.next());
				System.out.println("Endereço: Rua,número, CEP, Cidade, UF");
				cli.setEndereco(sc.next());
				clientes.add(cli); // Adicionando Cliente ao ArrayList clientes
			}
			
		}while(option != 0);

		/*
		 * // Realizar saque 
		 * System.out.println("Digite o valor do saque"); double
		 * valorSaque = sc.nextDouble(); 
		 * conta1.sacar(valorSaque);
		 * System.out.println("Seu novo saldo é R$"+ conta1.saldo +
		 * "\n - Seu limite disponível é R$"+ conta1.limite); 
		 * // Realizar depósito
		 * System.out.println("Digite o valor do depósito"); double valorDeposito =
		 * sc.nextDouble(); conta1.depositar(valorDeposito);
		 * System.out.println("Seu novo saldo é R$" + conta1.saldo +
		 * " \n - Seu limite disponível é R$" + conta1.limite); // Conta 2 // Criar
		 * conta Conta conta2 = new Conta();
		 * System.out.println("Digite o nome do titular da conta"); conta2.nome =
		 * sc.next(); System.out.println("Digite o número da conta"); conta2.numero =
		 * sc.nextInt(); System.out.println("Digite o saldo da conta"); conta2.saldo =
		 * sc.nextDouble(); System.out.println("Digite o limite da conta");
		 * conta2.limite = sc.nextDouble(); System.out.println("Nome: " + conta2.nome
		 * +"\n" + "Número da conta: " + conta2.numero + "\n" + "Saldo: " + conta2.saldo
		 * + "\n" + "Limite: " + conta2.limite); // PIX
		 * System.out.println("Qual o valor do Pix de conta1 para conta2?"); double
		 * valorPix = sc.nextDouble(); conta1.pix(conta2, valorPix);
		 * System.out.println("Conta1 - Seu novo saldo é R$" + conta1.saldo +
		 * " \n - Seu limite disponível é R$" + conta1.limite);
		 * System.out.println("Conta 2 - Seu novo saldo é R$" + conta2.saldo +
		 * " \n - Seu limite disponível é R$" + conta2.limite);
		 */
		sc.close();
	}
}