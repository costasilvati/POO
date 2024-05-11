import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String args[]) {
		// Criar um array de Forma2D
		ArrayList<Forma2D> formas = new ArrayList<>();

		int opt = 0;
		// Adicionar Triangulos e retangulos ao array
		do {

			opt = Integer.parseInt(JOptionPane.showInputDialog(
					"Opções \n 1- Cadastrar Forma\n" + "2 - Listar Formas cadastradas \n" + "0 - Sair"));
			if (opt == 1) {
				int opt2 = Integer
						.parseInt(JOptionPane.showInputDialog("1- Cadastrar Triangulo \n" + "2 - Cadastrar Retangulo"));
				switch (opt2) {
				case 1:
					Triangulo triangulo = new Triangulo();
					triangulo.setNome(JOptionPane.showInputDialog("Digite o nome do Triangulo"));
					double tmp = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do Triangulo"));
					triangulo.setAltura(tmp);
					tmp = 0.0;
					tmp = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do Triangulo"));
					triangulo.setLargura(tmp);
					triangulo.setStyle(JOptionPane.showInputDialog("Digite o estilo do Triangulo"));
					formas.add(triangulo);
					break;
				case 2:
					Retangulo retangulo = new Retangulo();
					retangulo.setNome(JOptionPane.showInputDialog("Digite o nome do Retangulo"));
					retangulo
							.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do Retangulo")));
					retangulo.setLargura(
							Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do Retangulo")));
					formas.add(retangulo);
					break;
				}
			} else if (opt == 2) {
				int opt3 = Integer.parseInt(JOptionPane.showInputDialog(
						"1- Visualizar Triangulo \n" + "2 - Visualizar Retangulo \n" + "3 - Ver todas as formas"));
				String output = "";
				switch (opt3) {
				case 1:
					output = "";
					for (Forma2D forma : formas) {
						if (forma instanceof Triangulo) {
							output = output + "\n Nome: " + forma.getNome() 
							+ " - Área: " + forma.area();
						}
					}
					JOptionPane.showMessageDialog(null, output);
					break;
				case 2:
					output = "";
					for (Forma2D forma : formas) {
						if (forma instanceof Retangulo) {
							output = output + "\n Nome: " + forma.getNome() 
							+ " - Área: " + forma.area();
						}
					}
					JOptionPane.showMessageDialog(null, output);
					break;
				case 3:
					output = "";
					for (Forma2D forma : formas) {
						output = output + "\n Nome: " + forma.getNome() 
						+ " - Área: " + forma.area();
					}
					JOptionPane.showMessageDialog(null, output);
				}
			}

		} while (opt != 0);

		/*
		 * 20/05 - kahoot (0,25)
		 * 14/06 - avaliação objetiva (0,5)
		 * 17/06 - Apres. do Projeto Java (0,5)
		 * 21/06 - kahoot (0,25)
		 * 28/06 - Prova Integrada (0,5)
		 * 24/06 - Avaliação 2 (3,0)
		 */
	}

}
