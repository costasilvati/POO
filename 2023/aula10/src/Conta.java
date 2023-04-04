public class Conta {
	private String agencia; // num. agencia do banco
	private String numeroConta;
	private double saldo;
	private double limite;
	
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
			"\t" + this.saldo +
			"\t" + this.limite;
		return texto;
	}
}