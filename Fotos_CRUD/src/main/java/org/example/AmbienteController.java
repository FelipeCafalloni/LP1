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

public class AmbienteController {

    @FXML
    private TableView<Ambiente> TableAmbiente;

    @FXML
    private TableColumn<?, ?> colunaAnimais;

    @FXML
    private TableColumn<?, ?> colunaBioma;

    @FXML
    private TableColumn<?, ?> colunaID;

    @FXML
    private TableColumn<?, ?> colunaPostos;

    @FXML
    private TextField txtperigo;

    @FXML
    private TextField txtbioma;

    @FXML
    private TextField txtqtd;

    @FXML
    private Label txtresultado;

    @FXML
    public void initialize() {
        colunaID.setCellValueFactory(new PropertyValueFactory<>("id"));
        colunaBioma.setCellValueFactory(new PropertyValueFactory<>("bioma"));
        colunaPostos.setCellValueFactory(new PropertyValueFactory<>("qtd"));
        colunaAnimais.setCellValueFactory(new PropertyValueFactory<>("perigo"));

        TableAmbiente.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                txtbioma.setText(newSelection.getBioma());
                txtqtd.setText(String.valueOf(newSelection.getQtd()));
                txtperigo.setText(newSelection.getAnimalPerigo());
            }
        });
    }

        public void carregarBanco(){
            AmbienteDAO dao = new AmbienteDAO();

            List<Ambiente> lista = dao.buscaTodos();

            ObservableList<Ambiente> ambientesObservable = FXCollections.observableArrayList(lista);

            TableAmbiente.setItems(ambientesObservable);

        }

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("trilha");
    }

    @FXML
    void CriarClasse(ActionEvent event) throws IOException {
        String bioma = (txtbioma.getText());
        int qtd = Integer.parseInt(txtqtd.getText());
        String animalPerigo = txtperigo.getText();
        Ambiente ambiente = new Ambiente(bioma, qtd, animalPerigo);

            AmbienteDAO dao = new AmbienteDAO();
            dao.criaambiente(ambiente);

        txtresultado.setText(
                "Bioma: " + ambiente.getBioma() + "\n" +
                        "Quantidade de postos: " + ambiente.getQtd() + "\n" +
                        "Animal perigoso: " + ambiente.getAnimalPerigo()
        );
    }

    @FXML
    void DeleteAmb(ActionEvent event) {
    Ambiente ambienteselecionado = TableAmbiente.getSelectionModel().getSelectedItem();
        if (ambienteselecionado != null){
            AmbienteDAO dao = new AmbienteDAO();
            dao.deletar(ambienteselecionado.getId());

            txtresultado.setText("Ambiente removido com sucesso");

            carregarBanco();
        } else {
            txtresultado.setText("Nenhum ambiente selecionado");
        }
    }

    @FXML
    void ReadAmb(ActionEvent event) {
    carregarBanco();
    }

    @FXML
    void UpdateAmb(ActionEvent event) {

    Ambiente ambienteselecionados = TableAmbiente.getSelectionModel().getSelectedItem();

    if(ambienteselecionados != null){
        ambienteselecionados.setBioma(txtbioma.getText());
        ambienteselecionados.setQtd(Integer.parseInt(txtqtd.getText()));
        ambienteselecionados.setAnimalPerigo(txtperigo.getText());

            AmbienteDAO dao = new AmbienteDAO();
            dao.atualiza(ambienteselecionados);

            carregarBanco();

            txtresultado.setText("Ciclista atualizado com sucesso");
    } else {
            txtresultado.setText("Nenhum ciclista selecionado");
            }
    }

}
