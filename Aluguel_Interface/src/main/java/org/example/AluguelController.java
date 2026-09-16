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
    }

}
