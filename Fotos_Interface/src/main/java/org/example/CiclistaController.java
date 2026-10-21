package org.example;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CiclistaController {

    @FXML
    private TextField txtnome;

    @FXML
    private TextField txtgenero;

    @FXML
    private TextField txtidade;

    @FXML
    private Label txtresultado;

    @FXML
    void CriarClasse(ActionEvent event) {
        String nome = txtnome.getText();
        int idade = Integer.parseInt(txtidade.getText());
        String genero = txtgenero.getText();

        Ciclista ciclista = new Ciclista(nome, genero, idade);

        txtresultado.setText(
                "Nome: " + ciclista.getNome() + "\n" +
                        "Gênero: " + ciclista.getGenero() + "\n" +
                        "Idade: " + ciclista.getIdade()
        );
    }


    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("trilha");
    }

}
