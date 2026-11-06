public class Personagens {
    private String nome;
    private String desenho;
    private String criador;

    public Personagens(String nome, String desenho, String criador){
        this.nome = nome;
        this.desenho = desenho;
        this.criador = criador;
    }

    public String getNome() {
        return nome;
    }

    public String getDesenho() {
        return desenho;
    }

    public String getCriador() {
        return criador;
    }
}
