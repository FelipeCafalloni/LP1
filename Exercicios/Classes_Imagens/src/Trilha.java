public class Trilha {
    private String nome;
    private String endereco;
    private double distancia;

    public Trilha(String nome, String endereco, double distancia){
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
}
