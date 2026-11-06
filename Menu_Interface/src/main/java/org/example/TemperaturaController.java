package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TemperaturaController {

    @FXML
    private Label result;

    @FXML
    void Abril(ActionEvent event) {
        String clima = "22";
        result.setText("A temperatura do mês de Abril é de " +clima+ "°C e é considerada agradável!");
    }

    @FXML
    void Agosto(ActionEvent event) {
        String clima = "19";
        result.setText("A temperatura do mês de Agosto é de " +clima+ "°C e é considerada agradável!");
    }

    @FXML
    void Dezembro(ActionEvent event) {
        String clima = "24";
        result.setText("A temperatura do mês de Dezembro é de " +clima+ "°C e é considerada agradável!");
    }

    @FXML
    void Fevereiro(ActionEvent event) {
        String clima = "24";
        result.setText("A temperatura do mês de Fevereiro é de " +clima+ "°C e é considerada agradável!");
    }

    @FXML
    void Janeiro(ActionEvent event) {
        String clima = "24";
        result.setText("A temperatura do mês de Janeiro é de " +clima+ "°C e é considerada agradável!");
    }

    @FXML
    void Julho(ActionEvent event) {
        String clima = "18";
        result.setText("A temperatura do mês de Julho é de " +clima+ "°C e é considerada desagradável!");
    }

    @FXML
    void Junho(ActionEvent event) {
        String clima = "18";
        result.setText("A temperatura do mês de Junho é de " +clima+ "°C e é considerada desagradável!");
    }

    @FXML
    void Maio(ActionEvent event) {
        String clima = "19";
        result.setText("A temperatura do mês de Maio é de " +clima+ "°C e é considerada agradável!");
    }

    @FXML
    void Marco(ActionEvent event) {
        String clima = "24";
        result.setText("A temperatura do mês de Março é de " +clima+ "°C e é considerada agradável!");
    }

    @FXML
    void Novembro(ActionEvent event) {
        String clima = "23";
        result.setText("A temperatura do mês de Novembro é de " +clima+ "°C e é considerada agradável!");
    }

    @FXML
    void Outubro(ActionEvent event) {
        String clima = "22";
        result.setText("A temperatura do mês de Outubro é de " +clima+ "°C e é considerada agradável!");
    }

    @FXML
    void Setembro(ActionEvent event) {
        String clima = "20";
        result.setText("A temperatura do mês de Setembro é de " +clima+ "°C e é considerada agradável!");
    }

}
