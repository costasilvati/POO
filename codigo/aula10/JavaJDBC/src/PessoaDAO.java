
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PessoaDAO {

    Pessoa pessoa = new Pessoa("");
    FabricaConexao fc = new FabricaConexao();
    Connection con = null;
    PreparedStatement prep = null;

    public boolean insert(Pessoa p) {
        boolean result = false;
        String sql
                = "INSERT INTO pessoa (nome, email) VALUES (?, ?)";
        System.out.println(sql);

        try {
            con = fc.getConnection();
            prep = con.prepareStatement(sql);
            prep.setString(1, p.getNome());
            prep.setString(2, p.getEmail());
            prep.execute();
            result = true;
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Encerra conexões
        try {
            if (prep != null) {
                prep.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Pessoa> listar() {
        List<Pessoa> lista = new ArrayList<Pessoa>();
        String sql = "SELECT * FROM pessoa";

        try {
            con = fc.getConnection();
            prep = con.prepareStatement(sql);
            ResultSet result = prep.executeQuery();
            while (result.next()) {
                String nome = result.getString("nome");
                Pessoa p = new Pessoa(nome);
                p.setId(result.getLong("id"));
                p.setEmail(result.getString("email"));
                lista.add(p);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Encerra conexões
        try {
            if (prep != null) {
                prep.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void update(Pessoa p) {
        String sql = "UPDATE pessoa "
                + "SET nome = ?, email = ? WHERE id = ?";
        Connection con = null;
        PreparedStatement prep = null;
        try {
            con = fc.getConnection();
            prep = con.prepareStatement(sql);
            prep.setString(1, p.getNome());
            prep.setString(2, p.getEmail());
            prep.setLong(3, p.getId());
            prep.execute();
        } catch (SQLException ex) {
            Logger.getLogger(
                    PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //Encerra conexões
            try {
                if (prep != null) {
                    prep.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void delete(Long id) {
        String sql = "DELETE FROM pessoa WHERE id = ?";

        try {
            con = fc.getConnection();
            prep = con.prepareStatement(sql);
            prep.setLong(1, id);
            prep.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //Encerra conexões
            try {
                if (prep != null) {
                    prep.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
