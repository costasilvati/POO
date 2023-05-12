import java.util.Scanner;

public class Sistema {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Sistema de Concursos \n"
				+ "Digite seu usuário para fazer login");
		String id = sc.next();
		Funcionario func1 = new Funcionario("Juliana", "12345678900");
		
		Autenticacao autenticacao = new Autenticacao();
		autenticacao.autenticaUsuario(func1, id);

//		Candidato c1 = new Candidato();
//		c1.setCpf("12345678900");
//		c1.setRespostas(new char[]
//				{'A', 'B', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E'});
//		Candidato c2 = new Candidato();
//		c2.setCpf("12345678901");
//		c2.setRespostas(new char[]
//				{'A', 'C', 'C', 'D', 'E', 'A', 'C', 'C', 'D', 'E'});	
//		Concurso concurso1 = new Concurso();
//		concurso1.adicionaCandidato(c1);
//		concurso1.adicionaCandidato(c2);
//		//concurso1.removerCandidato("12345678900");
//		concurso1.addRespostas();
//		System.out.println(concurso1.getGabarito()[0]);
//		concurso1.corrigirProvas();
		
	}
}
