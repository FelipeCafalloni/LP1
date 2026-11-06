public class Ambiente {
    private String bioma;
    private int postos;
    private String animalPerigo;

    public Ambiente(String bioma,int postos, String animalPerigo){
        this.bioma = bioma;
        this.postos = postos;
        this.animalPerigo = animalPerigo;
    }

    public String getBioma() {
        return bioma;
    }

    public int getPostos() {
        return postos;
    }

    public String getAnimalPerigo() {
        return animalPerigo;
    }
}
