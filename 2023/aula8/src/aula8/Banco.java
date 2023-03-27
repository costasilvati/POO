package aula8;

import java.util.Scanner;
import java.util.ArrayList;

public class Banco {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Conta> listaConta = new ArrayList<>();
		String menu = "--- Banco ---\n"
				+ "1 - Cadastrar Conta \n"
				+ "2 - Listar Contas \n"
				+ "3 - Editar Conta \n"
				+ "0 - Sair";
		int option = 0;
		do {
			System.out.println(menu);
			option = sc.nextInt();
			sc.reset();
			
			switch(option) {
				case 1:
					// --- Cria e alimenta objeto Conta
					Conta c = new Conta();// instanciou objeto
					System.out.println("Digite o nome do cliente");
					c.setTitular(sc.next()); // Lê e passa parametro
					sc.reset();
					System.out.println("Digite o CPF do titular");
					c.setCpfTitular(sc.next());
					sc.reset();
					System.out.println("Digite o Agência da conta");
					c.setAgencia(sc.next());
					sc.reset();
					System.out.println("Digite o número da Conta");
					c.setNumeroConta(sc.next());
					sc.reset();
					c.setSaldo(0.0);
					c.setLimite(100.0);
					listaConta.add(c);// Adiciona no Array
					break;
				case 2:
					System.out.println(
							"Ag. \t Conta \t CPF \t Titular \t Saldo \t Limite");
					for(Conta item : listaConta) {
						System.out.println(item.toString()); // Exibe os dados do objeto
					}
					break;
				case 3:
					System.out.println("EDITAR - Função não impelemntada");
					break;
				case 0:
					System.out.println("Encerrando o sistema...");
					break;
				default:
					System.out.println("Opção Inválida");
			}
		}while(option != 0);
		sc.close();
	}
}