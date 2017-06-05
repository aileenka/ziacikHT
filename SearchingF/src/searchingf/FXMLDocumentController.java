/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingf;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author aileenkaz
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button settings, game, practice, exit;
    
    @FXML
    public void settingsEvent(ActionEvent e) throws IOException {
        
        Parent settings = FXMLLoader.load(getClass().getResource("FXMLsettings.fxml"));
        Scene settingsScene = new Scene(settings);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setScene(settingsScene);
        app_stage.show();
    }
    
    @FXML
    public void practiceEvent(ActionEvent e) throws IOException {
        
        Parent practice = FXMLLoader.load(getClass().getResource("FXMLpractice.fxml"));
        Scene practiceScene = new Scene(practice);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setScene(practiceScene);
        app_stage.show();
    }
    
    @FXML
    public void gameEvent(ActionEvent e) throws IOException {
        
        Parent game = FXMLLoader.load(getClass().getResource("FXMLgame.fxml"));
        Scene gameScene = new Scene(game);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setScene(gameScene);
        app_stage.show();
    }
    
    @FXML
    public void end(ActionEvent e) throws IOException {
        
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
