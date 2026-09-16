package org.example;

public class Aluguel {

    private int txtdias;
    private double txtkm;

    public Aluguel(int Txtdias, double Txtkm){
    txtdias = Txtdias;
    txtkm = Txtkm;
    }

    public Aluguel(){

    }

    public int getTxtdias() {
        return txtdias;
    }

    public double getTxtkm() {
        return txtkm;
    }

    public void setTxtkm(double txtkm) {
        this.txtkm = txtkm;
    }

    public void setTxtdias(int txtdias) {
        this.txtdias = txtdias;
    }
}


