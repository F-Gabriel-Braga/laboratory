package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        String nome = entrada.nextLine();
        Connection conexao = FabricaConexao.abrirConexao();
        // Com o PreparedStatement você pode usar o setString(), setInt() ..
        PreparedStatement stmt = conexao.prepareStatement(String.format("INSERT INTO pessoas (nome) VALUES (?);", nome));
        stmt.setString(1, nome);
        stmt.execute();
        entrada.close();
    }
}