// https://github.com/costasilvati/POO
public class Conta {
	private int numero; 
	private Cliente cliente; 
	private double saldo;
	private double limite;
	private static double selic;
	private Gerente gerente;
	
	//Construtor da classe
	// public NomeDaClasse com ou sem parametros
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.setSaldo(saldo);
	}
	// Sobrecarga de construtor
	public Conta(Cliente c) {
		this.cliente = c;
	}
	
	// get e set
	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getLimite() {
		return this.limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public static double getSelic() {
		return selic;
	}
	
	public static void setSelic(double s) {
		selic = s;
	}
	
	public Gerente getGerente() {
		return gerente;
	}
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	/* Ass. do método
	 * visibilidade + retorno + nome + parametros
	 */
	public double sacar(double valor) {
		if(valor <= this.saldo) {
			this.saldo = this.saldo - valor;
		}else if(valor <= (this.saldo + this.limite)) {
			double menosLimite = this.saldo - valor;
			this.saldo = 0.0;
			this.limite = menosLimite + this.limite;
		}else {
			System.out.println("Seu saldo + limite é: "+ 
						(this.saldo+this.limite) + "O saque de "+ valor +
						" não é permitido!");
		}
		return saldo;
	}
	
	public double depositar(double valorDeposito) {
		if(valorDeposito > 0.0) {
			this.saldo += valorDeposito;
			// this.saldo = this.saldo + valorDeposito;
		}else{
			System.out.println("Valor de depósito R$"+ valorDeposito  
								+" inválido \n Depoósito deve ser "
								+ "maior que R$ 0.0");
		}
		return this.saldo;
	}
	
	public void pix(Conta contaDestino, double valorPix) {
		this.sacar(valorPix);
		contaDestino.depositar(valorPix);
	}
	
	public String toString() {
		String stObjeto = "Cliente--- \n "+this.cliente.toString() +
				"\n Número da conta: " + this.numero +
				"\n Saldo: R$" + this.saldo +
				"\n Limite: R$" + this.limite;
		return stObjeto;
	}
	
}// Fecha chave da classe