import java.util.ArrayList;
import java.util.Scanner;
/*
 * Um trabalhador autônomo deseja controlar suas finanças, comprou um microcomputador 
 * para controlar o rendimento diário de seu trabalho.
	A) Toda vez que ele vende um valor maior que o estabelecido pelo regulamento de MEI do 
	estado onde vive (500,00 R$ dia) deve pagar um multa de R$ 0,10 a cada Real excedente.
	B) Este trabalhador precisa que você faça um programa em Java que leia o valor de todas 
	as vendas do mês e verifique se há excesso (vendeu mais de 500,00 por dia).
	C) Se houver excesso, gravar na variável E (Excesso) e na variável M o valor da multa 
	que o Trabalhador deverá pagar.
	D) Caso contrário mostrar tais variáveis com o conteúdo ZERO.
Desenvolva uma aplicação Java Orientada a Objetos e as classes necessárias para resolver o
 problema.
O sistema deve conter um menu com no mínimo as seguintes opções
1 - cadastro de vendas
2 - consulta de imposto a pagar no mês (com base no mês e no ano das vendas).
0 - Sair.
 */
public class Main {
	public static void main(String args[]) {
		ArrayList<Venda> vendas = new ArrayList<>();
		double maxVenda = 500.00;
		Scanner sc = new Scanner(System.in);
		String menu = "1 - cadastro de vendas \n"
				+ "2 - consulta imposto (multa) \n"
				+ "0 - Sair\n";
		int option = 0;
		do {
			System.out.println("O deseja fazer?\n"+menu);
			option = sc.nextInt();
			switch(option) {
			case 1: 
				Venda v = new Venda();
				System.out.println("Digite o ano da venda");
				v.setAno(sc.nextInt());
				System.out.println("Digite o mes da venda");
				v.setMes(sc.nextInt());
				System.out.println("Digite o valor da venda");
				v.setValor(sc.nextDouble());
				vendas.add(v);
				break;
			case 2: 
				System.out.println("Digite o ano que deseja consultar");
				int ano = sc.nextInt();
				System.out.println("Digite o mes que deseja consultar");
				int mes = sc.nextInt();
				double total = 0.0;
				for(Venda item : vendas) {
					if (item.getAno() == ano && item.getMes() == mes) {
						total += item.getValor();
					}
				}
				System.out.println("O total de vendas é "+ total);
				if (total > maxVenda) {
					double E = total - maxVenda;
					int excedente = (int) E;
					double M = 0.1 * excedente;
					System.out.println("O valor de multa (imposto a ser pago) é " + M);
				}
				break;
			case 0: 
				System.out.println("Fim de execução...");
			}
			
		}while(option != 0);
	}
}
