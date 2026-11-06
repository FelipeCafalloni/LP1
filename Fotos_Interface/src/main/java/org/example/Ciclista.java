package org.example;
public class Ciclista {
    private String nome;
    private String genero;
    private int idade;

    public Ciclista(String nome, String genero, int idade){
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getIdade() {
        return idade;
    }
}
