package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class TrilhaController {

    @FXML
    void Ambiente(ActionEvent event) throws IOException {
        App.setRoot("ambiente");
    }

    @FXML
    void Ciclista(ActionEvent event) throws IOException {
        App.setRoot("ciclista");
    }

    @FXML
    void Rota(ActionEvent event) throws IOException {
        App.setRoot("rota");
    }

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }

}
