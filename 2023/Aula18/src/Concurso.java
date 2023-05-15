import java.util.ArrayList;
import java.util.Scanner;

public class Concurso {
	private char[] gabarito = new char [10];
	private ArrayList<Candidato> candidatos;
	
	public Concurso() {
		this.candidatos = new ArrayList<>();
	}
	
	public char[] getGabarito() {
		return gabarito;
	}
	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}
	public void setCandidatos(ArrayList<Candidato> candidatos) {
		this.candidatos = candidatos;
	}
	
	public void adicionaCandidato(Candidato candidato) {
		String cpfNovo = candidato.getCpf();
		boolean existe = false;
		for(Candidato c: candidatos) {
			if(cpfNovo.equals(c.getCpf())) {
				System.out.println("CPF " + cpfNovo + " já esta cadastrado!");
				existe = true;
				break;
			}
		}
		if(!existe) {
			candidatos.add(candidato);
			System.out.println(cpfNovo + " Casastrado com sucesso!!");
		}
	}
	
	public void removerCandidato(String cpf) {
		for(Candidato c: candidatos) {
			if(cpf.equals(c.getCpf())) {
				System.out.println("CPF " + cpf + " removido com sucesso!");
				candidatos.remove(c);
				break;
			}
		}
	}
	
	
	public void addRespostas() {
		char validos [] = {'A', 'B', 'C', 'D', 'E'};
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i <gabarito.length; i++) {
			boolean ok = true;
			do {
				System.out.println("Digite o gabarito da questão " + (i+1));
				char resp = sc.next().charAt(0);
				sc.reset();
				for(int j= 0; j < validos.length; j++) {
					if(resp == validos[j]) {
						ok = false;
						gabarito[i] = resp;
						break;
					}
				}
				//System.out.println("Caracter inválido (Deve ser entre A - E");
			}while(ok);
		}
		sc.close();
	}
	
	public void corrigirProvas() {
		for(Candidato c : candidatos) {
			int acertos = 0;
			for(int i=0; i< gabarito.length; i++) {
				if(gabarito[i] == c.getRespostas()[i]) {
					acertos++;
				}
			}
			System.out.println("Candidato: " + c.getNome() + "\t Acertos: " 
			+ acertos);
		}
	}
	
	public void imprimirCandidatos() {
		for(Candidato c : candidatos) {
			int acertos = 0;
			for(int i=0; i< gabarito.length; i++) {
				if(gabarito[i] == c.getRespostas()[i]) {
					acertos++;
				}
			}
			System.out.println(c.toString() + "Acertos: "+ acertos);
		}
	}
	
	public void exibirErros(String cpf) {
		for(Candidato c : candidatos) {
			if(c.getCpf().equals(cpf)) {
				for(int i=0; i < gabarito.length; i++) {
					if(c.getRespostas()[i] == gabarito[i]) {
						System.out.println("Questão "+(i+1) + "Correto");
					}else {
						System.out.println("Questão "+(i+1) + "Incorreto");
					}
				} 
			}
		}
	}
	
	
}
