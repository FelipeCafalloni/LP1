package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MercadoController {

    @FXML
    private TextField txtacucar;

    @FXML
    private TextField txtarroz;

    @FXML
    private TextField txtcafe;

    @FXML
    private TextField txtfarinha;

    @FXML
    private TextField txtfeijao;

    @FXML
    private TextField txtfuba;

    @FXML
    private TextField txtmacarrao;

    @FXML
    private TextField txtmolho;

    @FXML
    private TextField txtoleo;

    @FXML
    private TextField txtsal;

    @FXML
    private Label valorbruto;

    @FXML
    private Label valorfinal;

    @FXML
    void Calcular(ActionEvent event) {
        double arroz = Double.parseDouble(txtarroz.getText());
        double acucar = Double.parseDouble(txtacucar.getText());
        double feijao = Double.parseDouble(txtfeijao.getText());
        double cafe = Double.parseDouble(txtcafe.getText());
        double farinha = Double.parseDouble(txtfarinha.getText());
        double fuba = Double.parseDouble(txtfuba.getText());
        double macarrao = Double.parseDouble(txtmacarrao.getText());
        double oleo = Double.parseDouble(txtoleo.getText());
        double molho = Double.parseDouble(txtmolho.getText());
        double sal = Double.parseDouble(txtsal.getText());
        double preco = (arroz+acucar+feijao+cafe+farinha+fuba+macarrao+oleo+molho+sal);
        String bruto = String.valueOf(preco);
        if (preco<=100) {
            valorbruto.setText(bruto);
            valorfinal.setText(bruto);
        }else {
            double preco_desc = (preco - (preco*0.15));
            String pr_final = String.valueOf(preco_desc);
            valorbruto.setText(bruto);
            valorfinal.setText(pr_final);
        }
    }

}
