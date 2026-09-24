package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class MascarasController {

    @FXML
    void Mascara(ActionEvent event) throws IOException{
        App.setRoot("mascara");
    }

    @FXML
    void Museu(ActionEvent event) throws IOException {
        App.setRoot("museu");
    }

    @FXML
    void Povo(ActionEvent event) throws IOException {
        App.setRoot("povo");
    }

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }

}
