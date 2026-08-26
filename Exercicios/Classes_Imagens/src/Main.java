import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Trilha trilha = new Trilha("Trilha do Sol, ", "Caçapava, ", 3.5);

        String nomeTrilha = trilha.getNome();
        String enderecoTrilha = trilha.getEndereco();
        double distanciaTrilha = trilha.getDistancia();

        System.out.println(nomeTrilha + enderecoTrilha + distanciaTrilha);

        Ambiente ambiente = new Ambiente("montanha, ", 5, ", Cobra");

        String biomaAmbiente = ambiente.getBioma();
        int postosAmbiente = ambiente.getPostos();
        String animalPerigoAmbiente = ambiente.getAnimalPerigo();

        System.out.println(biomaAmbiente + postosAmbiente + animalPerigoAmbiente);

        Ciclista ciclista = new Ciclista("Pedro, ", "Caloi Vermelha, ", 1143576584);

        String nomeCiclista = ciclista.getNome();
        String bicicletaCiclista = ciclista.getBicicleta();
        int telefoneCiclista = ciclista.getTelefone();

        System.out.println(nomeCiclista + bicicletaCiclista + telefoneCiclista);
        System.out.println("---------------------------------------");

        Cabelos cabelos = new Cabelos("Topete, ", "Liso, ", "Preto");

        String penteadoCabelos = cabelos.getPenteado();
        String tipoCabelos = cabelos.getTipo();
        String corCabelos = cabelos.getCor();
        System.out.println(penteadoCabelos + tipoCabelos + corCabelos);

        Personagens personagens = new Personagens("Yamaha, ", "Naruto, ", "Carlos");
        String nomePersonagens = personagens.getNome();
        String desenhoPersonagens = personagens.getDesenho();
        String criadorPersonagens = personagens.getCriador();

        System.out.println(nomePersonagens + desenhoPersonagens + criadorPersonagens);

        Pagina pagina = new Pagina(1, 5, ", Físico, ");
        int numeroPagina = pagina.getNumero();
        int rascunhosPagina = pagina.getRascunhos();
        String formatoPagina = pagina.getFormato();

        System.out.println(numeroPagina + formatoPagina + rascunhosPagina);

        System.out.println("---------------------------------------");

        Loja loja = new Loja("Calça Jeans, ", "G, ", "Azul");

        String produtoLoja = loja.getProduto();
        String tamanhoLoja = loja.getTamanho();
        String corLoja = loja.getCor();

        System.out.println(produtoLoja + tamanhoLoja + corLoja);

        Funcionarios funcionarios = new Funcionarios("Leonardo, ", "Vendedor, ", 1689.90);

        String nomeFuncionario = funcionarios.getNome();
        String cargoFuncionario = funcionarios.getCargo();
        double salarioFuncionario = funcionarios.getSalario();

        System.out.println(nomeFuncionario + cargoFuncionario + salarioFuncionario);

        Vendas vendas = new Vendas("Leonardo, ", "Rafael, ", 189.90);

        String nomefuncVendas = vendas.getNomefunc();
        String nomeclieVendas = vendas.getNomeclie();
        double valorVendas = vendas.getValor();

        System.out.println(nomefuncVendas + nomeclieVendas + valorVendas);

        System.out.println("---------------------------------------");


        Mascara mascara = new Mascara("Madeira entalhada, ", "Alongado com chifres, ", "Castanho escuro");

        String materialMascara = mascara.getMaterial();
        String formatoMascara = mascara.getFormato();
        String corMascara = mascara.getCorPredominante();

        System.out.println(materialMascara + formatoMascara + corMascara);

        Povo povo = new Povo("Povo Chokwe, ", "África Central, ", "Proteção e ritos de passagem");

        String nomeEtniaPovo = povo.getNomeEtnia();
        String regiaoPovo = povo.getRegiaoOrigem();
        String significadoPovo = povo.getSignificadoRitual();

        System.out.println(nomeEtniaPovo + regiaoPovo + significadoPovo);

        Museu museu = new Museu("Museu Afro Brasil, ", "São Paulo, ", 22);

        String nomeMuseu = museu.getNome();
        String cidadeMuseu = museu.getCidade();
        int quantidadeExpostaMuseu = museu.getQuantidadeExposta();

        System.out.println(nomeMuseu + cidadeMuseu + quantidadeExpostaMuseu);
        System.out.println("---------------------------------------");
    }
}
