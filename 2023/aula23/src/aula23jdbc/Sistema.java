package aula23jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sistema {
	public static void main(String args[]) {
		Connection conn = null;
		try {
		    conn = DriverManager.getConnection(
		    		"jdbc:mysql://localhost/mysql", "root", "");
		    System.out.println("Conectado");
		    conn.close();
		} catch (SQLException ex) {
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
	}

}
