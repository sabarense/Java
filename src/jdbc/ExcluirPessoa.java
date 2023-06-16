package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o código a ser excluido: ");
        int codigo = scanner.nextInt();

        Connection conexao = FabricaConexao.getConexao();
        String sqlDELETE = "DELETE FROM pessoas WHERE codigo > ?";

        PreparedStatement stmt = conexao.prepareStatement(sqlDELETE);
        stmt.setInt(1,codigo);

        int contador = stmt.executeUpdate();

        if(contador > 0){
            System.out.println("Pessoa excluída com sucesso!");
        }else{
            System.out.println("Nada feito.");
        }
        System.out.println("Linhas afetadas: " + contador);

        conexao.close();
        scanner.close();

    }
}
