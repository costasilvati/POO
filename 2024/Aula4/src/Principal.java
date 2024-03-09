import java.util.Arrays;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) { // Assinatura do método
		Scanner leitor = new Scanner(System.in);
		
		int notas[]; // declaração
		notas = new int[10]; // instanciação
		// Como saber qual posição já foi preenchida??
		System.out.println("Array notas " + Arrays.toString(notas));
		String nomes[] = new String[10];
		nomes[1] = "";
		System.out.println("Array nomes " + Arrays.toString(nomes));
		
		if(nomes[1] == null) {} // Verificando se posição esta vazia
		
		// Declarar e popular um array simultaneamente
		String animais[] = {"Gato", "Cachorro", "Passaros"}; //Tudo junto
		double peso[] = {10.0, 20.0, 3.0};
		// Usando .length
		System.out.println("Quantos registros deseja fazer? "
							+ "(Digite um numero inteiro)");
		int qtd = leitor.nextInt();
		String registros[] = new String[qtd]; // Inicializou com qtd posições
		for(int i = 0; i < registros.length; i++) {
			System.out.println("Digite o registro " + i);
			registros[i] = leitor.next();
		}
		// Arrays multidimensionais
		double[][] valores;
		int linhas, colunas;
		System.out.println("Quantas LINHAS terá sua matriz?");
		linhas = leitor.nextInt();
		System.out.println("Quantas COLUNAS terá sua matriz?");
		colunas = leitor.nextInt();	
		valores = new double[linhas][colunas];
		System.out.println("A quantidade de linhas é "+ valores.length);
		System.out.println("A quantidade de colunas é "+ valores[0].length);
		// System.out.println(Arrays.toString(valores)); // End. de memória para 1 pos. de cada linha
		
		for(int l = 0; l < valores.length; l++) {
			for(int c=0; c < valores[l].length; c++) {
				System.out.println("Preencha a LINHA: " + l + " - COLUNA: "+ c);
				valores[l][c] = leitor.nextDouble();
			}
		}
		
		leitor.close(); // Fecha leitor
	}
}
