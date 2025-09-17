package org.example;

import org.example.DAO.ImplementacaoFuncionario;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
  ImplementacaoFuncionario imp= new ImplementacaoFuncionario();
  //imp.inserir(new Funcionario(1,"Henrique","abc@gmail.com"));
       /* Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Insira dados do Funcionário");
            System.out.println("Insira Nome:");
            String nome = sc.nextLine();
            System.out.println("Insira Email:");
            String email = sc.nextLine();
            imp.inserir2(nome, email);
            System.out.println("Digite -1 se quiser sair");
            String opcao = sc.nextLine();
            if (opcao.equals("-1")){
                break;
            }
        }*/
     //   imp.buscarDados();
        imp.excluirDados(2);
    }
}