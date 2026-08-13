import java.util.Scanner;
public class Combustivel {
    void main(){
        double distancia, combustivel, litros, custo;
        Scanner scan = new Scanner(System.in);
        IO.println("Insira a distância da viagem em Km:");
        distancia = scan.nextInt();

        litros = distancia/12;
        IO.println("Insira o preço do combustível:");
        combustivel = scan.nextInt();
        custo = litros*combustivel;
        if (distancia>500){
            custo= custo-(custo*0.05);
            IO.println("Em uma viagem de "+ distancia+"Km, você pagará: R$"+custo);
        }else{
            IO.println("Em uma viagem de "+ distancia+"Km, você pagará: R$"+custo);
        }




    }
}
