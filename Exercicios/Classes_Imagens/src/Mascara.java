public class Mascara {
    private String material;
    private String formato;
    private String corPredominante;

    public Mascara(String material, String formato, String corPredominante) {
        this.material = material;
        this.formato = formato;
        this.corPredominante = corPredominante;
    }

    public String getMaterial() {
        return material;
    }

    public String getFormato() {
        return formato;
    }

    public String getCorPredominante() {
        return corPredominante;
    }
}
