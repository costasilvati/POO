/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package company.aula8;

/**
 *
 * Wander
 * Leonardo Zanini
 * Ruan
 * Henry
 * Romário
 * Flavia 
 * Lucas
 * Andre
 * Ivo
 * Paulo
 * Luan?
 * Leonardo
 * @author LAB_E3
 */
public class Aluno extends Pessoa{
    private String matricula;
    
    
    public Aluno(String nome, String cpf){
        super(nome, cpf);
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
}
