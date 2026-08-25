import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Trilha trilha = new Trilha("Trilha do Sol,", " Caçapava");

        String nomeTrilha = trilha.getNome();
        String enderecoTrilha = trilha.getEndereco();
        System.out.println(nomeTrilha + enderecoTrilha);


        Cabelos cabelos = new Cabelos("Topete,", "Liso");

        String penteadoCabelos = cabelos.getPenteado();
        String tipoCabelos = cabelos.getTipo();
        System.out.println(penteadoCabelos + tipoCabelos);

        Loja loja = new Loja("Calça Jeans,", "G");

        String produtoLoja = loja.getProduto();
        String tamanhoLoja = loja.getTamanho();
        System.out.println(produtoLoja + tamanhoLoja);
    }
}
