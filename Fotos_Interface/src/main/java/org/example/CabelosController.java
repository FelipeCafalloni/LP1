package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class CabelosController {

    @FXML
    void Personagem(ActionEvent event) throws IOException {
        App.setRoot("personagem");
    }

    @FXML
    void Penteado(ActionEvent event) throws IOException {
        App.setRoot("penteado");
    }

    @FXML
    void Pagina(ActionEvent event) throws IOException {
        App.setRoot("pagina");
    }

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }

}
