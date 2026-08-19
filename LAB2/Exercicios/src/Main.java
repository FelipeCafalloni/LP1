import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int op;
        Scanner scan = new Scanner(System.in);
        IO.println("Insira o programa que deseja rodar:");
        IO.println("1-Verificação de Múltiplo\n" +
                "2-Sistema de Login Simplificado\n" +
                "3-Compra com desconto\n" +
                "4-Temperatura\n" +
                "5-Os trinta e cinco camelos\n" +
                "6-Calculadora de viagem\n" +
                "7-Aluguel de carro");
        op = scan.nextInt();

        switch (op) {
            case 1:
                Multiplo.multiplo();
                break;
            case 2:
                Senha.senha();
                break;
            case 3:
                Mercado.mercado();
                break;
            case 4:
                Temperatura.temperatura();
                break;
            case 5:
                Camelos.camelos();
                break;
            case 6:
                Combustivel.combustivel();
                break;
            case 7:
                Aluguel.aluguel();
                break;
        }
    }
}
