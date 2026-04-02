/* Crie também uma outra classe, que possui um método principal e que
instancie um objeto da classe criada, e que realiza as operações
disponibilizadas pelo objeto.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int option = 5;
        Calculadora calc = new Calculadora();

        do{
            System.out.println("-- Calculadora -- \n"
                          + "1 - soma \n"
                          + "2 - subtraçao \n"
                          + "3 - multiplicação \n"
                          + "4 - divisão \n " 
                          + "5 - Sair \n ------------- ");
            option = sc.nextInt();
            if(option != 5){
                System.out.println("Digite um valor inteiro");
                calc.setValor1(sc.nextInt());
                System.out.println("Digite OUTRO valor inteiro");
                calc.setValor2(sc.nextInt());
            }
            switch (option) {
                case 1:
                    System.out.println(calc.getValor1()+" + "+calc.getValor2()+" = "+calc.soma());
                    break;
                case 2:
                    System.out.println(calc.getValor1()+" - "+calc.getValor2()+" = "+calc.subtracao());
                    break;
                case 3:
                    System.out.println(calc.getValor1()+" * "+calc.getValor2()+" = "+calc.multiplicacao());
                    break;
                case 4:
                    System.out.println(calc.getValor1()+" / "+calc.getValor2()+" = "+calc.divisao());
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(option != 5);
        sc.close(); // fechar o scanner  
    }
}
