package poo.aula10;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import poo.aula10.dao.PessoaDao;
import poo.aula10.model.Pessoa;
/**
 * root
 * @author costasilvati
 */
public class Aula10 {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome(JOptionPane.showInputDialog(null,"Digite o nome da Pessoa"));
        p.setEmail(JOptionPane.showInputDialog(null,"Digite o e-mail da Pessoa"));
        PessoaDao pDao = new PessoaDao();
        if(pDao.insertPessoa(p)){
            System.out.println("Pessoa: " + p.getNome() + " inserida com sucesso!");
        }else{
            System.out.println("Erro na inserção!");
        }
    }
}
