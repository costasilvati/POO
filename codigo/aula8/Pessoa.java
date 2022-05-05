/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company.aula8;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB_E3
 */
public class Pessoa {
    public int cod;
    private static int contador;
    private String nome;
    public String cpf;
    
    // construtor vazio (sem parametros)
//    public Pessoa(){ 
//        this.setContador();
//    }
    // Reescrita de construtor
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.setContador();
    }
    
    // editar contador
    private void setContador(){
        this.contador++;
    }
    
    public int getContador(){
        return this.contador;
    }
    
    public void setNome(String nome){
        // não conter @
        if(nome.contains("@")){
            JOptionPane.showMessageDialog(null, 
                 "ERRO! Nome Não pode conter @");
        }else{
            this.nome = nome;
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
}
