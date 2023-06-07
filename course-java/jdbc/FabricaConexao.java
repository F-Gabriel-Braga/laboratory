package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FabricaConexao {
    static String url = "jdbc:mysql://127.0.0.1:3306/cursojava?verifyServerCertificate=false&useSSl=true";
    static String usuario = "root";
    static String senha = "";
    static String bancoDeDados = "cursojava";

    public static Connection abrirConexao() {
        try {
            return DriverManager.getConnection(url, usuario, senha);
        }
        catch(SQLException e) {
            System.out.println("ERRO (Abrir Conexao): " + e.getMessage());
        }
        return null;
    }
}
