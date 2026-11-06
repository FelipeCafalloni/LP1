package org.example;

public class Pagina {
    private int numero;
    private int quantidadeDesenhos;
    private String formato;

    public Pagina(int numero, int quantidadeDesenhos, String formato) {
        this.numero = numero;
        this.quantidadeDesenhos = quantidadeDesenhos;
        this.formato = formato;
    }

    public int getNumero() {
        return numero;
    }

    public int getQuantidadeDesenhos() {
        return quantidadeDesenhos;
    }

    public String getFormato() {
        return formato;
    }
}
