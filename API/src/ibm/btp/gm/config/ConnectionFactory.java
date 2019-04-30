package ibm.btp.gm.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {
    private final static String DRIVER = "org.postgresql.Driver";
    private final static String URL = "jdbc:postgresql://9.86.181.222:5432/Hospital";
    private final static String USERNAME = "postgres";
    private final static String PASSWORD = "admin";
    
    public static Connection getConnection() {
        Connection conexao = null;
        try {
            Class.forName(DRIVER);                       
            conexao = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexao;
    }
}
