package org.example.DAO;

import org.example.Conexao.Conexao;
import org.example.Model.Funcionario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImplementacaoFuncionario implements DAO{
    // criar a string sql
    //gerar nossa conexao
    // criar o nosso preparedStament com a SQL
    // se for o caso adicionar elementos no preparedStatement
    // executar a query e avaliar o resultado
    @Override
    public void inserir(Funcionario f) {
        String sql ="insert into funcionario (nome,email) values (?,?)";// criar a string sql
        //try with resources
        //Usar quando tenho elementos que preciso fechar.
        try(Connection con = Conexao.recuperaConexao();
            PreparedStatement st= con.prepareStatement(sql)){
            st.setString(1,f.getNome());
            st.setString(2,f.getEmail());
           int linhasAfetadas= st.executeUpdate();
           if (linhasAfetadas>0){
               System.out.println("Inseriu Elementos");
           }else {
               System.out.println("Não inseriu");
           }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void inserir2(String nome,String email) {
        String sql ="insert into funcionario (nome,email) values (?,?)";// criar a string sql
        //try with resources
        //Usar quando tenho elementos que preciso fechar.
        try(Connection con = Conexao.recuperaConexao();
            PreparedStatement st= con.prepareStatement(sql)){
            st.setString(1,nome);
            st.setString(2,email);
            int linhasAfetadas= st.executeUpdate();
            if (linhasAfetadas>0){
                System.out.println("Inseriu Elementos");
            }else {
                System.out.println("Não inseriu");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Funcionario> buscarDados() {
        List<Funcionario> dadosFuncionario = new ArrayList<>();
        String sql = "select * from funcionario";

        try (Connection con = Conexao.recuperaConexao();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            // alterar esse parte para armazenar numa lista
            while (rs.next()) { // itera enquanto existe próximo elemento
                dadosFuncionario.add(new Funcionario(rs.getInt(1),rs.getString(2),rs.getString(3)));


            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dadosFuncionario;
    }

    public void excluirDados(int id){
        String sql = "DELETE FROM funcionario WHERE id_funcionario = ?";

        try (Connection con = Conexao.recuperaConexao()){
            con.setAutoCommit(false);

            try( PreparedStatement st = con.prepareStatement(sql)){
                st.setInt(1,id);
                int linhasAfetadas= st.executeUpdate();

                if (linhasAfetadas>0){
                    con.commit();
                }else{
                    con.rollback();
                }
            } catch(SQLException e){
                System.out.println(e.getMessage());
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }

    }
}