package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PessoaDao {
	Pessoa pessoa;
	FabricaConexao fc  = new FabricaConexao(
			"root", "jdbc:mysql://localhost/novo", "");

	// insert
	public void inserirPessoa(Pessoa p) {
		String sql = "INSERT INTO pessoa (nome, email)"
				+ "VALUES (?, ?)";
		try {
			PreparedStatement ps = 
					fc.getConnection().prepareStatement(sql);
			ps.setString(1, p.getNome());
			ps.setString(2, p.getEmail());
			int rowAffected = ps.executeUpdate();
			if(rowAffected == 1) {
				System.out.println("SUCESSO ao inserir Pessoa");
			}else {
				System.out.println("ERR - Linhas "+rowAffected);
			}
			
		}catch(SQLException e) {
			System.out.println("Erro ao inserir Pessoa");
		}
	}
	// search
	// update
	// delete
	

}
