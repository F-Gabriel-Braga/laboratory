package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306?verifyServerCertificate=false&useSSl=true";
        String usuario = "root";
        String senha = "";
        Connection conexao = null;
        conexao = DriverManager.getConnection(url, usuario, senha);
    }
}
