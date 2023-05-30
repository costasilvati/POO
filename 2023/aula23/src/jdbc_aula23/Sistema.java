package jdbc_aula23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Sistema {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/novo";
		String user = "root";
		String pass = "";
		Pessoa p1 = new Pessoa("ola2", "ola2");
		ArrayList<Pessoa> listaPessoa = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection(
					url, user, pass);
			System.out.println("Conectado!");
			//p1.inserirPessoa(con);
			listaPessoa = p1.listarPessoas(con);
			System.out.println(listaPessoa);
			con.close();
		}catch(SQLException ex) {
			System.out.println("Erro ao conectar no banco"
		+ ex.getMessage());
		}
		
	}

}
