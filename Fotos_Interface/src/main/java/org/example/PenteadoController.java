package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PenteadoController {

    @FXML
    private TextField txtnome;

    @FXML
    private TextField txtcor;

    @FXML
    private TextField txttipo;

    @FXML
    private Label txtresultado;

    @FXML
    void CriarClasse(ActionEvent event) {
        String nome = txtnome.getText();
        String cor = txtcor.getText();
        String tipo = txttipo.getText();

        Penteado penteado = new Penteado(nome, cor, tipo);

        txtresultado.setText(
                "Nome: " + penteado.getNome() + "\n" +
                        "Cor: " + penteado.getCor() + "\n" +
                        "Tipo: " + penteado.getTipo()
        );
    }

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("cabelos");
    }

}
