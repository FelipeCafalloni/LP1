public class Museu {
    private String nome;
    private String cidade;
    private int quantidadeExposta;

    public Museu(String nome, String cidade, int quantidadeExposta) {
        this.nome = nome;
        this.cidade = cidade;
        this.quantidadeExposta = quantidadeExposta;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public int getQuantidadeExposta() {
        return quantidadeExposta;
    }
}
