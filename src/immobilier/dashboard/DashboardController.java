/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immobilier.dashboard;

import immobilier.add.AddImmo;
import immobilier.utilities.Users;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class DashboardController implements Initializable {

    /**
     *
     */
    @FXML
    public TableView<Users> userTable;
    @FXML
    private TableColumn<Users, String> id;
    @FXML
    private TableColumn<Users, String> name;
    @FXML
    private TableColumn<Users, String> adressUser;
    @FXML
    private TableColumn<Users, String> cin;
    @FXML
    private TextField idUser;
    @FXML
    private TextField userName;
    @FXML
    private TextField adress;
    @FXML
    private TextField cinUser;

    int index;
    ObservableList<Users> list = FXCollections.observableArrayList(
            new Users("1", "Salim Youssef", "Adress ", "BK346543")
    );

    @FXML
    private void addUser(ActionEvent ev) {
        userTable.getItems().add(getUsersInfo());
        viderTextFild();
    }

    public void getSelect() {
        index = userTable.getSelectionModel().getSelectedIndex();
        idUser.setText(id.getCellData(index));
        userName.setText(name.getCellData(index));
        adress.setText(adressUser.getCellData(index));
        cinUser.setText(cin.getCellData(index));
    }

    public void editUsers() {
        list.set(index, getUsersInfo());
        viderTextFild();
    }

    public void deleteUser() {
        userTable.getItems().remove(index);
        viderTextFild();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        adressUser.setCellValueFactory(new PropertyValueFactory<>("adressUser"));
        cin.setCellValueFactory(new PropertyValueFactory<>("cin"));
        userTable.setItems(list);
    }

    public Users getUsersInfo() {
        String i = idUser.getText();
        String n = userName.getText();
        String a = adress.getText();
        String c = cinUser.getText();
        return new Users(i, n, a, c);
    }

    public void viderTextFild() {
        idUser.clear();
        userName.clear();
        adress.clear();
        cinUser.clear();
    }
     @FXML
    public void DashImmobilier() {
        AddImmo Dash = new AddImmo();
        Dashboard.stage.close();
        try {
            Dash.start(new Stage());
        } catch (Exception ex) {
            ex.getMessage();
        }
      
    }
}
