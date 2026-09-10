package org.example;

public class Multiplo {
    private int num_analise;
    private int num_referencia;
    private String resultado;


    public Multiplo(int Num_analise, int Num_referencia, String Resultado) {
        num_analise = Num_analise;
        num_referencia = Num_referencia;
        resultado = Resultado;
    }

    public Multiplo() {
    }

    public int getNum_analise() {
        return num_analise;
    }

    public int getNum_referencia() {
        return num_referencia;
    }

    public void setNum_analise(int num_analise) {
        this.num_analise = num_analise;
    }

    public void setNum_referencia(int num_referencia) {
        this.num_referencia = num_referencia;
    }
}