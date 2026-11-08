package org.example;

public class Rota {
        private String nome;
        private String endereco;
        private double distancia;
        private int id;

        public Rota(int id, String nome, String endereco, double distancia){
            this.id = id;
            this.nome = nome;
            this.endereco = endereco;
            this.distancia = distancia;
        }



        public Rota(String nome, String endereco, double distancia){
            this.nome = nome;
            this.endereco = endereco;
            this.distancia = distancia;
        }

        public String getNome(){
            return nome;
        }

        public String getEndereco(){
            return endereco;
        }

        public double getDistancia() {return distancia;}

        public int getId() {return id;}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}
