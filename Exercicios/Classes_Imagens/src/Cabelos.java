public class Cabelos {
    private String penteado;
    private String tipo;
    private String cor;

    public Cabelos(String penteado, String tipo, String cor){
        this.penteado = penteado;
        this.tipo = tipo;
        this.cor = cor;
    }

    public String getPenteado(){
        return penteado;
    }

    public String getTipo(){
        return tipo;
    }

    public String getCor() {
        return cor;
    }
}
