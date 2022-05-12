package company.aula9;

import javax.swing.JOptionPane;
import model.*;

/**
 *
 * @author LAB_E3
 */
public class Aula9 {

    public static void main(String[] args) {
        String opcao = "0";
        String textoMenu = "---- Menu ----- \n"
                + "Digite o código da opção desejada:\n \n"
                + "1 - Cadastrar País \n"
                + "2 - Cadastrar Estado \n"
                + "3 - Cadastrar Cidade \n"
                + "4 - Cadastrar Endereço \n"
                + "5 - Cadastrar Pessoa \n"
                + "6 - Listar Pessoas \n"
                + "0 - Sair";
        Pessoa pessoa = new Pessoa();
        Pais pais = new Pais();
        Estado estado = new Estado();
        Cidade cidade = new Cidade();
        Endereco endereco = new Endereco();
                
        do {
            opcao = JOptionPane.showInputDialog(null,textoMenu);
            switch (opcao) {
                case "1":
                    pais.setNome(JOptionPane.showInputDialog(null, "Digite o nome do País"));
                    pais.setDdd(JOptionPane.showInputDialog(null, "Digite o DDI"));
                    break;
                case "2":
                    estado.setNome(JOptionPane.showInputDialog(null, "Digite o nome do estado"));
                    estado.setCodIbge(JOptionPane.showInputDialog(null, "Código do IBGE do Estado"));
                    estado.setPais(pais);
                    break;
                case "3":
                    cidade.setNome(JOptionPane.showInputDialog(null,"Nome da Cidade"));
                    cidade.setCodIbge(JOptionPane.showInputDialog(null,"Código IBGE de " + cidade.getNome()));
                    cidade.setEstado(estado);
                    break;
                case "4":
                    endereco.setLogradouro(
                            JOptionPane.showInputDialog(null,"Rua, Av., etc..."));
                    int numero = Integer.parseInt(
                            JOptionPane.showInputDialog(null,"Número da residência"));
                    endereco.setNumero(numero);
                    endereco.setCep(JOptionPane.showInputDialog(null,"CEP do endereço"));
                    endereco.setComplemento(
                            JOptionPane.showInputDialog(null,"Complemento do endereço"));
                    endereco.setCidade(cidade);
                    break;
                case "5":
                    // Preencher dados de pessoa
                    pessoa.setNome(JOptionPane.showInputDialog(null, "Digite o nome: "));
                    pessoa.setCpf(JOptionPane.showInputDialog(null, "Digite o CPF: "));
                    pessoa.setRg(JOptionPane.showInputDialog(null, "Digite o RG: "));
                    pessoa.setEndereco(endereco);
                    break;

                case "6":
                    JOptionPane.showMessageDialog(null,pessoa.toString());
                    break;
                default:
            }
            //Lucas
            //Falvia
            // Leonardo RochA
            //wANDER
            // Lineker
            // Ivo
            // Ruan
            // Henry
            // Romario
            // Andre
        } while (!opcao.equals("0"));
    }
}
