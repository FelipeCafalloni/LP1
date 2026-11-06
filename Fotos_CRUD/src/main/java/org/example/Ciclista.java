package org.example;
public class Ciclista {
    private String nome;
    private String genero;
    private int idade;
    private int id;

    public Ciclista(int id, String nome, String genero, int idade){
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public Ciclista( String nome, String genero, int idade){
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

    public int getId() {return id;}

    public void setNome(String text) {
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
