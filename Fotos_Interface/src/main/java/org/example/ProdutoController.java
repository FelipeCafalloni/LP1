package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ProdutoController {

    @FXML
    private TextField txtnome;

    @FXML
    private TextField txttamanho;

    @FXML
    private TextField txtcor;

    @FXML
    private Label txtresultado;

    @FXML
    void CriarClasse(ActionEvent event) {
        String nome = txtnome.getText();
        String tamanho = txttamanho.getText();
        String cor = txtcor.getText();

        Produto produto = new Produto(nome, tamanho, cor);

        txtresultado.setText(
                "Nome: " + produto.getNome() + "\n" +
                        "Tamanho: " + produto.getTamanho() + "\n" +
                        "Cor: " + produto.getCor()
        );
    }

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("loja");
    }

}
