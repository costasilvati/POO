import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		// Classe (tipo) nome da variável = instanciação
		String texto = "Exibe as opções do menu";
		double nome[] = new double[10];
		Conta contas[] = new Conta[10];
		int option = 0; // Variável de opção
		do {
			// Opções IF + ELSE IF ou Switch case
		}while(option != 0);
		
		Conta conta1 = new Conta();
		Scanner sc = new Scanner(System.in);
		// Criar conta
		System.out.println("Digite o nome do titular da conta");
		conta1.nome = sc.next();
		System.out.println("Digite o número da conta");
		conta1.numero = sc.nextInt();
		System.out.println("Digite o saldo da conta");
		conta1.saldo = sc.nextDouble();
		System.out.println("Digite o limite da conta");
		conta1.limite = sc.nextDouble();
		System.out.println("Nome: " + conta1.nome +"\n"
				+ "Número da conta: " + conta1.numero + "\n"
				+ "Saldo: " + conta1.saldo + "\n"
				+ "Limite: " + conta1.limite);
		contas[0] = conta1;
		// Realizar saque
		System.out.println("Digite o valor do saque");
		double valorSaque = sc.nextDouble();
		conta1.sacar(valorSaque);
		System.out.println("Seu novo saldo é R$"+ conta1.saldo + 
				"\n - Seu limite disponível é R$"+ conta1.limite);
		// Realizar depósito
		System.out.println("Digite o valor do depósito");
		double valorDeposito = sc.nextDouble();
		conta1.depositar(valorDeposito);
		System.out.println("Seu novo saldo é R$" + conta1.saldo +
				" \n - Seu limite disponível é R$" + conta1.limite);
		// Conta 2
		// Criar conta
		Conta conta2 = new Conta();
		System.out.println("Digite o nome do titular da conta");
		conta2.nome = sc.next();
		System.out.println("Digite o número da conta");
		conta2.numero = sc.nextInt();
		System.out.println("Digite o saldo da conta");
		conta2.saldo = sc.nextDouble();
		System.out.println("Digite o limite da conta");
		conta2.limite = sc.nextDouble();
		System.out.println("Nome: " + conta2.nome +"\n"
				+ "Número da conta: " + conta2.numero + "\n"
				+ "Saldo: " + conta2.saldo + "\n"
				+ "Limite: " + conta2.limite);
		// PIX
		System.out.println("Qual o valor do Pix de conta1 para conta2?");
		double valorPix = sc.nextDouble();
		conta1.pix(conta2, valorPix);
		System.out.println("Conta1 - Seu novo saldo é R$" + conta1.saldo +
				" \n - Seu limite disponível é R$" + conta1.limite);
		System.out.println("Conta 2 - Seu novo saldo é R$" + conta2.saldo +
				" \n - Seu limite disponível é R$" + conta2.limite);
		
		sc.close();
	}
}
