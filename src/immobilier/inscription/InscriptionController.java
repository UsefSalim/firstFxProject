/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immobilier.inscription;

import immobilier.Immobilier;
import immobilier.dashboard.*;
import immobilier.utilities.UsersAccount;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Youcode
 */
public class InscriptionController implements Initializable {

    /**
     *
     */
    @FXML
    public TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private PasswordField confirmPassword;

    @FXML
    private void inscription(ActionEvent ev) {
        String n = username.getText();
        String p = password.getText();
        String cp = confirmPassword.getText();
        if (!p.equals(cp)) {
            Alert alertLOgin = new Alert(Alert.AlertType.ERROR);
            alertLOgin.setTitle("Erreur d'inscription");
            alertLOgin.setContentText("les 2 mots de passe ne sont pas identique");
            alertLOgin.show();
        } else {
            UsersAccount.createUser(n, p);
            Dashboard Dash = new Dashboard();
            Inscription.stage.close();
            try {
                Dash.start(new Stage());
            } catch (Exception ex) {
                ex.getMessage();
            }
        }

    }

    @FXML
    private void redirectLogin() {
        Immobilier Dash = new Immobilier();
        Inscription.stage.close();
        try {
            Dash.start(new Stage());
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
