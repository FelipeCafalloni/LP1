package org.example;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class CiclistaController {

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("trilha");
    }

}
