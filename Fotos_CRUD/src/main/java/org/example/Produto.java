package org.example;

public class Produto {
    private int id;
    private String nome;
    private String tamanho;
    private String cor;


    public Produto(int id, String nome, String tamanho, String cor) {
        this.id = id;
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
    }


    public Produto(String nome, String tamanho, String cor) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public int getId() {return id;}

    public String getNome() {
        return nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getCor() {
        return cor;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
