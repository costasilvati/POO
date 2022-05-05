/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package company.aula8;

/**
 *
 * @author LAB_E3
 */
public class Aula8 {                         

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Juliana Costas", "062.333.444-22");
        p1.setNome("Juliana Costa"); // editando nome
        System.out.println("Contador em p1 " + p1.getContador());
        Pessoa p2 = new Pessoa("blsalalal", "oioioioi");
        System.out.println("Contador em p2 " + p2.getContador());
        Aluno aluno1 = new Aluno("João", "123.456.789.00");
        System.out.println("---- ALUNO ---- "
                + "\n Nome: "+ aluno1.getNome() + "\n"
                        + "Matricula: " + aluno1.getMatricula());
        System.out.println("Contador de instancias da classe Pessoa:"
                + aluno1.getContador());
    }
}
