import javax.swing.JOptionPane;

public class Principal {

	public static void main(String args[]) {
		int qtdLista = 1;
		Funcionario listaFuncionarios[] = new Funcionario[qtdLista]; 
		for(int i=0; i < qtdLista; i++) {
			listaFuncionarios[i] = new Funcionario();
			String nome = JOptionPane.showInputDialog(null,
					"Digite o nome do funcionario: " + (i+1));
			listaFuncionarios[i].nome = nome;
			listaFuncionarios[i].cpf = JOptionPane.showInputDialog(null,
					"Digite o CPF do funcionario: " + (i+1));
			String salarioTexto = JOptionPane.showInputDialog(null, 
					"Digite o salário do funcionario: " + (i+1));
			double salarioDouble = Double.parseDouble(salarioTexto);
			listaFuncionarios[i].salario = salarioDouble;
			listaFuncionarios[i].getBonificacao();
			listaFuncionarios[i].getBonificacao(10);
		}	
	}
}