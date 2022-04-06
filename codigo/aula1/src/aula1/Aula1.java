/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Scanner;
/* 
        Faça um algoritmo que imprima todos os
        multiplos de 3
        entre um determinado intervalo.
        Receba o valor inicial e final em tempo de 
        execução.
        */
        //https://costasilvati.github.io/POO/
/**
 *
 * @author Professor (a)
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o ínicio de um intervalo:");
        //String leitura1 = leitor.next();
        //int inicio = Integer.parseInt(leitura1);
        int inicio = Integer.parseInt(leitor.next());
        System.out.println("Digite o  fim do intervalo:");
        int fim = Integer.parseInt(leitor.next());
        
        System.out.println("O intervalo é " + inicio + " - " + fim);
        
        for (int i = inicio; i <= fim; i++) {
            if(i%3 == 0){
                System.out.println(i +" é multiplo de 3");
            }
            
        }
        
        
        
        
    }
    
}
