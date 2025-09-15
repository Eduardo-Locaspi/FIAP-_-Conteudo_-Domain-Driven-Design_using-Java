package org.example;

import org.example.DAO.ImplementacaoDAO;
import org.example.Model.Funcionario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ImplementacaoDAO imp = new ImplementacaoDAO();
//        imp.inserir(new Funcionario("gmail",1,"Eduardo"));
        imp.buscarDados();
    }
}