package org.example.Model;

public class Funcionario {
    private int id;
    private String nome;
    private String email;

    public Funcionario(String email, int id, String nome) {
        this.email = email;
        this.id = id;
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


