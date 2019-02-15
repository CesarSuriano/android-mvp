package com.example.root.hellomvp.model;

public class User {
    private String nome = "", email = "";

    public User(){

    }

    public User(String nome, String email){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Email : " + email + "\nNome : " + nome;
    }
}
