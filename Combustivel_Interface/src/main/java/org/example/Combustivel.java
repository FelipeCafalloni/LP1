package org.example;

public class Combustivel {
    private double txtcombust;
    private double txtdist;
    private double result;


    public Combustivel(double Txtcombustivel, double Txtdist) {
    txtcombust = Txtcombustivel;
    txtdist = Txtdist;
    }

    public Combustivel() {

    }

    public double getTxtcombust() {
        return txtcombust;
    }

    public double getTxtdist() {
        return txtdist;
    }

    public double getResult() {
        return result;
    }

    public void setTxtcombust(double txtcombust) {
        this.txtcombust = txtcombust;
    }

    public void setTxtdist(double txtdist) {
        this.txtdist = txtdist;
    }

    public void setResult(double result) {
        this.result = result;
    }
}


