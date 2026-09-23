package org.example;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class InicioController {

    @FXML
    void Cabelos(ActionEvent event) throws IOException {
        App.setRoot("cabelos");
    }

    @FXML
    void Loja(ActionEvent event) throws IOException{
        App.setRoot("loja");
    }

    @FXML
    void Mascaras(ActionEvent event) throws IOException{
        App.setRoot("mascaras");
    }

    @FXML
    void Trilha(ActionEvent event) throws IOException{
        App.setRoot("trilha");
    }

}
