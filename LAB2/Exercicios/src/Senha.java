import java.util.Scanner;
public class Senha {
    static void senha(){
        int senha = 1234;
        int senha_dig;
        Scanner scan = new Scanner(System.in);
        IO.println("Insira a senha:");
        senha_dig= scan.nextInt();

        if(senha_dig==senha){
            IO.println("Acesso Concedido");
        } else{
            IO.println("Acesso Negado");
        }

    }
}
