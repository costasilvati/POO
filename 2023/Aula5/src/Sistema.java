import java.util.Scanner;
import java.util.ArrayList;

public class Sistema {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		//ArrayList (Array Dinamico)
		ArrayList<String>cidades = new ArrayList<>();
		int op = 0;
		do {
			System.out.println("--- Menu ---- \n"
					+ "1 - Cadastrar cidade \n"
					+ "2 - Listar cidades \n"
					+ "3 - Remover cidade \n"
					+ "0 - Sair");
			op = leitor.nextInt();
			switch(op){
				case 1:
					System.out.println(
							"Digite o nome da cidade");
					// Adiciona elemento ao array
					cidades.add(leitor.next());
					leitor.reset();
					System.out.println(cidades.size() + " cadastradas");
					break;
				case 2: // Listando elementos
					for(String xuxu : cidades) {
						System.out.println(xuxu);
					}
					break;
				case 3:
					System.out.println(
							"Digite o nome da cidade que deseja remover");
					String nomeDig = leitor.next();
					leitor.reset();
					for(int i = 0; i < cidades.size(); i++) {
						if(cidades.get(i).equals(nomeDig)) {
							cidades.remove(i); // removendo elemento
							System.out.println("Deletado com sucesso!");
						}
					}
					break;
				default:
					System.out.println("Fim da execução");
			}
		}while(op != 0);
	}
}
