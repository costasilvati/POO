
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @mYsQl#
 * @author julianacostasilva
 */
public class FabricaConexao {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/novo", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
