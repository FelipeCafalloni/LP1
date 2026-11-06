package org.example;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MultiploController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button analise;

    @FXML
    private TextField num_analise;

    @FXML
    private TextField num_referencia;

    @FXML
    private Label resultado;

    @FXML
    void Analisar_num(ActionEvent event) {
        int N1 = Integer.parseInt(num_analise.getText());
        int N2 = Integer.parseInt(num_referencia.getText());

        if (N1%N2== 0){
            resultado.setText(N1 + " é múltiplo de " + N2);
        }
        else {
            resultado.setText(N1+ " não é múltiplo de " + N2);
        }

    }

    @FXML
    void initialize() {
        assert analise != null : "fx:id=\"analise\" was not injected: check your FXML file 'multiplos.fxml'.";
        assert num_analise != null : "fx:id=\"num_analise\" was not injected: check your FXML file 'multiplos.fxml'.";
        assert num_referencia != null : "fx:id=\"num_referencia\" was not injected: check your FXML file 'multiplos.fxml'.";
        assert resultado != null : "fx:id=\"resultado\" was not injected: check your FXML file 'multiplos.fxml'.";

    }

}
