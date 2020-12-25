/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immobilier;

import immobilier.utilities.UsersAccount;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Youcode
 */
public class Immobilier extends Application {

    public static Stage stageLogin;

   

    @Override
    public void start(Stage stage) throws Exception {
        UsersAccount.createUser("admin", "admin");
        UsersAccount.createUser("Salim2", "1234567");
        UsersAccount.createUser("Salim3", "1234567");
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stageLogin = stage;       
        stage.setTitle("Salim");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
