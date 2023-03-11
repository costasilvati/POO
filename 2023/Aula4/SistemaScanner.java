package aula4;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class SistemaScanner {
	/* Crie um programa que receba a quantidade de alunos que 
	 * o professor deseja registrar.
	 * Guarde o nome e a nota de cada aluno em um vetor.
	 * Calcule média, maior e menor nota da turma.*/
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a quantidade de alunos");
		int qtd = leitor.nextInt();
		String alunos[] = new String[qtd];
		double notas[] = new double[qtd];
		double menorNota=0, maiorNota=0, soma=0;
		int i = 0;
		while(i < alunos.length) {
			System.out.println("Digite o nome do aluno " + i);
			alunos[i] = leitor.next();
			leitor.reset();
			System.out.println("Digite a nota de " + alunos[i]);
			notas[i] = leitor.nextDouble();
			leitor.reset();
			if(i == 0) {
				maiorNota = notas[i];
				menorNota = notas[i];
			}else { 
				if(notas[i] > maiorNota) {
					maiorNota = notas[i];
				}
				if(notas[i] < menorNota) {
					menorNota = notas[i];
				}
			}
			soma += notas[i];
			i++;
		}
		leitor.close();
		String texto = "A média da turma é " + (soma/qtd) + "\n" + 
				"A maior nota é " + maiorNota + "\n" +
				"A menor nota é " + menorNota;
		System.out.println(texto);
	}	
}
