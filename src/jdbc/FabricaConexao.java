package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
    public static Connection getConexao(){
        try {
            String url = "jdbc:mysql://localhost/curso_java?" +
                    "verifyServerCertificate=false&useSSL=true";
            String usuario = "root";
            String senha = "Egdcqf1961!";

            return DriverManager.getConnection(url, usuario, senha);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
