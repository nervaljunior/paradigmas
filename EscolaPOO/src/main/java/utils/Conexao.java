package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class Conexao {
    
    public static Connection getConexao() throws ClassNotFoundException {

        try {

            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3307/paradigmas","root","");
            System.out.println("Conectado com o banco com Sucesso");
            return connection;
        }catch(SQLException e){
            System.out.println("erro na conexão com o banco de dados \nErro:"+ e);
        }
        return null;

    }  


}
