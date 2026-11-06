package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class MascarasController {

    @FXML
    void MascaraTela(ActionEvent event) throws IOException{
        App.setRoot("mascara");
    }

    @FXML
    void MuseuTela(ActionEvent event) throws IOException {
        App.setRoot("museu");
    }

    @FXML
    void PovoTela(ActionEvent event) throws IOException {
        App.setRoot("povo");
    }

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }

}
