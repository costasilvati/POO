import java.util.Scanner;
import java.util.ArrayList;

public class Sistema {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> cardapio = new ArrayList<>();
		String menu = "---- Lanchonete ----- \n"
				+ "1 - Cadastrar Produtos \n"
				+ "2 - Ver cardápio \n"
				+ "3 - Cadastrar pedidos\n"
				+ "4 - Listar pedidos realizados\n"
				+ "0 - Sair";
		int op = 0;
		do {
			System.out.println(menu);
			op = sc.nextInt();
			sc.reset();
			switch(op) {
			case 1: 
				System.out.println("Qual o tipon do produto?\n"
						+ "1 - pizza \n"
						+ "2 - hamburguer \n"
						+ "3 - bebida");
				String tipo = sc.next();
				sc.reset();
				if(tipo.equals("1")) {
					Pizza pizza = new Pizza();
					System.out.println("Nome da pizza");
					pizza.setNome(sc.next());
					sc.reset();
					System.out.println("Tamanho");
					pizza.setTamanho(sc.nextInt());
					System.out.println("Valor");
					pizza.setValor(sc.nextDouble());
					String ing = "sair";
					do {
						System.out.println("Digite o ingrediente ou sair para sair");
						ing = sc.next();
						sc.reset();
						if(!ing.equals("")) {
							pizza.addIngrediente(ing);
						}
					}while(!ing.equals("sair"));
					pizza.toString();
					cardapio.add(pizza);
				}else if(tipo.equals("2")) {
					Hamburguer hamburguer = new Hamburguer();
					System.out.println("Nome da Hamburguer");
					hamburguer.setNome(sc.next());
					sc.reset();
					System.out.println("Tamanho");
					hamburguer.setTamanho(sc.nextInt());
					System.out.println("Valor");
					hamburguer.setValor(sc.nextDouble());
					String ing = "";
					do {
						System.out.println("Digite o ingrediente ou ENTER para sair");
						ing = sc.next();
						sc.reset();
						if(!ing.equals("")) {
							hamburguer.addIngrediente(ing);
						}
					}while(!ing.equals(""));
					hamburguer.toString();
					cardapio.add(hamburguer);
				}else if(tipo.equals("3")) {
					Bebida bebida = new Bebida();
					System.out.println("Nome da Bebida");
					bebida.setNome(sc.next());
					sc.reset();
					System.out.println("Tamanho");
					bebida.setTamanho(sc.nextInt());
					System.out.println("Valor");
					bebida.setValor(sc.nextDouble());
					System.out.println("Tipo");
					bebida.setTipo(sc.next());
					sc.reset();
					System.out.println("Temperatura");
					bebida.setTemperatura(sc.next());
					sc.reset();
					cardapio.add(bebida);
				}else {
					System.out.println("Opção invalida");
				}
				
				break;
			case 2:
				for(Produto p : cardapio) {
					System.out.println(p.toString());
				}
				break;
			case 3:
				break;
			case 4: 
				break;
			default:
				System.out.println("Opção inválida!");
			}
		}while(op != 0);
		
	}
}
