package DAO;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {
    
        //1.  Metodo responsavel por estabelecer a conexap com o banco
    public static Connection conector(){
        java.sql.Connection conexao = null;
        
        //chamar o driver 
        String driver  = "com.mysql.jdbc.Driver";
        
        //Armazenar informaçoes referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String senha = "marinez123";
        
        //Estabelecer conexao com o banco
        try {
            //CASO DÊ TUDO CERTO:
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, senha);
            return conexao;
        } catch (Exception e) {
            //CASO DÊ TUDO ERRADO:
            JOptionPane.showMessageDialog(null,"Erro de conexao: "+e.getMessage()); //mostra mensagem de erro
            return null;
        }
        
    }
}
