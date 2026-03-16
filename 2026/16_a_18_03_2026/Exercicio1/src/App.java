/*
Desenvolva uma aplicação Java para inicializar um array de inteiros de
tamanho 10, exibir esses valores na tela e pedir para o usuário digitar o valor
mínimo e máximo a ser buscado. Em seguida o programa deverá chamar
exibir na tela todos os valores de do vetor que estejam entre o valor mínimo e
máximo digitado pelo usuário. Lembre-se de exibir uma mensagem de erro
caso nenhum valor seja encontrado entre o mínimo e o máximo.
    */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int valores[] = new int[10];
        // Ler valores
        for(int i=0; i<10; i++){
            System.out.println(i + " Digite um número");
            valores[i] = sc.nextInt();
        }
        // Exibir valores
        for(int j=0; j<10; j++){
            System.out.print(" - "+ valores[j]);
        }
        System.out.println("\nDigite o valor minimo:");
        int minimo = sc.nextInt();
        System.out.println("Digite o valor maximo");
        int maximo = sc.nextInt();
        System.out.println("Valores dentro do intervalo");
        for(int x=0; x<10; x++){
            if(valores[x] >= minimo && valores[x] <= maximo){
                System.out.print(" - "+ valores[x]);
            }
        }

        sc.close(); // Sempre no fim do código
    }
}
