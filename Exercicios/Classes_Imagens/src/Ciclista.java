public class Ciclista {
    private String nome;
    private String bicicleta;
    private int telefone;

    public Ciclista(String nome, String bicicleta, int telefone){
        this.nome = nome;
        this.bicicleta = bicicleta;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getBicicleta() {
        return bicicleta;
    }

    public int getTelefone() {
        return telefone;
    }
}
