import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		// Classe (tipo) nome da variável = instanciação
		Conta conta1 = new Conta();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do titular da conta");
		conta1.nome = sc.next();
		System.out.println("Digite o saldo da conta");
		conta1.saldo = sc.nextDouble();
		System.out.println("Digite o número da conta");
		conta1.numero = sc.nextInt();
		System.out.println("Digite o limite da conta");
		conta1.limite = sc.nextDouble();
		System.out.println("Nome: " + conta1.nome +"\n"
				+ "Número da conta: " + conta1.numero + "\n"
				+ "Saldo: " + conta1.saldo + "\n"
				+ "Limite: " + conta1.limite);
		System.out.println("Digite o valor do saque");
		double valorSaque = sc.nextDouble();
		conta1.sacar(valorSaque);
		System.out.println("Seu novo saldo é: "+ conta1.saldo + 
				"Seu limite disponível é: "+ conta1.limite);
		// Conta 2
		/*
		Conta conta2 = new Conta();
		conta2.nome = "Outro nome";
		conta2.limite = 300.00;
		conta2.saldo = 500.00;
		conta2.numero = 2;
		System.out.println("Nome: " + conta2.nome +"\n"
				+ "Número da conta: " + conta2.numero + "\n"
				+ "Saldo: " + conta2.saldo + "\n"
				+ "Limite: " + conta2.limite);
		*/
		sc.close();
	}
}
