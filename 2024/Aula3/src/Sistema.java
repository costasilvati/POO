import java.util.Scanner;
import javax.swing.JOptionPane;

public class Sistema {
	public static void main(String[] args) {
		// Leitor
		Scanner sc = new Scanner(System.in);
		int option = 0;
		String
		textoMenu = "-- Selecione uma opção ---\n"
				+ "1 - Exemplo WHILE \n"
				+ "2 - Exemplo de DO WHILE \n"
				+ "3 - Exemplo de FOR \n"
				+ "4 - Classes Wrappers \n"
				+ "5 - Arrays \n"
				+ "0 - Sair";

		do{
			System.out.println(textoMenu);
			option = sc.nextInt();
			switch(option){
			case 1:
				System.out.println("Exemplo de while n < 10");
				int n = 0;
				while(n < 10) {
					System.out.print(n	+ "\t");
					n++;
				}
				break;
			case 2:
					System.out.println("Exemplo de do while");
					int n3 = 0;
					do{ 
						String texto = JOptionPane.showInputDialog("Digite um valor numérico");
						n3 = Integer.parseInt(texto);
					}while(n3 < 0); 
					break;
			case 3:
				// For com inicio e fim escolhidos pelo usuário\
				System.out.println("Posso exibir uma sequência numérica definida popr você"
				+"\nDigite o valor inicial da sequência");
				int ini = sc.nextInt();
				System.out.println("Digite o valor final da sequência");
				int fim = sc.nextInt();
				for(int cont = ini; cont <=fim; cont++) {
					System.out.print(cont + " - ");
				}
				System.out.println();
				break;
			case 4:
				System.out.println("Exemplo de classes Wrappers");
				boolean var1 = Boolean.valueOf("TRUE"); 
				System.out.println("Var1 = true: " + var1); 
				boolean var2 = Boolean.valueOf("False");
				System.out.println("Var2 = False: " + var2);
				boolean var3 = Boolean.valueOf("Yes");
				System.out.println("Var3 = Yes: " + var3);
				System.out.println("Digite uma palavra.");
				String palavra = sc.next(); 
				System.out.println("A terceira letra é: " + palavra.charAt(2));
				break;
			case 5: // Vetores == Array 
				String[] professores, salarios; // Todos são array 
				double notas[], media; // Apenas notas é array
				/* Receba a quantidade de alunos exitentes. 
				 * Registre para cada aluno, nome e nota (em array);*/
				System.out.println("Quantos alunos deseja cadstrar?"); 
				int qtd = sc.nextInt(); 
				notas = new double[qtd]; 
				String alunos[] = new String[qtd]; 
				for(int i = 0; i< (qtd+1); i++) { 
					System.out.println("Digite o nome do aluno "+ i); 
					alunos[i] = sc.next(); 
					System.out.println("Digite a nota do aluno " + i); 
					notas[i] = sc.nextDouble();
				}
			}

		}while(option != 0);
		sc.close();
	}

}