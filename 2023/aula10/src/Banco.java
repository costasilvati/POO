import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;

public class Banco {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Cliente> listaCliente = new ArrayList<>();
		
		String menu = "--- Banco ---\n"
				+ "1 - Cadastrar Conta \n"
				+ "2 - Cadastrar Cliente\n"
				+ "3 - Listar Contas \n"
				+ "4 - Listar Clientes \n"
				+ "5 - Editar Conta \n"
				+ "6 - Editar Cliente \n"
				+ "0 - Sair";
		int option = 0;
		do {
			System.out.println(menu);
			option = sc.nextInt();
			sc.reset();
			
			switch(option) {
				case 1:
					// --- Cria objeto Conta e add na lista
					if(listaCliente.size() > 0) {
						int cod = 0;
						System.out.println("Qual o cliente da conta?");
						for(Cliente c : listaCliente) {
							System.out.println(cod +" - " +c.getNome());
							cod++;
						}
						cod = sc.nextInt();
						Conta cont = new Conta();
						System.out.println("Número da Conta");
						cont.setNumeroConta(sc.next());
						sc.reset();
						System.out.println("Agencia da Conta");
						cont.setAgencia(sc.next());
						sc.reset();
						
						listaCliente.get(cod).addConta(cont);
						/* Idem ao comando acima
						Cliente cliConta = listaCliente.get(cod);
						cliConta.addConta(cont);
						listaCliente.set(cod, cliConta);
						*/
					}
					
					break;
				case 2:
					// --- Cria objeto Cliente e add na lista
					Cliente cli = new Cliente();
					System.out.println("Nome do cliente");
					cli.setNome(sc.next());
					sc.reset();
					System.out.println("Ano de nascimento do cliente");
					int ano = sc.nextInt();
					System.out.println("Mes de nascimento do cliente");
					int mes = sc.nextInt();
					System.out.println("Dia de nascimento do cliente");
					int dia = sc.nextInt();
					cli.getNascimento().set(ano, mes, dia);
					System.out.println("CPF do cliente");
					cli.setCpf(sc.next());
					sc.reset();
					System.out.println("Endereço do cliente");
					cli.setEndereco(sc.next());
					sc.reset();
					listaCliente.add(cli);
					break;
				case 3:
					for(Cliente c : listaCliente) {
						System.out.println(c.toString());
						for(Conta contaCli : c.getContas()) {
							System.out.println(contaCli.toString());
						}
					}
					break;
				case 4: 
					// Imprime objetos
					for(Cliente c : listaCliente) {
						System.out.println(c.toString());
					}
					break;
				case 5: 
					System.out.println("EDITAR - Função não impelemntada");
					break;
				case 6: 
					System.out.println("EDITAR - Função não impelemntada");
					/* DICA ---
					Cliente cliConta = listaCliente.get(cod);
					cliConta.addConta(cont);
					listaCliente.set(cod, cliConta);
					*/
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
