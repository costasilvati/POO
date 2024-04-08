import java.text.DecimalFormat;

public class Conta {
	private int numero;
	private String nome;
	private double saldo;
	private double limite;
	private static double selic;
	
	
	public static double getSelic() {
		return selic;
	}
	
	public static void setSelic(double s) {
		selic = s;
	}
	
	// Get = ver (pegar)
	// Set = Editar
	
	/* GET
	 * publico + 
	 * retorna o tipo do atributo + 
	 * nome é getAtributo + 
	 * não tem parâmetro
	 */
	public int getNumero() {
		return this.numero;
	}
	
	/* SET
	 * publico +
	 * retorna void +
	 * nome é setAtributo + 
	 * parâmetro é do tipo do atributo
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
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
	
	private String doubleParaReal(double numero) {
		DecimalFormat df = new DecimalFormat("#,###.00"); // Para 2 casas decimais
		String novoNumero = "R$ " + df.format(numero);
		return novoNumero;
	}
	
	// import java.text.DecimalFormat; (na linha 1)
	public String toString() {
		String texto = "Número: "+ this.numero +" \n"
				+ "Nome: " + this.nome + " \n"
				+ "Saldo: " + doubleParaReal(this.saldo) + " \n"
				+ "Limite: "+ doubleParaReal(this.limite)
				+ "Selic: "+ selic + "\n --------";
		return texto;
	}

}