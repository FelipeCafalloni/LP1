public class Loja {
    private String produto;
    private String tamanho;
    private String cor;

    public Loja(String produto, String tamanho){
        this.produto = produto;
        this.tamanho = tamanho;
    }

    public String getProduto(){
        return produto;
    }

    public String getTamanho(){
        return tamanho;
    }
}
