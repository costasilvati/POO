import java.util.Scanner;



public class Sistema {

	public static void main(String[] args) {
		
		
		System.out.println("2 + 5 = "+2+5);
		System.out.println("2 + 5 = "+ (2+5));
		

		System.out.println("Digite um número:");

		Scanner leitor = new Scanner(System.in); // Variável de leitura do teclado	

		int num1 = 8;//leitor.nextInt(); // Executa a leitura de um inteiro

		if(num1 > 10){

			System.out.println(num1 + " é maior que 10!");

		}else {

			System.out.println(num1 + " é menor que 10!");

		}

		// Operador ternário

		System.out.println("Digite a nota e veja o conceito:");

		int nota = leitor.nextInt();

		System.out.println(nota >= 7 ? "Aprovado" : "Reprovado");

		

		

		// Switch

		System.out.println("Digite um valor para o switch");

		int option = leitor.nextInt();

		switch(option) {

			case 1:

				System.out.println("UM..");

				break;

			case 2:

				System.out.println("DOIS..");

			default:

				System.out.println("Default");

		}

		

		leitor.close();

	}

}