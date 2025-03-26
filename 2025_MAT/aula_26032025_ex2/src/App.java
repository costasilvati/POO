import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        System.out.println("Digite um número:");
        calc.setNum1(scan.nextInt());
        System.out.println("Digite outro número:");
        calc.setNum2(scan.nextInt());

        System.out.println("\n--- Resultado das Operações ---");
        System.out.println(calc.getNum1()+ " + " + calc.getNum2() + ": "+ calc.soma());
        System.out.println(calc.getNum1()+ " - " + calc.getNum2() + ": "+ calc.subtracao());
        System.out.println(calc.getNum1()+ " * " + calc.getNum2() + ": "+ calc.multiplicacao());
        System.out.println(calc.getNum1()+ " / " + calc.getNum2() + ": "+ calc.divisao());
    }
}