package poo.aula10.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import poo.aula10.FabricaConexao;
import poo.aula10.model.Pessoa;

/**
 *
 * @author costasilvati
 */
public class PessoaDao {
    Pessoa pessoa;
    Connection conexao;
    PreparedStatement prepState;
    
    public boolean insertPessoa(Pessoa p){
        boolean resultado = false;
        String sql = "INSERT INTO pessoa (nome, email) VALUES (?, ?)";
        conexao = new FabricaConexao().getConnection();
        try {
            prepState = conexao.prepareStatement(sql);
            prepState.setString(1, p.getNome());
            prepState.setString(2, p.getEmail());
            resultado = prepState.execute();
            prepState.close();
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao criar Prepared Statement \n" + ex);
        }
        return resultado;
    }
    
}
