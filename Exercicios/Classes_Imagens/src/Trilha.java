public class Trilha {
    private String nome;
    private String endereco;
    private double distancia;
    private boolean gratuita;

    public Trilha(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

}
