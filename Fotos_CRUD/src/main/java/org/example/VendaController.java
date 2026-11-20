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

public class VendaController {

    @FXML
    private TableView<Venda> TableVendas;

    @FXML
    private TableColumn<?, ?> colunaCli;

    @FXML
    private TableColumn<?, ?> colunaID;

    @FXML
    private TableColumn<?, ?> colunaValor;

    @FXML
    private TableColumn<?, ?> colunaVend;

    @FXML
    private TextField txtcli;

    @FXML
    private Label txtresultado;

    @FXML
    private TextField txtvalor;

    @FXML
    private TextField txtvend;

    @FXML
    public void initialize() {
        colunaID.setCellValueFactory(new PropertyValueFactory<>("id"));
        colunaVend.setCellValueFactory(new PropertyValueFactory<>("vendedor"));
        colunaCli.setCellValueFactory(new PropertyValueFactory<>("cliente"));
        colunaValor.setCellValueFactory(new PropertyValueFactory<>("valor"));

        TableVendas.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                txtvend.setText(newSelection.getVendedor());
                txtcli.setText(newSelection.getCliente());
                txtvalor.setText(String.valueOf(newSelection.getValor()));
            }
        });
    }

    @FXML
    void CriarClasse(ActionEvent event) {
        String vendedor = txtvend.getText();
        String cliente = txtcli.getText();
        double valor = Double.parseDouble(txtvalor.getText());

        Venda venda = new Venda(vendedor, cliente, valor);

        VendaDAO dao = new VendaDAO();
        dao.criavenda(venda);

        txtresultado.setText(
                "Vendedor: " + venda.getVendedor() + "\n" +
                        "Cliente: " + venda.getCliente() + "\n" +
                        "Valor: R$ " + venda.getValor()
        );
    }

    public void carregarBanco() {
        VendaDAO dao = new VendaDAO();

        List<Venda> lista = dao.buscaTodos();

        ObservableList<Venda> vendaObservableList = FXCollections.observableArrayList(lista);

        TableVendas.setItems(vendaObservableList);

    }


    @FXML
    void ReadVenda(ActionEvent event) {
    carregarBanco();
    }

    @FXML
    void DeleteVenda(ActionEvent event) {
        Venda vendaselecionada = TableVendas.getSelectionModel().getSelectedItem();
        if (vendaselecionada != null){
            VendaDAO dao = new VendaDAO();
            dao.deletar(vendaselecionada.getId());

            txtresultado.setText("Venda cancelada com sucesso");

            carregarBanco();
        } else {
            txtresultado.setText("Nenhuma venda selecionada");
        }
    }

    @FXML
    void UpdateVenda(ActionEvent event) {

        Venda vendaselecionada = TableVendas.getSelectionModel().getSelectedItem();

        if(vendaselecionada != null){
            vendaselecionada.setVendedor(txtvend.getText());
            vendaselecionada.setCliente(txtcli.getText());
            vendaselecionada.setValor(Double.parseDouble(txtvalor.getText()));

            VendaDAO dao = new VendaDAO();
            dao.atualiza(vendaselecionada);

            carregarBanco();

            txtresultado.setText("Venda atualizada com sucesso");
        } else {
            txtresultado.setText("Nenhuma venda selecionada");
        }

    }

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("loja");
    }

}
