package challenges0305;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Gera um labirinto aleatório de tamanho 10x10
		//int[][] labirinto = gerarLabirinto(10, 10);
		int labirinto1[][] = {
				{1,1,1,1,1,1,1,1,1,1}, //linha1
				{1,0,0,1,1,0,1,0,1,1}, //linha 2
				{1,0,0,1,0,0,1,0,1,1}, // linha 3
				{1,0,0,0,1,0,0,0,1,1}, // linha 4
				{1,0,0,1,0,0,1,0,0,1}, // linha 5
				{1,0,0,0,0,0,1,0,1,1}, // linha 6
				{1,1,0,0,0,0,1,0,1,1}, // linha 7
				{1,0,0,1,1,0,1,0,1,1}, // linha 8
				{1,0,1,0,1,0,0,0,0,1}, // linha 9
				{1,1,1,1,1,1,1,0,1,1}, // linha 10
		};
		

		// Cria um novo robô
		Robo robo = new Robo(1, 1);

		// Usa o robô para encontrar a saída do labirinto
		int passos = robo.encontrarSaida(labirinto1);

		System.out.println("O robô encontrou a saída em " + passos + " passos.");
	}

	// Método para gerar um labirinto aleatório
	public static int[][] gerarLabirinto(int linhas, int colunas) {
		int[][] labirinto = new int[linhas][colunas];
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				// Gera um número aleatório entre 0 e 1
				labirinto[i][j] = Math.random() < 0.5 ? 0 : 1;
			}
		}
		// Garante que a posição inicial (0,0) e a posição final (linhas-1, colunas-1)
		// sejam 0
		labirinto[0][0] = 0;
		labirinto[linhas - 1][colunas - 1] = 0;
		return labirinto;
	}

}
