/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.mavenproject1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author LAB_E3
 */
public class TestaArrayList {
    
    public void testaArrayList(){
        // Declaração e instanciação de ArrayList de Strings
        ArrayList<String> nomes = new ArrayList<String>();
        // Adicionando elementos no ArrayList
        nomes.add("Juliana");
        System.out.println("Tamanho do ArrayList " + nomes.size());
        String nomeNovo = "Lucas";
        nomes.add(nomeNovo);
        System.out.println("Tamanho do ArrayList " + nomes.size());
        nomes.add("Henry");
        System.out.println("Tamanho do ArrayList " + nomes.size());
        // Exibindo o ArrayList 
        System.out.println(nomes);
        // Exibindo um elemento do ArrayList
        System.out.println(nomes.get(0));// 0 é indice do array
        // Percorrer um ArrayList
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Valor na posição " + i + ": "+nomes.get(i));
        }
        // Percorrer um ArrayList [2] - for each
        for (String item : nomes){
            System.out.println("Nome: " + item);
        }
        //Ediatr ArrayList indíce e novo valor
        nomes.set(0, "Juliana Costa");
        // Verificar tamanho do ArrayList
        System.out.println(nomes.size());
        // Ordenando ArrayList
        Collections.sort(nomes);
        System.out.println(nomes);
        // Remover um elemnto
        nomes.remove(0); // Com índice
        // String elemento = nomes.get(0);
        //nomes.remove(elemento); // Com objeto
        // System.out.println(nomes);
        // Remover todos os elementos de um ArrayList
        nomes.clear();
    }
    
}
