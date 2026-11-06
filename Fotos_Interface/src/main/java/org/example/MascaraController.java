package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;

public class MascaraController {

    @FXML
    private TextField txtmascara;

    @FXML
    private TextField txtmaterial;

    @FXML
    private TextField txtpovo;

    @FXML
    private Label txtresultado;

    @FXML
    void CriarClasse(ActionEvent event) {
        String mascara = txtmascara.getText();
        String material= txtmaterial.getText();
        String povo = txtpovo.getText();

        Mascara mascara1 = new Mascara(mascara, material, povo);

        txtresultado.setText(
                "Mascara: " + mascara1.getMascara() + "\n" +
                        "Gênero: " + mascara1.getMaterial() + "\n" +
                        "Idade: " + mascara1.getPovo()
        );
    }
    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("mascaras");
    }

}
