/*
Testes com String    */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = sc.nextLine(); // ler String 
        System.out.println("Você digitou um texto com "+nome.length() + " caracteres");
        System.out.println("Digite outro nome");
        String nome2 = sc.next();
        // Comparar até a caixa
        //if(nome.equals(nome2)){ // Considera a caixa
        if(nome.equalsIgnoreCase(nome2)){ // desconsidera caixa
            System.out.println("São iguais");
        }else{
            System.out.println("São diferentes");
        }
        String textoQuebrado[] = nome.split(",");
        System.out.println("tamanho do array: "+ textoQuebrado[0]);

        sc.close(); // Sempre no fim do código
    }
}
