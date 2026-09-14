package org.example;

public class Mercado {
    private double txtarroz;
    private double txtfeijao;
    private double txtoleo;
    private double txtacucar;
    private double txtcafe;
    private double txtmacarrao;
    private double txtfarinha;
    private double txtfuba;
    private double txtmolho;
    private double txtsal;

    public Mercado(double Txtarroz, double Txtfeijao, double Txtoleo, double Txtacucar, double Txtcafe, double Txtmacarrao, double Txtfarinha, double Txtfuba, double Txtmolho, double Txtsal){
    txtarroz = Txtarroz;
    txtacucar = Txtacucar;
    txtcafe = Txtcafe;
    txtfeijao = Txtfeijao;
    txtfarinha = Txtfarinha;
    txtfuba = Txtfuba;
    txtoleo = Txtoleo;
    txtmacarrao = Txtmacarrao;
    txtmolho = Txtmolho;
    txtsal = Txtsal;
    }

    public Mercado(){

    }

    public double getTxtarroz() {
        return txtarroz;
    }

    public void setTxtarroz(double txtarroz) {
        this.txtarroz = txtarroz;
    }

    public double getTxtacucar() {
        return txtacucar;
    }

    public void setTxtacucar(double txtacucar) {
        this.txtacucar = txtacucar;
    }

    public double getTxtfeijao() {
        return txtfeijao;
    }

    public void setTxtfeijao(double txtfeijao) {
        this.txtfeijao = txtfeijao;
    }

    public double getTxtcafe() {
        return txtcafe;
    }

    public void setTxtcafe(double txtcafe) {
        this.txtcafe = txtcafe;
    }

    public double getTxtmacarrao() {
        return txtmacarrao;
    }

    public void setTxtmacarrao(double txtmacarrao) {
        this.txtmacarrao = txtmacarrao;
    }

    public double getTxtfarinha() {
        return txtfarinha;
    }

    public void setTxtfarinha(double txtfarinha) {
        this.txtfarinha = txtfarinha;
    }

    public double getTxtoleo() {
        return txtoleo;
    }

    public void setTxtoleo(double txtoleo) {
        this.txtoleo = txtoleo;
    }

    public double getTxtfuba() {
        return txtfuba;
    }

    public void setTxtfuba(double txtfuba) {
        this.txtfuba = txtfuba;
    }

    public double getTxtmolho() {
        return txtmolho;
    }

    public void setTxtmolho(double txtmolho) {
        this.txtmolho = txtmolho;
    }

    public double getTxtsal() {
        return txtsal;
    }

    public void setTxtsal(double txtsal) {
        this.txtsal = txtsal;
    }
}
