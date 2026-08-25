public class Cabelos {
    private String penteado;
    private String tipo;
    private String cor;

    public Cabelos(String penteado, String tipo){
        this.penteado = penteado;
        this.tipo = tipo;
    }

    public String getPenteado(){
        return penteado;
    }

    public String getTipo(){
        return tipo;
    }
}
