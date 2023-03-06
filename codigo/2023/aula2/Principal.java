import java.util.Scanner;

public class Principal {
    public static void main(String []args) {
        // Exercício incremento
        int i =10;
        int j = 2;
        int x = 0;
        int y = 0;
        j++; // pós incremento
        ++i; // pré incremento
        x = i++ + j;
        y = ++j + ++i;
        // Exemplo de concatenção com o operado +
        System.out.println("X = "+ x + "\t Y = " + y);
        /*
         * Leia 3 valores que representam o lado de um triângulo
         * e diga se o triangulo é isóceles, equilatero, escaleno.
         */
        // Leitura de dados do usuário
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o lado A do triangulo");
        float ladoA = leitor.nextFloat();
        System.out.println("Digite o lado B do triangulo");
        float ladoB = leitor.nextFloat();
        System.out.println("Digite o lado C do triangulo");
        float ladoC = leitor.nextFloat();
        System.out.println(ladoA +" "+ladoB + " " + ladoC )
        //float soma = ladoA + ladoB;
        if(ladoA == ladoB && ladoB == ladoC) {
            System.out.println("Equilatero");
        }else if(ladoA != ladoB && ladoB != ladoC) {
            System.out.println("Escaleno");
        }else {
            System.out.println("Isóceles");
        }
        leitor.close();
    }

}