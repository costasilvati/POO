package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	private String user;
	private String url;
	private String pass;
	private static Connection con;
	
	public FabricaConexao(String user, String url, String pass) {
		this.user = user;
		this.url = url;
		this.pass = pass;
	}
	
	public Connection getConnection() {
		if (con == null) {
			try {
				con = DriverManager.getConnection(
									url, user, pass);
				System.out.println(
						"Conexão com o banco de dados ok");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return con;
	}

}
