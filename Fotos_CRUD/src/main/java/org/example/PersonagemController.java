package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PersonagemController {

    @FXML
    private TextField txtnome;

    @FXML
    private TextField txtorigem;

    @FXML
    private TextField txtcriador;

    @FXML
    private Label txtresultado;

    @FXML
    void CriarClasse(ActionEvent event) {
        String nome = txtnome.getText();
        String origem = txtorigem.getText();
        String criador = txtcriador.getText();

        Personagem personagem = new Personagem(nome, origem, criador);

        txtresultado.setText(
                "Nome: " + personagem.getNome() + "\n" +
                        "Origem: " + personagem.getOrigem() + "\n" +
                        "Criador: " + personagem.getCriador()
        );
    }

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("cabelos");
    }

}
