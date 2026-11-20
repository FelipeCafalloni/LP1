package org.example;

public class Ambiente {
    private int id;
    private String bioma;
    private int qtd;
    private String animalPerigo;

    public Ambiente(String bioma, int qtd, String animalPerigo) {
        this.bioma = bioma;
        this.qtd = qtd;
        this.animalPerigo = animalPerigo;
    }

    public Ambiente(int id, String bioma, int qtd, String animalPerigo) {
        this.id = id;
        this.bioma = bioma;
        this.qtd = qtd;
        this.animalPerigo = animalPerigo;
    }

    public String getBioma() {
        return bioma;
    }

    public int getQtd() {
        return qtd;
    }

    public String getAnimalPerigo() {
        return animalPerigo;
    }

    public void setBioma(String bioma) {
        this.bioma = bioma;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void setAnimalPerigo(String animalPerigo) {
        this.animalPerigo = animalPerigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
