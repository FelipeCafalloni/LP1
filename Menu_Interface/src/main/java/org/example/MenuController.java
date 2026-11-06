package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class MenuController {

    @FXML
    void Aluguel(ActionEvent event) throws IOException {
        App.setRoot("aluguel");
    }

    @FXML
    void Camelos(ActionEvent event) throws  IOException{
        App.setRoot("camelos");
    }

    @FXML
    void Combustivel(ActionEvent event) throws  IOException{
        App.setRoot("combustivel");
    }

    @FXML
    void Mercado(ActionEvent event) throws IOException{
        App.setRoot("mercado");
    }

    @FXML
    void Multiplos(ActionEvent event) throws IOException{
        App.setRoot("multiplos");
    }

    @FXML
    void Senha(ActionEvent event) throws IOException{
        App.setRoot("senha");
    }

    @FXML
    void Temperatura(ActionEvent event) throws IOException{
        App.setRoot("temperatura");
    }

}
