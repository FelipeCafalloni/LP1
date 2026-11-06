package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class FuncionarioController {

    @FXML
    private TextField txtnome;

    @FXML
    private TextField txtcargo;

    @FXML
    private TextField txtsalario;

    @FXML
    private Label txtresultado;

    @FXML
    void CriarClasse(ActionEvent event) {
        String nome = txtnome.getText();
        String cargo = txtcargo.getText();
        double salario = Double.parseDouble(txtsalario.getText());

        Funcionario funcionario = new Funcionario(nome, cargo, salario);

        txtresultado.setText(
                "Nome: " + funcionario.getNome() + "\n" +
                        "Cargo: " + funcionario.getCargo() + "\n" +
                        "Salário: R$ " + funcionario.getSalario()
        );
    }

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("loja");
    }

}
