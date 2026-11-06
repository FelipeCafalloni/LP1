package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PovoController {

    @FXML
    private TextField txtnome;

    @FXML
    private TextField txtregiao;

    @FXML
    private TextField txtreligiao;

    @FXML
    private Label txtresultado;

    @FXML
    void CriarClasse(ActionEvent event) {
        String nome = txtnome.getText();
        String regiao = txtregiao.getText();
        String religiao = txtreligiao.getText();

        Povo povo = new Povo(nome, regiao, religiao);

        txtresultado.setText(
                "Nome: " + povo.getNome() + "\n" +
                        "Região: " + povo.getRegiao() + "\n" +
                        "Religião: " + povo.getReligiao()
        );
    }

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("mascaras");
    }

}
