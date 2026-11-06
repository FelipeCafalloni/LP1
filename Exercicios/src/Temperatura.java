import java.util.Scanner;
public class Temperatura {
    void main() {
        int jan = 24, fev = 24, mar = 24, abr = 22, mai = 19, jun = 18, jul = 18, ago = 19, set = 20, out = 22, nov = 23, dez = 24, resposta = 0, temp;
        String Calor = "O clima está agradável", Frio = "O clima está frio";
        Scanner scan = new Scanner(System.in);
        IO.println("Insira o mês que deseja verificar(Ex. Janeiro:1; Fevereiro:2)");
        resposta= scan.nextInt();

        switch (resposta) {
            case 1:
                IO.println(Calor);
                break;
            case 2:
                IO.println(Calor);
                break;
            case 3:
                IO.println(Calor);
                break;
            case 4:
                IO.println(Calor);
                break;
            case 5:
                IO.println(Frio);
                break;
            case 6:
                IO.println(Frio);
                break;
            case 7:
                IO.println(Calor);
                break;
            case 8:
                IO.println(Calor);
                break;
            case 9:
                IO.println(Calor);
                break;
            case 10:
                IO.println(Calor);
                break;
            case 11:
                IO.println(Calor);
                break;
            case 12:
                IO.println(Calor);
                break;
        }

    }
}
