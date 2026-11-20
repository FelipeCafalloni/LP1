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

public class ProdutoController {

    @FXML
    private TableView<Produto> TableProduto;

    @FXML
    private TableColumn<?, ?> colunaCor;

    @FXML
    private TableColumn<?, ?> colunaID;

    @FXML
    private TableColumn<?, ?> colunaNome;

    @FXML
    private TableColumn<?, ?> colunaTamanho;

    @FXML
    private TextField txtcor;

    @FXML
    private TextField txtnome;

    @FXML
    private Label txtresultado;

    @FXML
    private TextField txttamanho;

    @FXML
    public void initialize() {
        colunaID.setCellValueFactory(new PropertyValueFactory<>("id"));
        colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colunaTamanho.setCellValueFactory(new PropertyValueFactory<>("tamanho"));
        colunaCor.setCellValueFactory(new PropertyValueFactory<>("cor"));

        TableProduto.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                txtnome.setText(newSelection.getNome());
                txttamanho.setText(newSelection.getTamanho());
                txtcor.setText(String.valueOf(newSelection.getCor()));
            }
        });
    }

    @FXML
    void CriarClasse(ActionEvent event) {
        String nome = txtnome.getText();
        String tamanho = txttamanho.getText();
        String cor = txtcor.getText();

        Produto produto = new Produto(nome, tamanho, cor);

        ProdutoDAO dao = new ProdutoDAO();
        dao.criaproduto(produto);

        txtresultado.setText(
                "Nome: " + produto.getNome() + "\n" +
                        "Tamanho: " + produto.getTamanho() + "\n" +
                        "Cor: " + produto.getCor()
        );
    }

    public void carregarBanco() {
        ProdutoDAO dao = new ProdutoDAO();

        List<Produto> lista = dao.buscatodos();

        ObservableList<Produto> produtoObservableList = FXCollections.observableArrayList(lista);

        TableProduto.setItems(produtoObservableList);

    }

    @FXML
    void ReadProd(ActionEvent event) {
    carregarBanco();
    }

    @FXML
    void DeleteProd(ActionEvent event) {
        Produto produtoselecionado = TableProduto.getSelectionModel().getSelectedItem();
        if (produtoselecionado != null){
            FuncionarioDAO dao = new FuncionarioDAO();
            dao.deletar(produtoselecionado.getId());

            txtresultado.setText("Produto removido com sucesso");

            carregarBanco();
        } else {
            txtresultado.setText("Nenhum produto selecionado");
        }
    }

    @FXML
    void UpdateProd(ActionEvent event) {

        Produto produtoselecionado = TableProduto.getSelectionModel().getSelectedItem();

        if(produtoselecionado!= null){
            produtoselecionado.setNome(txtnome.getText());
            produtoselecionado.setTamanho(txttamanho.getText());
            produtoselecionado.setCor(txtcor.getText());

            ProdutoDAO dao = new ProdutoDAO();
            dao.atualiza(produtoselecionado);

            carregarBanco();

            txtresultado.setText("Ciclista atualizado com sucesso");
        } else {
            txtresultado.setText("Nenhum ciclista selecionado");
        }

    }

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("loja");
    }

}

