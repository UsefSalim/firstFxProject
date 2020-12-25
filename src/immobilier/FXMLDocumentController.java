/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immobilier;


import immobilier.dashboard.Dashboard;
import immobilier.inscription.Inscription;
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
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField userName;
    @FXML
    private PasswordField password;
    //private Button login;

    @FXML
    private void login(ActionEvent e) {
        String name = userName.getText();
        String pass = password.getText();
        for (String i : UsersAccount.Users.keySet()) {
            if (i.equals(name) && UsersAccount.Users.get(i).equals(pass)) {
                Dashboard Dash = new Dashboard();
                Immobilier.stageLogin.close();
                try {
                    Dash.start(new Stage());
                } catch (Exception ex) {
                    ex.getMessage();
                }
                break;
            } else {
                Alert alertLOgin = new Alert(Alert.AlertType.ERROR);
                alertLOgin.setTitle("Erreur de connexion");
                alertLOgin.setContentText("Votre identifiant ou mots de passe sont incorrecte");
                alertLOgin.show();
                break;
            }
        }
    }
    @FXML
    private void inscription(){
         Inscription Dash = new Inscription();
                Immobilier.stageLogin.close();
                try {
                    Dash.start(new Stage());
                } catch (Exception ex) {
                    ex.getMessage();
                }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
