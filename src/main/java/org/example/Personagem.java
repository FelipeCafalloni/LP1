package org.example;

public class Personagem {
    private String nome;
    private String origem;
    private String criador;

    public Personagem(String nome, String origem, String criador) {
        this.nome = nome;
        this.origem = origem;
        this.criador = criador;
    }

    public String getNome() {
        return nome;
    }

    public String getOrigem() {
        return origem;
    }

    public String getCriador() {
        return criador;
    }
}
