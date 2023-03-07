package aula3;

import java.util.Scanner;

public class Sistema {
	public static void main(String []args) {
		// Menu com 4 opções se receber 0 sai.
		String menu = "Escolha uma opção\n"
				+ " ---- MENU ----\n"
				+ "1 - Tabuada do número escolhido \n"
				+ "2 - Testando continue \n"
				+ "3 - Utilizando Arrays \n"
				+ "0 - SAIR";
		
		Scanner leitor = new Scanner(System.in);
		int option = 0; 
		
		do {
			System.out.println(menu);
			option = leitor.nextInt();
			switch(option) {
			case 1: // Tabuada com FOR
				System.out.println(
					"Digite um número e visualize a sua tabuada");
				int tabuada = leitor.nextInt();
				for(int i = 1; i <= 10; i++) {
					System.out.println(
							tabuada + "x"+i+" = "+(tabuada * i));
				}
				break;
			case 2: 
				for(int i= 0; i<=100; i++) {
					if(i%3 == 0) {
						System.out.print(i);
					}
					else {
						continue;
					}
					System.out.println(" Próximo valor");
				}
				break;
			case 3:
				System.out.println("Digite 10 nomes para colocar no array");
				String nomes[] = new String[10]; // inicia o array
				for(int i = 0; i < nomes.length; i++) {
					System.out.println("Digite o nome da posição " + i);
					nomes[i] = leitor.next();
				}
				System.out.println("Nome digitados \n" + nomes.toString());
				break;
			case 0:
				System.out.println("Saindo do sistema");
				break;
			default:
				System.out.println("Valor digitado é inválido!");
			}
		}while(option!=0);
		leitor.close();
	}
	/* Presença
	Marco
	Marcelo
	Igor
	Giancarlo
	Leonardo
	Guilherme Santos
	João Fonseca
	Wellington
	Leonardo Bueno
	João Neneve
	Nataly
	Gabriel Rugila
	João A.
	Pablo Sanches
	Matheus Balico
	Bianca
	Thiago
	Otávio
	Alex
	Antonio
	Joni
	*/
}



