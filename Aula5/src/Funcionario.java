import javax.swing.JOptionPane;

public class Funcionario {
	// Atributos da classe
	public String nome;
	public String cpf;
	public double salario;
	
	// m�todos da classe
	public void getBonificacao() {
		double bonificacao = (salario * 0.05);
		// JOptionPane.showMessageDialog(null,"A bonifica��o � de 5% O sal�rio de " + this.nome + "� R$" + this.salario + "O valor da bonifica��o � R$" + bonificacao);
		JOptionPane.showMessageDialog(null,"A bonifica��o � de 5% \n"
				+ "O sal�rio de " + this.nome + "� R$" + this.salario + "\n"
						+ "O valor da bonifica��o � R$" + bonificacao);
	}
	// Sobrescrita do m�todo getBonificacao
	public void getBonificacao(double percentual) {
		double bonificacao = (salario * (percentual/100));
		JOptionPane.showMessageDialog(null,"A bonifica��o � de" + 
		percentual +"% \n"
				+ "O sal�rio de " + this.nome + " � R$" + this.salario + "\n"
						+ "O valor da bonifica��o � R$" + bonificacao);
	}
}
