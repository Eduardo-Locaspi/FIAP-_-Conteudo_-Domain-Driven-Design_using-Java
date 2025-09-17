package org.example.DAO;

import org.example.Model.Funcionario;

import java.sql.SQLException;
import java.util.List;

public interface DAO {
    void inserir (Funcionario f);
    public void inserir2(String nome,String email);
    List<Funcionario> buscarDados();
    void excluirDados(int id);
}
