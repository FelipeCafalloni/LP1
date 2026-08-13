import java.util.Scanner;
public class Aluguel {
        void main(){
        double diaria = 95, km, km_dia, km_ideal, aluguel;
        int dias;
        Scanner scan = new Scanner(System.in);
        IO.println("Insira quantos dias ficou com o carro:");
        dias = scan.nextInt();
        IO.println("Insira quantos Km percorreu:");
        km = scan.nextInt();
        km_dia = km/dias;
        km_ideal = 100;

        if (km_dia>100){
            aluguel =(diaria*dias)+((km_dia-km_ideal)*0.01);
            IO.println("Você pagará: R$"+aluguel);
        }else {
            aluguel = diaria*dias;
            IO.println("Você pagará: R$"+aluguel);
        }

        }
}

