package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SenhaController {

    @FXML
    private TextField txtsenha;

    @FXML
    private Label result;

    @FXML
    void Inserir(ActionEvent event) {
    int senha = Integer.parseInt(txtsenha.getText());
    int senha_correta = 1234;

    if(senha == senha_correta) {
        result.setText("Senha correta, seja bem vindo!");
    }else {
        result.setText("Senha incorreta, tente novamente!");
    }
    }
    }
