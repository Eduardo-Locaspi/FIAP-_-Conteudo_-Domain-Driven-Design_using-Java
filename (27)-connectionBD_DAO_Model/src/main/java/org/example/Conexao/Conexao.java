package org.example.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static Connection conexao = null;

    private  static final String server = "oracle.fiap.com.br";
    private static final String  port = "1521";
    private  static final String sid = "ORCL";
    private static final String url = "jdbc:oracle:thin:@"+server+":"+port+":"+sid;

    private static final String user = "rm561713";
    private static final String passwd = "290107";

    public static Connection recuperarConexao() throws SQLException {
        if (conexao ==null || conexao.isClosed()){
            return DriverManager.getConnection(url,user,passwd);}
        return conexao;
    }

}
