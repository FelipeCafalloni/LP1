public class Mercado {
    void main (){
        int arroz = 15, feijao=10, oleo=8, acucar=10, cafe=18, macarrao=4, farinha=8, fuba= 11, molho= 10, sal=8;
        int totalBruto;
        double desconto, total_final;

    totalBruto = (arroz+feijao+oleo+acucar+cafe+macarrao+farinha+fuba+molho+sal);

        if (totalBruto >= 100) {
            desconto= (totalBruto *0.1);
            total_final= (totalBruto -desconto);
            IO.println("Você ganhou um desconto! Valor final:"+total_final);
        } else {
        IO.println("Valor final da compra:"+ totalBruto);
        }
        }
    }

