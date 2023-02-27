package poo.aula10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author costasilvati
 */
public class FabricaConexao {
    private String user;
    private String password;
    private String url;
    private String database;
    private static Connection conexao;
    
    public FabricaConexao(){ // construtor
        this.user = "root";
        this.password = "root";
        this.database = "topicos";
        this.url = "jdbc:mysql://localhost:3306/"+database;
    }
    
    public Connection getConnection(){
        try {
            this.conexao = DriverManager.getConnection(
                    this.url, this.user, this.password);
            System.out.println("Conectado ao banco de dados "+ this.url);
            return this.conexao;
            //conexao.close();
        } catch (SQLException ex) {
            System.out.println("ERRO ao conectar com o banco. \n" + ex);
            return null;
        }
    }
    
}
