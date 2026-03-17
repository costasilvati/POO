import java.util.Scanner;
public class Ex1 {
    /*
Desenvolva uma aplicação Java para inicializar um array de inteiros de
tamanho 10, exibir esses valores na tela e pedir para o usuário digitar o valor
mínimo e máximo a ser buscado. Em seguida o programa deverá chamar
exibir na tela todos os valores de do vetor que estejam entre o valor mínimo e
máximo digitado pelo usuário. Lembre-se de exibir uma mensagem de erro
caso nenhum valor seja encontrado entre o mínimo e o máximo.
    */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int array1[] = new int[10];
        int array2[] = new int[10];
        int array3[] = new int[10]; // intersecção
        // Ler valores array1
        for(int i=0; i<10; i++){
            System.out.println(i + " Digite um número");
            array1[i] = sc.nextInt();
            System.out.println(i + " Digite um número do array 2");
            array2[i] = sc.nextInt();
        }
        
        sc.close(); // Sempre no fim do código
    }
}
