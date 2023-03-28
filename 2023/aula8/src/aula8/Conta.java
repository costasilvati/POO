package aula8;

public class Conta {
	private String titular; // nome do cliente
	private String cpfTitular;
	private String agencia; // num. agencia do banco
	private String numeroConta;
	private double saldo;
	private double limite;
	
	// get: ler um atributo do objeto
	public String getTitular() {
		return this.titular;
	}
	// set: editar um atributo do objeto
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getCpfTitular() {
		return this.cpfTitular;
	}
	
	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}
	
	public String getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public String getNumeroConta() {return this.numeroConta;}
	
	public void setNumeroConta(String numeroConta) {this.numeroConta = numeroConta;}
	
	public double getSaldo() {return this.saldo;}
	
	public void setSaldo(double saldo) {this.saldo =saldo;}
	
	public double getLimite() {return this.limite;}
	
	public void setLimite(double limite) {this.limite = limite;}
	
	public String toString() {
		String texto = this.agencia +
				" \t " + this.numeroConta +
			"\t" + this.cpfTitular + 
			"\t" + this.titular + 
			"\t" + this.saldo +
			"\t" + this.limite;
		return texto;
	}
}
