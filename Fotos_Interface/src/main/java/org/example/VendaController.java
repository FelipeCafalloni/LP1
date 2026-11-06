package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class VendaController {

    @FXML
    private TextField txtvendedor;

    @FXML
    private TextField txtcliente;

    @FXML
    private TextField txtvalor;

    @FXML
    private Label txtresultado;

    @FXML
    void CriarClasse(ActionEvent event) {
        String vendedor = txtvendedor.getText();
        String cliente = txtcliente.getText();
        double valor = Double.parseDouble(txtvalor.getText());

        Venda venda = new Venda(vendedor, cliente, valor);

        txtresultado.setText(
                "Vendedor: " + venda.getVendedor() + "\n" +
                        "Cliente: " + venda.getCliente() + "\n" +
                        "Valor: R$ " + venda.getValor()
        );
    }

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("loja");
    }

}
