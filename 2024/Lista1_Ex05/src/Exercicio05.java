/*
 * Para fazer um levantamento estatístico dos salários de seus funcionários, 
 * uma empresa precisa de um programa em Java:
 * - que leia uma lista contendo os salários dos funcionários da empresa. 
 * - Este programa deve exibir quantos funcionários ganham salário acima da média.
 *  - Considerando que não há um número fixo de funcionários, o programa deve perguntar
 *  no início da execução: quantos funcionários possui.
 */
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de funcionários");
		int tamanho = sc.nextInt();
		double soma = 0;
		double salarios[] = new double[tamanho];
		for(int i = 0; i < salarios.length; i++) {
			System.out.println("Digite o salário do funcionário "+ (i+1));
			salarios[i] = sc.nextDouble();
			soma += salarios[i];
		}
		
		double media = soma/tamanho;
		int acimaMedia = 0;
		
		for(int i = 0; i< salarios.length; i++) {
			if(salarios[i] > media) {
				acimaMedia++;
			}
		}
		System.out.println("A média salarial da empresa é "+media+"\n -- "+
				acimaMedia + " funcionários, recebem um salário acima de média");
		sc.close();
	}
}
