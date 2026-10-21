package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class TrilhaController {

    @FXML
    void AmbienteTela(ActionEvent event) throws IOException {
        App.setRoot("ambiente");
    }

    @FXML
    void CiclistaTela(ActionEvent event) throws IOException {
        App.setRoot("ciclista");
    }

    @FXML
    void RotaTela(ActionEvent event) throws IOException {
        App.setRoot("rota");
    }

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }

}
