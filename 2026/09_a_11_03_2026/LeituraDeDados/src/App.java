import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Inicia o leitor

        System.out.println("Digite um número: "); // Exibe mensage,
        int numero = input.nextInt(); // Lê do teclado
        System.out.println("Você digitou o número "+ numero +"!!"); //
        System.out.println("Digite outro número: ");
        int numero2 = input.nextInt();
        
        int soma = numero + numero2;
        System.out.println("O resultado da soma é: "+ soma);

        input.close();// Fecha o leitor no fim do programa
    }
}
