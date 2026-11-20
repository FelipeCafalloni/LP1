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

public class FuncionarioController {

    @FXML
    private TableView<Funcionario> TableFuncionarios;

    @FXML
    private TableColumn<?, ?> colunaCargo;

    @FXML
    private TableColumn<?, ?> colunaID;

    @FXML
    private TableColumn<?, ?> colunaNome;

    @FXML
    private TableColumn<?, ?> colunaSalario;

    @FXML
    private TextField txtcargo;

    @FXML
    private TextField txtnome;

    @FXML
    private Label txtresultado;

    @FXML
    private TextField txtsalario;

    @FXML
    public void initialize() {
        colunaID.setCellValueFactory(new PropertyValueFactory<>("id"));
        colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colunaCargo.setCellValueFactory(new PropertyValueFactory<>("cargo"));
        colunaSalario.setCellValueFactory(new PropertyValueFactory<>("salario"));

        TableFuncionarios.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                txtnome.setText(newSelection.getNome());
                txtcargo.setText(newSelection.getCargo());
                txtsalario.setText(String.valueOf(newSelection.getSalario()));
            }
        });
    }

    @FXML
    void CriarClasse(ActionEvent event) throws IOException{
        String nome = txtnome.getText();
        String cargo = txtcargo.getText();
        double salario = Double.parseDouble(txtsalario.getText());

        Funcionario funcionario = new Funcionario(nome, cargo, salario);
        FuncionarioDAO dao = new FuncionarioDAO();
        dao.criafuncionario(funcionario);

        txtresultado.setText(
                "Nome: " + funcionario.getNome() + "\n" +
                        "Cargo: " + funcionario.getCargo() + "\n" +
                        "Salário: R$ " + funcionario.getSalario()
        );
    }


    public void carregarBanco() {
        FuncionarioDAO dao = new FuncionarioDAO();

        List<Funcionario> lista = dao.buscaTodos();

        ObservableList<Funcionario> funcionarioObservableList = FXCollections.observableArrayList(lista);

        TableFuncionarios.setItems(funcionarioObservableList);

    }

    @FXML
    void ReadFunc(ActionEvent event) throws IOException{
    carregarBanco();
    }

    @FXML
    void DeleteFunc(ActionEvent event) {

        Funcionario funcionarioselecionado = TableFuncionarios.getSelectionModel().getSelectedItem();
        if (funcionarioselecionado != null){
            FuncionarioDAO dao = new FuncionarioDAO();
            dao.deletar(funcionarioselecionado.getId());

            txtresultado.setText("Funcionario eliminado com sucesso");

            carregarBanco();
        } else {
            txtresultado.setText("Nenhum funcionario selecionado");
        }

    }

    @FXML
    void UpdateFunc(ActionEvent event) {

        Funcionario funcionarioselcionado = TableFuncionarios.getSelectionModel().getSelectedItem();

        if(funcionarioselcionado != null){
            funcionarioselcionado.setNome(txtnome.getText());
            funcionarioselcionado.setCargo(txtcargo.getText());
            funcionarioselcionado.setSalario(Double.parseDouble(txtsalario.getText()));

            FuncionarioDAO dao = new FuncionarioDAO();
            dao.atualiza(funcionarioselcionado);

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
