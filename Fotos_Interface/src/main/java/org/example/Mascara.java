package org.example;
public class Mascara {
    private String material;
    private String mascara;
    private String povo;

    public Mascara(String mascara, String material, String povo) {
        this.material = material;
        this.mascara = mascara;
        this.povo = povo;
    }

    public String getMaterial() {
        return material;
    }

    public String getMascara() {
        return mascara;
    }

    public String getPovo() {
        return povo;
    }
}
