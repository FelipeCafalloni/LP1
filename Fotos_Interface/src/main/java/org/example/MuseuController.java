package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import java.io.IOException;

public class MuseuController {

    @FXML
    private TextField txtendereco;

    @FXML
    private TextField txtexpo;

    @FXML
    private TextField txtnome;

    @FXML
    private Label txtresultado;

    @FXML
    void CriarClasse(ActionEvent event) {
        String nome = txtnome.getText();
        String endereco = txtendereco.getText();
        int qtdexpo= Integer.parseInt(txtexpo.getText());

        Museu museu = new Museu(nome, endereco, qtdexpo);

        txtresultado.setText(
                "Nome: " + museu.getNome() + "\n" +
                        "Endereço: " + museu.getCidade() + "\n" +
                        "Quantidade de obras: " + museu.getQuantidadeExposta()
        );
    }
    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("mascaras");
    }

}