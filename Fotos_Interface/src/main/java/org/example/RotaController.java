package org.example;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;
public class RotaController {

    @FXML
    private TextField txtdist;

    @FXML
    private TextField txtendereco;

    @FXML
    private TextField txtnome;

    @FXML
    private Label txtresultado;

    @FXML
    void CriarClasse(ActionEvent event) {
        String nome = (txtnome.getText());
        double dist= Double.parseDouble(txtdist.getText());
        String endereco = txtendereco.getText();
        Rota rota= new Rota(nome, endereco, dist);

        txtresultado.setText(
                "Nome da trilha: " + rota.getNome() + "\n" +
                        "Distância: " + rota.getDistancia() + "\n" +
                        "Endereço: " + rota.getEndereco()
        );
    }
    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("trilha");
    }

}
