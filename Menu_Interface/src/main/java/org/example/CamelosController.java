package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CamelosController {

    @FXML
    private Label result_meio;

    @FXML
    private Label result_novo;

    @FXML
    private Label result_velho;

    @FXML
    private TextField txtcamelo;

    @FXML
    void Calcular(ActionEvent event) {

        int camelos = Integer.parseInt(txtcamelo.getText());

        if(camelos%2==1){
            camelos = camelos+1;
        }

        int velho = (camelos/2);
        int meio = (camelos/3);
        int novo = (camelos/9);

        result_velho.setText(String.valueOf(velho));
        result_meio.setText(String.valueOf(meio));
        result_novo.setText(String.valueOf(novo));

    }

}
