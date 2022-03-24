import java.util.Scanner;
import java.util.Random;

import javax.swing.JOptionPane;

public class Repeticao {

  public static void main(String[] args) {
    int option = 0;
    String textoMenu = "Digite o número da opção: \n"
        + "1 - Exibir for \n"
        + "2 - Teste o continue \n"
        + "3 - Testar vetores \n"
        + "4 - Testar matriz \n"
        + "0 - Sair";
    
    Scanner reader = new Scanner(System.in);
    
    do {
      //System.out.println(textoMenu);
      //option = reader.nextInt();
      String digitado = JOptionPane.showInputDialog(null,textoMenu);
      option = Integer.parseInt(digitado);
      switch(option){
        case 1://Se a opção for 1 
          String tabuada = 
          JOptionPane.showInputDialog(null,"Qual tabuada você quer ver?");
          int tabuadaInteiro = Integer.parseInt(tabuada);
          String resultado = "---- Tabuada------ \n";
          for(int cont = 0; cont <= 10; cont++) {
            resultado = resultado +
                tabuadaInteiro + " x " + cont + " = "+ (tabuadaInteiro * cont) + "\n";
          }
          JOptionPane.showMessageDialog(null, resultado);
          break;
          //Se a opção for 2
        case 2:
          //System.out.println("Testando continue para múltiplos de 2");
          int numero = 0;
          String saida = "";
          for (numero = 1; numero < 10; numero++) {
            if(numero%3 == 0) { 
                //break;
                continue;
            }
            saida += numero + " ";
            // saida = saida + numero + " ";
          }
          JOptionPane.showMessageDialog (null ,saida ,"Saida",JOptionPane . INFORMATION_MESSAGE );
          System.exit (0);
          break;
          // Opção 3
        case 3:
          String nomes [] = {"Juliana","Flavia","Lucas","Erik","Vander","Romario","Leonardo","Ruan","Henry","Paulo","Leonardo Z"};
          String inscritos = "\n";
          for(int x = 0; x < nomes.length; x++) {
            inscritos += nomes[x] + "\n";
          }
          JOptionPane.showMessageDialog(null, "Inscritos \n"  + inscritos);
          Random random = new Random();
          JOptionPane.showMessageDialog(null, nomes[random.nextInt(nomes.length)]);
          break;
        case 4:
          double notas[][]= new double[10][4];
          for(int linha = 0; linha < notas.length; linha++ ) {
            for(int coluna = 0; coluna < notas[linha].length; coluna++) {
              System.out.print(notas[linha][coluna] + "\t" );
            }
            System.out.println(" ");
          }
          break;
        default:
          String nome;
          //System.out.println("Você digitou um valor inválido");
          
          
          
      }
    }while(option != 0);
    System.exit(0);
  }
  
}
