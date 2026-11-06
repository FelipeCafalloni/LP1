package org.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.List;

public class CiclistaController {

    @FXML
    private TableView<Ciclista> TableCiclistas;

    @FXML
    private TableColumn<?, ?> colunaGenero;

    @FXML
    private TableColumn<?, ?> colunaID;

    @FXML
    private TableColumn<?, ?> colunaNome;

    @FXML
    private TableColumn<?, ?> colunaIdade;

    @FXML
    private TextField txtgenero;

    @FXML
    private TextField txtidade;

    @FXML
    private TextField txtnome;

    @FXML
    private Label txtresultado;

    @FXML
    public void initialize() {
        colunaID.setCellValueFactory(new PropertyValueFactory<>("id"));
        colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colunaIdade.setCellValueFactory(new PropertyValueFactory<>("idade"));
        colunaGenero.setCellValueFactory(new PropertyValueFactory<>("genero"));

        TableCiclistas.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                txtnome.setText(newSelection.getNome());
                txtidade.setText(String.valueOf(newSelection.getIdade()));
                txtgenero.setText(newSelection.getGenero());
            }
        });

    }

    @FXML
    void CriarClasse(ActionEvent event) {
        String nome = txtnome.getText();
        int idade = Integer.parseInt(txtidade.getText());
        String genero = txtgenero.getText();

        Ciclista ciclista = new Ciclista(nome, genero, idade);

        CiclistaDAO dao = new CiclistaDAO();
        dao.criaciclista(ciclista);


        txtresultado.setText(
                "Nome: " + ciclista.getNome() + "\n" +
                        "Gênero: " + ciclista.getGenero() + "\n" +
                        "Idade: " + ciclista.getIdade()
        );
    }

    @FXML
    void DeleteCicli(ActionEvent event) {
    Ciclista ciclistaSelecionado = TableCiclistas.getSelectionModel().getSelectedItem();

    if (ciclistaSelecionado != null){
        CiclistaDAO dao = new CiclistaDAO();
        dao.deletar(ciclistaSelecionado.getId());

        txtresultado.setText("Ciclista removido com sucesso");

        carregarBanco();
    } else {
        txtresultado.setText("Nenhum ciclista selecionado");
    }
    }

    @FXML
    void ReadCicli(ActionEvent event) {

        carregarBanco();

    }

    public void carregarBanco(){
        CiclistaDAO dao = new CiclistaDAO();

        List <Ciclista> lista = dao.buscaTodos();

        ObservableList<Ciclista> ciclistasObservable = FXCollections.observableArrayList(lista);

        TableCiclistas.setItems(ciclistasObservable);

    }

    @FXML
    void UpdateCicli(ActionEvent event) {

        Ciclista ciclistaSelecionado = TableCiclistas.getSelectionModel().getSelectedItem();

        if(ciclistaSelecionado != null){
            ciclistaSelecionado.setNome(txtnome.getText());
            ciclistaSelecionado.setIdade(Integer.parseInt(txtidade.getText()));
            ciclistaSelecionado.setGenero(txtgenero.getText());

            CiclistaDAO dao = new CiclistaDAO();
            dao.atualiza(ciclistaSelecionado);

            carregarBanco();

            txtresultado.setText("Ciclista atualizado com sucesso");
        } else {
            txtresultado.setText("Nenhum ciclista selecionado");
        }
    }


    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("trilha");
    }

}
