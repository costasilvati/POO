import java.util.Scanner;
/* 
 * Os valores de Fibonacci formam uma sequência em que cada 
 * número é igual à soma dos dois anteriores. Os dois primeiros 
 * elemntos da sequência são, por padrão iguais a 1, como no exemplo 
 * abaixo:
 *     Ex: 1 1 2 3 5 8 13...
 * Desenvolva uma aplicação em Java que receba um número inteiro pelo 
 * e informe se ele faz parte da sequência de Fibonacci.
 */
public class Ex2 {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número");
		int numero = leitor.nextInt();
		leitor.reset();
		int anterior;
		for(int i = 1; i < numero; i++) {
			if(i != 1) {
				
			}else {
				anterior = i + i;
			}
		}
	}
}
