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
				+ "0 - Sair";
		ArrayList<Conta> contas = new ArrayList<>();
		int option = 0; // Variável de opção
		do {
			System.out.println(textoMenu); // exibe Menu
			System.out.println("Digite a opção desejada"); 
			option = sc.nextInt(); // Lê a opção
			if(option == 1) {
				// Cria cliente
				Cliente cli = new Cliente();
				System.out.println("Nome do cliente");
				cli.setNome(sc.next());
				System.out.println("CPF do cliente");
				cli.setCpf(sc.next());
				System.out.println("Celular do cliente");
				cli.setCelular(sc.next());
				// Criar conta
				Conta conta1 = new Conta(); // instancia objeto
				conta1.setCliente(cli);
				System.out.println("Digite o número da conta");
				int n = sc.nextInt();
				conta1.setNumero(n);
				System.out.println("Digite o saldo da conta");
				conta1.setSaldo(sc.nextDouble());
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
				Conta cOrigem = new Conta(); 
				Conta cDestino = new Conta();// duas contas
				for(Conta itemConta: contas) {
					if(itemConta.getNumero() == nContaOrigem) {
						cOrigem = itemConta;
					}else if(itemConta.getNumero() == nContaDestino) {
						cDestino = itemConta;
					}
				}
				//Ler valor
				cOrigem.pix(cDestino, 0.0);
				
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