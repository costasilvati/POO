package view;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import model.FabricaConexao;
import controller.PessoaController;

import java.sql.ResultSet;


public class Sistema {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//FabricaConexao fc  = new FabricaConexao("root", "jdbc:mysql://localhost/novo", "");
			//Connection con = fc.getConnection();
		 	//con.close();
			System.out.println("Digite o nome da Pessoa");
			String nome = sc.nextLine();
			sc.reset();
			System.out.println("Digite o email da Pessoa");
			String email = sc.nextLine();
			sc.reset();
			PessoaController pControl = new PessoaController();
			pControl.addPessoa(nome, email);
		

	}
}

// Listar objetos pessoa
/* import java.util.ArrayList;
 * import java.sql.ResultSet; 
 *
 * 
 * // INSERT 
			String sql = "INSERT INTO pessoa (nome, email) VALUES (?, ?)";
			Pessoa p = new Pessoa("Meu nome", "email@email.com");
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, p.getNome());
			ps.setString(2, p.getEmail());
			boolean insert = ps.execute();
			if(!insert) {
				System.out.println("Inserido com sucesso");
			}else {
				System.out.println("Erro no comando INSERT");
			}
			
			LIST
			try {
			Connection con = DriverManager.getConnection(
					url, user, pass);
			System.out.println("Conectado!");
			ArrayList<Pessoa> listaPessoa = new ArrayList<>();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM pessoa"); 
			ResultSet resultado = ps.executeQuery(); 
			while(resultado.next()) { 
				Pessoa pTemp = new Pessoa(resultado.getString("nome"), 
										  resultado.getString("email"));
				pTemp.setId(resultado.getInt("id")); 
				listaPessoa.add(pTemp); 
			}
			System.out.println(listaPessoa);
			con.close();
		}catch(SQLException ex) {
			System.out.println("Erro ao conectar no banco"
		+ ex.getMessage());
		}
 */