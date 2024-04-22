
public class Main {
	public static void main(String args[]) {
		Funcionario func1 = new Funcionario("Julaina", "000");
		Gerente g1 = new Gerente("José Souza","12345678900");
		// Usa método herdado de Funcionario
		System.out.println(g1.toString());
		g1.autenticar(123);
		g1.toString();
		g1.setSalario(5600.9);
		g1.setBonificacao(0.1);
		func1.setBonificacao(0.05);
		func1.setSalario(2300.5);
		System.out.println("Bonificação de gerente: "+ g1.calculaBonificacao());
		System.out.println("Bonificação de funcionário: "+ func1.calculaBonificacao());
	}
}
