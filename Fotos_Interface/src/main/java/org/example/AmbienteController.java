package org.example;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;

import java.io.IOException;

public class AmbienteController {

        @FXML
        private TextField txtbioma;

        @FXML
        private TextField txtqtd;

        @FXML
        private TextField txtperigo;

        @FXML
        private Label txtresultado;

        @FXML
        void Voltar(ActionEvent event) throws IOException {
            App.setRoot("trilha");
        }

        @FXML
        void CriarClasse(ActionEvent event) throws IOException {
            String bioma = (txtbioma.getText());
            int qtd = Integer.parseInt(txtqtd.getText());
            String perigo = txtperigo.getText();
            Ambiente ambiente = new Ambiente(bioma, qtd, perigo);

            txtresultado.setText(
            "Bioma: " + ambiente.getBioma() + "\n" +
                    "Quantidade de postos: " + ambiente.getPostos() + "\n" +
                    "Animal perigoso: " + ambiente.getAnimalPerigo()
                    );
        }

    }
