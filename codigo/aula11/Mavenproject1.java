package poo.mavenproject1;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB_E3
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
        
        String textoMenu = "---- MENU -----\n"
                + "\n"
                + "1 - Cadastrar produto \n"
                + "2 - Listar Produtos \n"
                + "3 - Calcular Venda \n"
                + "0 - Sair";
        String opcao = "0";
        
        do{
            opcao = JOptionPane.showInputDialog(null, textoMenu);
            switch(opcao){
                case "1":
                    Produto prod = new Produto();
                    //String cod = JOptionPane.showInputDialog(null, "Código do produto (númérico)");
                    //prod.setCodigo(Integer.parseInt(cod));
                    prod.setCodigo((listaProduto.size() + 1));
                    prod.setNome(JOptionPane.showInputDialog(null, "Nome do produto"));
                    String valor = JOptionPane.showInputDialog(null, "Valor do produto");
                    prod.setValor(Float.parseFloat(valor));
                    listaProduto.add(prod);
                    JOptionPane.showMessageDialog(null, listaProduto.size() + 
                            " produtos cadastrados!");
                    break;
                case "2":
                    String textoExibir = "--- Produtos Cadastrados ---\n";
                    for (int i = 0; i < listaProduto.size(); i++) {
                        Produto p = listaProduto.get(i);
                        textoExibir += p.toString() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, textoExibir);
                    break;
                case "3":
                    break;
            }
            
        }while(!opcao.equals("0"));
    }
}
