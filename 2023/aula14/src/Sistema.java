import java.util.Scanner;

public class Sistema {
	public static void main(String args[]) {
		Biblioteca biblioteca = new Biblioteca();
		String textoMenu =" --- Bibliotecas -- \n"
				+ "1 - Adiciona livro \n"
				+ "2 - Listar Livros"
				+ "0 - Sair";
		Scanner sc = new Scanner(System.in);
		int option = 0;
		do {
			System.out.println(textoMenu);
			option = sc.nextInt();
			switch(option) {
			case 1: 
				Livro livro = new Livro(); // Usando Construtor vazio
				System.out.println("Digite o título do livro");
				livro.setTitulo(sc.next());
				sc.reset();
				System.out.println("Digite o autor do livro");
				livro.setAutor(sc.next());
				sc.reset();
				System.out.println("Digite o número do exemplar do livro");
				livro.setNumeroExemplar(sc.nextInt());
				sc.reset();
				livro.setDisponivel(true);
				biblioteca.adicionaLivro(livro); 
				break;
			case 2:
				biblioteca.listarAcervo();
				break;
			case 0:
				break;
			}
		}while(option != 0);
	}
}
