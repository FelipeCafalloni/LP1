package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PaginaController {

    @FXML
    private TextField txtnumero;

    @FXML
    private TextField txtqtdDesenhos;

    @FXML
    private TextField txtformato;

    @FXML
    private Label txtresultado;

    @FXML
    void CriarClasse(ActionEvent event) {
        int numero = Integer.parseInt(txtnumero.getText());
        int qtdDesenhos = Integer.parseInt(txtqtdDesenhos.getText());
        String formato = txtformato.getText();

        Pagina pagina = new Pagina(numero, qtdDesenhos, formato);

        txtresultado.setText(
                "Número da página: " + pagina.getNumero() + "\n" +
                        "Desenhos na página: " + pagina.getQuantidadeDesenhos() + "\n" +
                        "Formato: " + pagina.getFormato()
        );
    }

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("cabelos");
    }

}
