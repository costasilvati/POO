import java.util.Scanner;

/*
 * Desenvolva uma aplicação em Java, simulando uma rotina de venda. 
 * Onde para cada produto informado, leia: nome, preço e quantidade, 
 * escreva o nome do produto comprado e o valor total a ser pago, 
 * considerando que são oferecidos descontos pelo número de unidades 
 * compradas, segundo a tabela abaixo:
 * 
 * Quantidade		Desconto
 * <= 10 unidades 		0% 
 * 11 a 20 unidades 	10% 
 * 21 a 50 unidades 	20%
 * >50 unidades 		25%
 */
public class Ex1 {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o nome do produto");
		String nome = leitor.next();
		leitor.reset();
		System.out.println("Digite o preço do produto: " + nome);
		double preco = leitor.nextDouble();
		leitor.reset();
		System.out.println("Digite a quantidade vendida do produto: " + nome);
		int qtd = leitor.nextInt();
		leitor.reset();
		double total = (preco * qtd);
		if(qtd > 10 && qtd <= 20) {
			System.out.println("O valor total da compra é " + (total - (total * 0.1)) );
		}else if(qtd > 20 && qtd <= 50) {
			System.out.println("O valor total da compra é " + (total - (total * 0.2)) );
		}else if(qtd > 50) {
			System.out.println("O valor total da compra é " + (total - (total * 0.25)) );
		}
		
	}
}
