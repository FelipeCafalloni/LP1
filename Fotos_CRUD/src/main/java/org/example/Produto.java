package org.example;

public class Produto {
    private String nome;
    private String tamanho;
    private String cor;

    public Produto(String nome, String tamanho, String cor) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getCor() {
        return cor;
    }
}
