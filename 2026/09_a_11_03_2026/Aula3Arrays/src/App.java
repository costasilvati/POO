import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String meses[] = {"Janeiro", 
                          "Fevereiro",
                          "Março", 
                          "Abril",
                          "Maio",
                          "Junho",
                          "Julho",
                          "Agosto",
                          "Setembro",
                          "Outubro",
                          "Novembro",
                          "Dezembro"};
        Scanner sc = new Scanner(System.in); // leitor do teclado
        System.out.println("Digite um número entre 1 e 12");
        int digitado = sc.nextInt();
        // Exiba a qual mês o número digitado se refere (somente de 1 a 12)
        sc.close(); // Sempre no final do código
    }
}
