package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AluguelController {

    @FXML
    private Label result;

    @FXML
    private TextField txtdias;

    @FXML
    private TextField txtkm;

    @FXML
    void Calcular(ActionEvent event) {
    int dias = Integer.parseInt(txtdias.getText());
    double km = Double.parseDouble(txtkm.getText());
    double diaria = 95;
    double km_ideal = 100;
    double km_dia = km/dias;
    double aluguel;
    if (km_dia>100){
        aluguel= (diaria*dias)+((km_dia-km_ideal)*0.1);
        String resultado = String.format("%.2f", aluguel);
        result.setText("O valor do aluguel ficou: " + resultado);
    } else {
        aluguel = (diaria*dias);
        String resultado = String.format("%.2f", aluguel);
        result.setText("O valor do aluguel ficou: " + resultado);
    }
    }

}
