// https://github.com/costasilvati/POO

public class Conta {
	// Atributos da classe conta
	int numero; 
	String nome; 
	double saldo;
	double limite;
	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}