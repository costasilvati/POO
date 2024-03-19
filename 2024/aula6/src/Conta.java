
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
		if(valor <= saldo) {
			saldo = saldo - valor;
		}else if(valor <= (saldo + limite)) {
			saldo = (saldo + limite) - valor;
			limite = (limite - saldo) - valor;
		}else {
			System.out.println("Seu saldo + limite é: "+ 
						(saldo+limite) + "O saque de "+ valor +
						" não é permitido!");
		}
		
		
		return saldo;
	}
	
}