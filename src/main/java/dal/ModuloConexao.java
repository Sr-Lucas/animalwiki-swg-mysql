package dal;

import java.sql.*;

public class ModuloConexao {

    public static Connection conector() {
        java.sql.Connection conexao = null;
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/dbanimals";
        String user = "root";
        String password = "docker";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            
            return conexao;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
}
