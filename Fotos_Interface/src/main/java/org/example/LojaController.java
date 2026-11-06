package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class LojaController {

    @FXML
    void Funcionario(ActionEvent event) throws IOException {
        App.setRoot("funcionario");
    }

    @FXML
    void Produto(ActionEvent event) throws IOException{
        App.setRoot("produto");
    }

    @FXML
    void Venda(ActionEvent event) throws IOException{
        App.setRoot("vendas");
    }

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }

}
