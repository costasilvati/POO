
public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private double bonificacao;
	
	// construtor
	public Funcionario(String nome, String cpf) { 
	  setNome(nome); 
	  this.cpf = cpf;
	}
	
	public Funcionario(String cpf) {
		this.cpf = cpf;
	}
	 
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calculaBonificacao() {
		return salario * bonificacao;
	}
	
	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		if(bonificacao < 0.01 || bonificacao > 1.0) {
			System.out.println("Valor inválido!\n"
					+ "Somente valores entre 0.01 e 1.0");
		}else {
			this.bonificacao = bonificacao;
		}
	}

	public String toString() {
		return "Nome: "+nome + "\n"
				+ "CPF: " + cpf + "\n"
				+ "Salário: "+ salario +"\n";
	}

}
