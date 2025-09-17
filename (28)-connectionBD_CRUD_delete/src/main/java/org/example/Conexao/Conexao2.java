package org.example.Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao2 {//Singleton
    //Teremos varias conexões com a base de dados
   private  Connection conexao=null;
   private  String server = "oracle.fiap.com.br";
   private  String port="1521";
   private  String sid="ORCL";
   private  String url = "jdbc:oracle:thin:@"+ server +":" + port +":" +sid;
   private  String user = "PF2058";
   private  String password="fiap25";

    public  Connection recuperaConexao() throws SQLException {
        //Realiza a conexao com a base
        if (conexao == null && conexao.isClosed()) {
            //caso conexao não exista
           conexao= DriverManager.getConnection(url, user, password);
            //gero uma nova conexao
        }
        return conexao;//retorno a conexao
    }
}
