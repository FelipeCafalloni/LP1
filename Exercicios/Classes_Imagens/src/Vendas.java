public class Vendas {
    private String nomefunc;
    private String nomeclie;
    private double valor;

    public Vendas(String nomefunc, String nomeclie, double valor){
        this.nomefunc = nomefunc;
        this.nomeclie = nomeclie;
        this.valor = valor;
    }

    public String getNomefunc(){
        return nomefunc;
    }

    public String getNomeclie(){
        return nomeclie;
    }

    public double getValor() {return valor;}
}
