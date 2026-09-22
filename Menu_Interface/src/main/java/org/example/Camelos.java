package org.example;

public class Camelos {

    int camelos;
    int velho;
    int meio;
    int novo;

    public Camelos(int Camelos, int Velho, int Meio, int Novo){
     int camelos = Camelos;
     int velho = Velho;
     int meio = Meio;
     int novo = Novo;
    }

    public Camelos(){

    }

    public int getCamelos() {
        return camelos;
    }

    public int getVelho() {
        return velho;
    }

    public int getMeio() {
        return meio;
    }

    public int getNovo() {
        return novo;
    }

    public void setCamelos(int camelos) {
        this.camelos = camelos;
    }

    public void setVelho(int velho) {
        this.velho = velho;
    }

    public void setMeio(int meio) {
        this.meio = meio;
    }

    public void setNovo(int novo) {
        this.novo = novo;
    }
}
