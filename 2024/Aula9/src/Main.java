import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// Declaração + instanciação
		Conta minhaConta = new Conta();
		// Número
		System.out.println("Número da conta:");
		int numero = sc.nextInt();
		minhaConta.setNumero(numero);
		// Nome
		System.out.println("Nome do titular");
		minhaConta.setNome(sc.next());
		// Saldo
		System.out.println("Saldo da conta:");
		double saldo = sc.nextDouble();
		minhaConta.setSaldo(saldo);
		// Limite
		System.out.println("Limite da conta");
		double limite = sc.nextDouble();
		minhaConta.setLimite(limite);
		
		Conta conta2 = new Conta();
		conta2.setNome("Maria");
		conta2.setSelic(0.5);
		
		System.out.println(conta2.toString());
		System.out.println(minhaConta.toString());
		
		Conta conta3 = new Conta();
		conta3.setNome("conta3");
		System.out.println(conta3.toString());
		
		
		
		
		
		Conta c1 = new Conta();
		//c1.nome = "Juliana"; // atributos public
		c1.setNome("Juliana"); // atributos private
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}