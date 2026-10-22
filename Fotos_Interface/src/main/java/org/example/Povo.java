package org.example;

public class Povo {
    private String nome;
    private String regiao;
    private String religiao;

    public Povo(String nome, String regiao, String religiao) {
        this.nome = nome;
        this.regiao = regiao;
        this.religiao = religiao;
    }

    public String getNome() {
        return nome;
    }

    public String getRegiao() {
        return regiao;
    }

    public String getReligiao() {
        return religiao;
    }
}
