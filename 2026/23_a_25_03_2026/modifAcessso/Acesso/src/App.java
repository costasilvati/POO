import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        Conta conta1 = new Conta();
        System.out.println("Digite o nome");
        String n = sc.next(); // lendo do teclado
        conta1.setNome(n); // usando set
        //conta1.setSaldo(1000); // saldo só deve ser editado com saque ou depósito
        conta1.setNumero(2); // atributo private só pode ser acessado via médtodo
        System.out.println("O nome digitado  é: " + conta1.getNome());
        // Conta 2
        Conta conta2 = new Conta();
        conta2.setNumero(6);
        // Visualiza contas
        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
        Conta conta3 = new Conta();
        System.out.println(conta3.toString());
        sc.close();// fechar o scanner
    }
}
