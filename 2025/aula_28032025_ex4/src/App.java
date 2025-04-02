import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        // Instanciar um objeto Retangulo
        Retangulo retangulo1 = new Retangulo();
        // Preenchendo os atributos lado1 e lado2 
        System.out.println("Digite o lado 1 do Retangulo");
        retangulo1.setLado1(scan.nextFloat());
        System.out.println("Digite o lado 2 do Retangulo");
        retangulo1.setLado2(scan.nextFloat());
        // Usando os mátodos calcula área e perímetro
        System.out.println("A área do retangulo é: " + retangulo1.calculaArea());
        System.out.println("O perímetro do retangulo é: "+ retangulo1.calculaPerimetro());
    }
}
