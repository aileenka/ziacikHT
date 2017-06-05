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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author aileenkaz
 */
public class FXMLgameController implements Initializable {

    @FXML
    private Button start, help, hs, back;
    
    @FXML
    public void backEvent(ActionEvent e) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene rootScene = new Scene(root);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setScene(rootScene);
        app_stage.show();
    }
    
    @FXML
    public void help(ActionEvent e) throws IOException {
        
        Parent help = FXMLLoader.load(getClass().getResource("FXMLhelp.fxml"));
        Scene helpScene = new Scene(help);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setScene(helpScene);
        app_stage.show();
    }
    
    @FXML
    public void highScore(ActionEvent e) throws IOException {
        
        Parent hs = FXMLLoader.load(getClass().getResource("FXMLhighScoreList.fxml"));
        Scene hsScene = new Scene(hs);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setScene(hsScene);
        app_stage.show();
    }
    
    @FXML
    public void startOfGame(ActionEvent e) throws IOException {
        
        Parent game = FXMLLoader.load(getClass().getResource("FXMLgameMode.fxml"));
        Scene gameScene = new Scene(game);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setScene(gameScene);
        app_stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
