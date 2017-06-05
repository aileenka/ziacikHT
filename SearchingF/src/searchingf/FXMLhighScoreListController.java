/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author aileenkaz
 */
public class FXMLhighScoreListController implements Initializable {

    @FXML
    Label hScore;
    
    @FXML
    public void backEvent(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene rootScene = new Scene(root);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setScene(rootScene);
        app_stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        String path = null;
        try {
            path = new File(".").getCanonicalPath();
        } catch (IOException ex) {
            Logger.getLogger(FXMLendOfGameController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        File highscore = new File(path+"/highscore.txt");
        
        BufferedReader brHs = null;
        try {
            brHs = new BufferedReader(new FileReader(highscore));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLendOfGameController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String [] hs = null;
        try {
            hs = brHs.readLine().split(",");
            brHs.close();
        } catch (IOException ex) {
            Logger.getLogger(FXMLendOfGameController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int [] sortedHs = new int [] {Integer.parseInt(hs[0]),Integer.parseInt(hs[1]),Integer.parseInt(hs[2]),Integer.parseInt(hs[3]),Integer.parseInt(hs[4])};
        Arrays.sort(sortedHs);
        
        hScore.setText(sortedHs[4]+"\n"+sortedHs[3]+"\n"+sortedHs[2]+"\n"+sortedHs[1]+"\n"+sortedHs[1]);
    }    
    
}
