package org.example.Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {//Singleton
    //Teremos apenas 1 conexao para todos os nossos elementos
   private static Connection conexao=null;//compartilhado pelos objetos pois é static
   private static final String server = "oracle.fiap.com.br";
   private static final String port="1521";
   private static final String sid="ORCL";
   private static final String url = "jdbc:oracle:thin:@"+ server +":" + port +":" +sid;
   private static final String user = "rm561713";
   private static final String password="290107";

    public static Connection recuperaConexao() throws SQLException {
        //Realiza a conexao com a base
        if (conexao == null) {
            //caso conexao não exista
           conexao= DriverManager.getConnection(url, user, password);
            //gero uma nova conexao
        }
        return conexao;//retorno a conexao
    }
}
