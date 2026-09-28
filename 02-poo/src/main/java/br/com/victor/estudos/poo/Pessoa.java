package br.com.victor.estudos.poo;

public class Pessoa {
    private final String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String apresentar() {
        return "Olá, meu nome é " + nome + ".";
    }
}
