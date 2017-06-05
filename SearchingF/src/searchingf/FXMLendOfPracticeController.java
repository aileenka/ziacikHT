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
public class FXMLendOfPracticeController implements Initializable {
    
    @FXML
    Label joke, percentage;
    
    @FXML
    public void backToMenu(ActionEvent e) throws IOException {
        
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
            Logger.getLogger(FXMLendOfPracticeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        File file = new File(path+"/result.txt");
        
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLendOfPracticeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            
            float perc = Float.parseFloat(br.readLine())*100;
            percentage.setText(perc+"%");
            br.close();
            
            if(perc <= (float) 25) {
                joke.setText("Mal by si sa nad situáciou povzniesť a ísť si precvičiť hru na triangel.");
            } else if(perc > (float) 25 && perc <= (float) 60) {
                joke.setText("V notách sa zatiaľ ešte nevyznáš, no tipuješ ako \"starý stávkar\".");
            } else if(perc > (float) 60 && perc <= (float) 80) {
                joke.setText("Nebol si ani dobrý, ani zlý. Je to niečo medzi nebom a zemou. \nPomôcka: Nota bez krížika sa môže rovnať aj note s krížikom.");
            } else if(perc > (float) 80 && perc <= (float) 90) {
                joke.setText("Vidím, že poznáš základnú hudobnú teóriu. Ak by si sa hecol \ntak by si to dal aj na 100%.");
            } else if(perc > (float) 90 && perc < (float) 100) {
                joke.setText("Drobné chybičky sa v hudbe musia vyskytovať. \nAko by inak vznikol jazz ?.");
            } else if(perc == (float) 100) {
                joke.setText("Dostal si sa na 100. Si veľmi dobrý! No stavím sa, že na \ndruhý pokus to už nedáš!");
            } else if(perc == (float) 0) {
                joke.setText("Neplač. Boli tu aj horší.");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(FXMLendOfPracticeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }    
    
}
