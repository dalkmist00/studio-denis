package com.start.studio.comstart.studio.model;

public class User {
    private String nome;

    public User() {
    }

    public User(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
