package org.example.DAO;

import org.example.Model.Funcionario;
import org.example.Conexao.Conexao;

import java.sql.*;

public class ImplementacaoDAO implements DAO{
    @Override
    public void inserir(Funcionario f){
        String sql = "INSERT INTO funcionario2 (nome,email) values(?,?)";

        //Try with resources
        try (Connection con = Conexao.recuperarConexao();
             PreparedStatement st= con.prepareStatement(sql)){

            st.setString(1,f.getNome());
            st.setString(2,f.getEmail());
            int  linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas>0){
                System.out.println("Inseriu");
            }else{
                System.out.println("Não Inseriu");
            }

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void buscarDados() {
        String sql = "SELECT * FROM funcionario2";

        try (Connection conn = Conexao.recuperarConexao(); PreparedStatement pst = conn.prepareStatement(sql)){

            ResultSet rs= pst.executeQuery();

            while (rs.next()){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
            }

        }catch (SQLException e){
            System.out.println();
        }
    }
}
