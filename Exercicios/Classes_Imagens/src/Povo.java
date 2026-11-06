public class Povo {
    private String nomeEtnia;
    private String regiaoOrigem;
    private String significadoRitual;

    public Povo(String nomeEtnia, String regiaoOrigem, String significadoRitual) {
        this.nomeEtnia = nomeEtnia;
        this.regiaoOrigem = regiaoOrigem;
        this.significadoRitual = significadoRitual;
    }

    public String getNomeEtnia() {
        return nomeEtnia;
    }

    public String getRegiaoOrigem() {
        return regiaoOrigem;
    }

    public String getSignificadoRitual() {
        return significadoRitual;
    }
}
