import java.util.InputMismatchException;
import java.util.Scanner;
// Fig. 11.3: DivideByZeroWithExceptionHandling.java
// Handling ArithmeticExceptions and InputMismatchExceptions.
public class DividePorZero {
	
	   // domonstra tratamento da exceção
	   public static int verificaDivisao(int numerador, int denominador)
			   throws ArithmeticException {
	      return numerador / denominador; // possível divisão por zero
	   } 

	   public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in); 
	      boolean continueLoop = true; // determina se a input é necessária

	      do {                                                                
	         try { // lê dois números e calcula divisão                 
	            System.out.print("Digite o numerador: ");    
	            int numerador = scanner.nextInt();                            
	            System.out.print("Digite o denominador: ");  
	            int denominador = scanner.nextInt();                          
	                                                                          
	            int result = verificaDivisao(numerador, denominador);              
	            System.out.println("Result:" + numerador + "/" +  denominador +" = "+ result);                                     
	            continueLoop = false; // input successful; end looping        
	         }                                                              
	         catch (InputMismatchException inputMismatchException) {        
	            System.err.printf("%nException: %s%n",                       
	               inputMismatchException);                                  
	            scanner.nextLine(); // discarta a entrada, usuário digita novamente   
	            System.out.println(                                          
	               "Digite um valor inteiro. Tente novamente.");          
	         }                                                              
	         catch (ArithmeticException arithmeticException) {              
	            System.err.println("\nException: \n"+ arithmeticException);
	            System.out.println(                                          
	               "Zero é um denominador inválido. Tente novamente.");   
	         }                                                              
	      } while (continueLoop); 
	      scanner.close();
	} 
}

/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
