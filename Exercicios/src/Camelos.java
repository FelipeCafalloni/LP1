import java.util.Scanner;
public class Camelos {
    void main(){
        int camelos = 36;
        double metade = (camelos/2), terca = (camelos/3), nona = (camelos/9);

        IO.println("Camelos para o irmão mais velho:" + metade);
        IO.println("Camelos para o irmão do meio:" + terca);
        IO.println("Camelos para o irmão mais novo:" + nona);
    }
}
