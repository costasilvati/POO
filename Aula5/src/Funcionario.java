import javax.swing.JOptionPane;

public class Funcionario {
	// Atributos da classe
	public String nome;
	public String cpf;
	public double salario;
	
	// métodos da classe
	public void getBonificacao() {
		double bonificacao = (salario * 0.05);
		// JOptionPane.showMessageDialog(null,"A bonificação é de 5% O salário de " + this.nome + "é R$" + this.salario + "O valor da bonificação é R$" + bonificacao);
		JOptionPane.showMessageDialog(null,"A bonificação é de 5% \n"
				+ "O salário de " + this.nome + "é R$" + this.salario + "\n"
						+ "O valor da bonificação é R$" + bonificacao);
	}
	// Sobrescrita do método getBonificacao
	public void getBonificacao(double percentual) {
		double bonificacao = (salario * (percentual/100));
		JOptionPane.showMessageDialog(null,"A bonificação é de" + 
		percentual +"% \n"
				+ "O salário de " + this.nome + " é R$" + this.salario + "\n"
						+ "O valor da bonificação é R$" + bonificacao);
	}
}
