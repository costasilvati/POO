import java.util.Scanner;

import javax.swing.JOptionPane;

public class Repeticao {

  public static void main(String[] args) {
    int option = 0;
    String textoMenu = "Digite o n�mero da op��o: \n"
        + "1 - Exibir for \n"
        + "2 - Exibir c�lculo \n"
        + "0 - Sair";
    
    Scanner reader = new Scanner(System.in);
    
    do {
      //System.out.println(textoMenu);
      //option = reader.nextInt();
      String digitado = JOptionPane.showInputDialog(null,textoMenu);
      option = Integer.parseInt(digitado);
      switch(option){
        case 1:
          String tabuada = 
          JOptionPane.showInputDialog(null,"Qual tabuada voc� quer ver?");
          int tabuadaInteiro = Integer.parseInt(tabuada);
          String resultado = "---- Tabuada------ \n";
          for(int cont = 0; cont <= 10; cont++) {
            resultado = resultado +
                tabuadaInteiro + " x " + cont + " = "+ (tabuadaInteiro * cont) + "\n";
          }
          JOptionPane.showMessageDialog(null, resultado);
          break;
        case 2:
          System.out.println("Voc� digitou 2");
          break;
        default:
          System.out.println("Voc� digitou um valor inv�lido");
      }
    }while(option != 0);
    System.exit(0);
  }
  
}
