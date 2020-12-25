/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immobilier.add;

import immobilier.utilities.Immobilier;
import immobilier.dashboard.Dashboard;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 *
 * @author Youcode
 */
public class AddImmoController implements Initializable {
    @FXML
    public TableView<Immobilier> immobilierTable;
    @FXML
    private TableColumn<Immobilier, String> id;
    @FXML
    private TableColumn<Immobilier, String> surface;
    @FXML
    private TableColumn<Immobilier, String> type;
    @FXML
    private TableColumn<Immobilier, String> adress;
    @FXML
    private TextField idImmo;
    @FXML
    private TextField immoSurface;
    @FXML
    private TextField immoadress;
    @FXML
    private TextField typeImmo;

    int index;
    ObservableList<Immobilier> list = FXCollections.observableArrayList(
            new Immobilier("1", "125", "Immeuble ", "Adress Immeuble")
    );

    @FXML
    private void addImmo(ActionEvent ev) {
        immobilierTable.getItems().add(getImmobilierInfo());
        viderTextFild();
    }

    public void getSelect() {
        index = immobilierTable.getSelectionModel().getSelectedIndex();
        idImmo.setText(id.getCellData(index));
        immoSurface.setText(surface.getCellData(index));
        immoadress.setText(type.getCellData(index));
        typeImmo.setText(adress.getCellData(index));
    }

    public void editImmo() {
        list.set(index, getImmobilierInfo());
        viderTextFild();
    }

    public void deleteImmo() {
        immobilierTable.getItems().remove(index);
        viderTextFild();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        surface.setCellValueFactory(new PropertyValueFactory<>("surface"));
        type.setCellValueFactory(new PropertyValueFactory<>("type"));
        adress.setCellValueFactory(new PropertyValueFactory<>("adress"));
        immobilierTable.setItems(list);
    }

    public Immobilier getImmobilierInfo() {
        String i = idImmo.getText();
        String n = immoSurface.getText();
        String a = immoadress.getText();
        String c = typeImmo.getText();
        return new Immobilier(i, n, a, c);
    }

    public void viderTextFild() {
        idImmo.clear();
        immoSurface.clear();
        immoadress.clear();
        typeImmo.clear();
    }

  
    
     public void DashUsers() {
        Dashboard Dash = new Dashboard();
        AddImmo.stage.close();
        try {
            Dash.start(new Stage());
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

}
