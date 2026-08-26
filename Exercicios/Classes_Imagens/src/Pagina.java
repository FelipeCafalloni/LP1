public class Pagina {
    private int numero;
    private int rascunhos;
    private String formato;

    public Pagina(int numero, int rascunhos, String formato){
        this.numero = numero;
        this.rascunhos = rascunhos;
        this.formato = formato;
    }

    public int getNumero() {
        return numero;
    }

    public int getRascunhos() {
        return rascunhos;
    }

    public String getFormato() {
        return formato;
    }
}
