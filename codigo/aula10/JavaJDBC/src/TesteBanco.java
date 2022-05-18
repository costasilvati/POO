
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julianacostasilva
 */
public class TesteBanco {

    public static void main(String[] args) {

        try {
            Connection connection = new FabricaConexao().getConnection();
            System.out.println("Conexão aberta!");
            
            String sql = "insert into pessoa (nome, email) values ('juliana', 'juliana.costa@ifpr.edu.br') ";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.execute();
            
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(TesteBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        String sql = "insert into contatos " +
//            "(nome,email,endereco, dataNascimento)" +
//            " values ('" + nome + "', '" + email + "', '" + 
//            endereco + "', '"+ dataNascimento +"')";

//       String sql = "insert into contatos " +
//                "(nome,email,endereco,dataNascimento) " +
//                "values (?,?,?,?)";

// PreparedStatement stmt = connection.prepareStatement(sql);
//    preenche os valores
//    stmt.setString(1, "Caelum");
//    stmt.setString(2, "contato@caelum.com.br");
//    stmt.setString(3, "R. Vergueiro 3185 cj57");
//    stmt.execute();
    }
}
