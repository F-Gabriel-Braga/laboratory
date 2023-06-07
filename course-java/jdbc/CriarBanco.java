package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) throws SQLException {
        String bancoDeDados = "cursojava";
//        String url = "jdbc:mysql://127.0.0.1:3306?verifyServerCertificate=false&useSSl=true";
//        String usuario = "root";
//        String senha = "";
//
//        Connection conexao = null;
//        conexao = DriverManager.getConnection(url, usuario, senha);
        Connection conexao = FabricaConexao.abrirConexao();

        Statement declaracao = conexao.createStatement();
        String sql = String.format("CREATE DATABASE IF NOT EXISTS %s;", bancoDeDados);
        declaracao.executeUpdate(sql);
        conexao.close();
    }
}
