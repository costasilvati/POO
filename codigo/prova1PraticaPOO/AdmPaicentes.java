/*
No Java, os índices do array vão de 0 a n-1, onde n é o tamanho dado no momento em que você criou o array. Se você tentar acessar uma posição fora desse alcance, um erro ocorrerá durante a execução. (CAELUM, 2017).De posse dessas informações e dos estudos realizados, DESENVOLVA em linguagem Java um algoritmo que: 

1. Possua uma classe para cadastro de pacientes, com atributos (nome, caso e altura);
2. Dado um array, um contendo 20 pacientes, com todos os atributos preenchidos, calcule e exiba:
  2.1 A média de altura dos pacientes;
  2.2 Quantos pacientes possuem a altura abaixo da média;

Envie como resposta o código Java Desenvolvido

(600 pontos = 150 por item implementado)
 */
package admpaicentes;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class AdmPaicentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String menu = " Sistema de pacientes: \n\n"
                + "Digite o número da opção que deseja acessar \n\n"
                + "1 - Cadastrar Pacientes \n"
                + "2 - Ver pacientes cadastrados \n"
                + "3 - Ver média de altura \n"
                + "4 - Pacientes coma altura abaixo da média \n"
                + "0 - Sair do sistema";
        //Le a quantidade de pacientes e converte em inteiro
        int qtdPaciente = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Digite a quantidade de pacientes a cadastrar: (valor numérico) "));
        Paciente vetorPaciente[] = new Paciente[qtdPaciente];
        int option = 0;
        double media = 0.0;
        do {
            // Exibe menu para o usuário
            option = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            switch (option) {
                case 1: //1 - Cadastrar Pacientes
                    for (int i = 0; i < qtdPaciente; i++) {
                        Paciente pacienteTemp = new Paciente();
                        pacienteTemp.nome = JOptionPane.showInputDialog(null, "Digite o nome do paciente " + (i + 1));
                        pacienteTemp.caso = JOptionPane.showInputDialog(null, "Digite o Caso do paciente " + (i + 1));
                        pacienteTemp.altura = Double.parseDouble(
                                JOptionPane.showInputDialog(null, "Digite a ALTURA do paciente " + (i + 1)));
                        vetorPaciente[i] = pacienteTemp;
                    }
                    break;
                case 2: 
                    String lista = " ------- PACIENTES ------ \n";
                    for (int i = 0; i < qtdPaciente; i++) {
                       lista += vetorPaciente[i].toString() + " \n ------------------------ \n";
                    }
                    JOptionPane.showMessageDialog(null,lista);
                    break;
                case 3: //2 - Ver média de altura
                    double soma = 0.0;
                    for (int i = 0; i < qtdPaciente; i++) {
                        if(vetorPaciente[i] != null){
                            soma += vetorPaciente[i].altura;
                        }else{
                            JOptionPane.showMessageDialog(null,"Paciente " + (i+1) + " não esta cadastrado!");
                        }
                    }
                    media = soma/qtdPaciente;
                    JOptionPane.showMessageDialog(null,"A média de altura dos " + qtdPaciente + " pacientes é: " + media);
                    break;
                case 4:// 3 - Pacientes coma altura abaixo da média
                    int abaixo = 0;
                    for (int i = 0; i < qtdPaciente; i++) {
                        if (vetorPaciente[i].altura < media){
                            abaixo++;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"A média de altura dos pacientes é: " + media + " \n"
                            + "O número de pacientes abaixo da média de altura é " + abaixo);
                    break;
                case 0: //0 - Sair do sistema
                    System.exit(0);
                    break;
                default: // Nenhuma das opções acima
                    JOptionPane.showInputDialog(null, "Opção inválida! \n"
                            + "Digite valores numéricos indicados no menu."
                            + "Ou digite 0 para sair.");
            }

        } while (option != 0);
    }

}
