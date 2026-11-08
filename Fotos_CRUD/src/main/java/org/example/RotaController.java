package org.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.List;

public class RotaController {

    @FXML
    private TableView<Rota> TableRotas;

    @FXML
    private TableColumn<?, ?> colunaDist;

    @FXML
    private TableColumn<?, ?> colunaEndereco;

    @FXML
    private TableColumn<?, ?> colunaID;

    @FXML
    private TableColumn<?, ?> colunaNome;

    @FXML
    private TextField txtdist;

    @FXML
    private TextField txtendereco;

    @FXML
    private TextField txtnome;

    @FXML
    private Label txtresultado;

    @FXML
    public void initialize() {
        colunaID.setCellValueFactory(new PropertyValueFactory<>("id"));
        colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colunaEndereco.setCellValueFactory(new PropertyValueFactory<>("endereco"));
        colunaDist.setCellValueFactory(new PropertyValueFactory<>("distancia"));

        TableRotas.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                txtnome.setText(newSelection.getNome());
                txtendereco.setText(String.valueOf(newSelection.getEndereco()));
                txtdist.setText(String.valueOf(newSelection.getDistancia()));
            }
        });

    }

    @FXML
    void AttRota(ActionEvent event) {
        Rota rotaselecionada = TableRotas.getSelectionModel().getSelectedItem();
        if (rotaselecionada != null){
            rotaselecionada.setNome(txtnome.getText());
            rotaselecionada.setEndereco(txtendereco.getText());
            rotaselecionada.setDistancia(Double.parseDouble(txtdist.getText()));

            RotaDAO dao = new RotaDAO();

            dao.atualizaRota(rotaselecionada);

            txtresultado.setText("Rota atualizada com sucesso");
        } else {
            txtresultado.setText("Nenhuma rota foi selecionada");
        }
    }

    void CarregarRotas(){
        RotaDAO dao = new RotaDAO();

        List <Rota> lista = dao.buscaRotas();

        ObservableList<Rota> rotaObservable = FXCollections.observableArrayList(lista);

        TableRotas.setItems(rotaObservable);
    }

    @FXML
    void CriarClasse(ActionEvent event) {
        String nome = (txtnome.getText());
        double dist= Double.parseDouble(txtdist.getText());
        String endereco = txtendereco.getText();

        Rota rota= new Rota(nome, endereco, dist);

        RotaDAO dao = new RotaDAO();
        dao.criaRota(rota);

        txtresultado.setText(
                "Nome da trilha: " + rota.getNome() + "\n" +
                        "Distância: " + rota.getDistancia() + "\n" +
                        "Endereço: " + rota.getEndereco()
        );
    }

    @FXML
    void ExibirRotas(ActionEvent event) {
        CarregarRotas();
    }

    @FXML
    void RemovRotas(ActionEvent event) {
        Rota rotaselecionada = TableRotas.getSelectionModel().getSelectedItem();

        if (rotaselecionada != null) {
            RotaDAO dao = new RotaDAO();
            dao.deletarRota(rotaselecionada.getId());
            txtresultado.setText("Rota deletada com sucesso");
        } else {
            txtresultado.setText("Nenhuma rota selecionada");
        }
    }

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("trilha");
    }

}
