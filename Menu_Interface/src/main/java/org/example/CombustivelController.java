package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CombustivelController {

    @FXML
    private Label result;

    @FXML
    private TextField txtcombust;

    @FXML
    private TextField txtdist;

    @FXML
    void Calcular(ActionEvent event) {
        double conb = Double.parseDouble(txtcombust.getText());
        double dist = Double.parseDouble(txtdist.getText());
        double litros = (dist/12);
        double custo =  (litros*conb);

        if (dist>500) {
            custo = custo-(custo*0.05);
            String preco = String.format("%.2f", custo);
            result.setText(preco);
        }
        else {
            String preco = String.format("%.2f", custo);
            result.setText(preco);
        }
    }

}
