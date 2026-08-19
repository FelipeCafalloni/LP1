import java.util.Scanner;

public class Multiplo {
    static void multiplo(){
        int N1;
        int N2;
        Scanner s = new Scanner(System.in);
        IO.println("Digite um numero:");
        N1 = s.nextInt();
        IO.println(N1);
        IO.println("Digite outro numero:");
        N2 = s.nextInt();
        IO.println(N2);

        if(N2%N1==0){
            IO.println("O primeiro número é múltiplo do segundo");
        } else{
            IO.println("O primeiro número não é múltiplo do segundo");
        }
    }
}
