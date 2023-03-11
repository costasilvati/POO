package aula4;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Sistema {
	public static void main(String args[]) {
		String qtdS = JOptionPane.showInputDialog(null,
				"Digite a quantidade de alunos");
		int qtd = Integer.parseInt(qtdS);
		String alunos[] = new String[qtd];
		double notas[] = new double[qtd];
		double menorNota=0, maiorNota=0, soma=0;
		int i = 0;
		while(i < alunos.length) {
			alunos[i] = JOptionPane.showInputDialog(null, 
					"Digite o nome do aluno " + i);
			String notaTemp = JOptionPane.showInputDialog(null,
					"Digite a nota de " + alunos[i]);
			notas[i] = Double.parseDouble(notaTemp);
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
		String texto = "A média da turma é " + (soma/qtd) + "\n" + 
				"A maior nota é " + maiorNota + "\n" +
				"A menor nota é " + menorNota;
		JOptionPane.showMessageDialog(null, texto);
	}	
}
/* Crie um programa que receba a quantidade de alunos que 
 * o professor deseja registrar.
 * Guarde o nome e a nota de cada aluno em um vetor.
 * Calcule média, maior e menor nota da turma.*/