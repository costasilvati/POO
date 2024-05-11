import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String args[]) {
		ArrayList<Animal> animaisCadastrados = new ArrayList<>();
		// Menu para cadastrar animais
		// 1 - Cadastrar Animal (como preencher diferntes animais??)
		// 2 - Listar Animais
		// 3 - Mover Animal
		Scanner sc = new Scanner(System.in);
		String menu = "--- Sist. Animais --- \n" + "1 - Cadastrar Animal; \n" + "2 - Listar Animais cadastrados; \n"
				+ "3 - Registrar Movimento \n" + "4 - Editar Animal \n" + "0 - Sair.";
		int option = 0;
		do {
			System.out.println(menu);
			option = sc.nextInt();
			String menuTipoAnimal = "Selecione o tipo de animal\n" + "1 - Peixe\n" + "2 - Pássaro \n" + "3 - Anfíbio\n";
			switch (option) {
			case 1:
				String nome = JOptionPane.showInputDialog("Digite o nome do Animal");
				for (Animal aNome : animaisCadastrados) {
					while (aNome.getNome().equals(nome)) {
						nome = JOptionPane.showInputDialog(
								"Nome já cadastrado, digite outro nome \n" + "Digite o nome do Animal");
					}
				}
				System.out.println("Digite a localização (valor numérico)");
				double localizacao = sc.nextDouble();
				System.out.println("Digite a velocidade (km/h)");
				double velocidade = Double.parseDouble(sc.next());

				System.out.println(menuTipoAnimal);
				int tipoAnimal = sc.nextInt();
				switch (tipoAnimal) {
				case 1: // Peixe
					Peixe peixe1 = new Peixe(nome, localizacao);
					System.out.println("Peixe de água doce? (true ou false)");
					peixe1.setAguaDoce(sc.nextBoolean());
					peixe1.setVelocidade(velocidade);
					animaisCadastrados.add(peixe1);
					break;
				case 2: // Pássaro
					Passaro passaro1 = new Passaro(nome, localizacao);
					passaro1.setVelocidade(velocidade);
					animaisCadastrados.add(passaro1);
					break;
				case 3: // Anfíbio
					Anfibio anfibio1 = new Anfibio(nome, localizacao);
					anfibio1.setVelocidade(velocidade);
					animaisCadastrados.add(anfibio1);
				}
				break;
			case 2: // Listar animais cadastrados
				for (Animal a : animaisCadastrados) {
					System.out.println(a.toString());
				}
				break;
			case 3:
				for (Animal a : animaisCadastrados) {
					a.mover();
				}
				break;
			default:
				System.out.println("Opção inválida");
			}
		} while (option != 0);
		sc.close();
	}
}
