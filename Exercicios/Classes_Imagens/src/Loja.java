public class Loja {
    private String produto;
    private String tamanho;
    private String cor;

    public Loja(String produto, String tamanho, String cor){
        this.produto = produto;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getProduto(){
        return produto;
    }

    public String getTamanho(){
        return tamanho;
    }

    public String getCor() {return cor;}
}

