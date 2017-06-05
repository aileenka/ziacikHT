/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author aileenkaz
 */
public class FXMLsettingsController implements Initializable {

    protected boolean tones;
    protected boolean sharps;
    protected boolean bs;
    
    @FXML
    CheckBox sharpCheck0, bCheck0, toneCheck0;
    
    @FXML
    public void sharpCheck(ActionEvent e) throws IOException {
        
        String path = null;
        try {
            path = new File(".").getCanonicalPath();
        } catch (IOException ex) {
            Logger.getLogger(FXMLsettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        File settings = new File(path+"/settings.txt");
        if(settings.exists() == false) {
            settings.createNewFile();
        }
        
        BufferedReader br = new BufferedReader(new FileReader(settings));
        String [] set = br.readLine().split(",");
        br.close();
        
        if(sharpCheck0.isSelected()) {
            sharps = true;
        } else sharps = false;
        
        BufferedWriter bw = new BufferedWriter(new FileWriter(settings));
        bw.write(sharps+","+set[1]+","+set[2]);
        bw.close();
        
    }
    
    @FXML
    public void bCheck(ActionEvent e) throws IOException {
        
        String path = null;
        try {
            path = new File(".").getCanonicalPath();
        } catch (IOException ex) {
            Logger.getLogger(FXMLsettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        File settings = new File(path+"/settings.txt");
        if(settings.exists() == false) {
            settings.createNewFile();
        }
        
        BufferedReader br = new BufferedReader(new FileReader(settings));
        String [] set = br.readLine().split(",");
        br.close();
        
        if(bCheck0.isSelected()) {
            bs = true;
        } else bs = false;
        
        BufferedWriter bw = new BufferedWriter(new FileWriter(settings));
        bw.write(set[0]+","+bs+","+set[2]);
        bw.close();
    }
    
    @FXML
    public void toneCheck(ActionEvent e) throws IOException {
        
        String path = null;
        try {
            path = new File(".").getCanonicalPath();
        } catch (IOException ex) {
            Logger.getLogger(FXMLsettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        File settings = new File(path+"/settings.txt");
        if(settings.exists() == false) {
            settings.createNewFile();
        }
        
        BufferedReader br = new BufferedReader(new FileReader(settings));
        String [] set = br.readLine().split(",");
        br.close();
        
        if(toneCheck0.isSelected()) {
            tones = true;
        } else tones = false;
        
        BufferedWriter bw = new BufferedWriter(new FileWriter(settings));
        bw.write(set[0]+","+set[1]+","+tones);
        bw.close();
    }
    
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
            Logger.getLogger(FXMLsettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        File settings = new File(path+"/settings.txt");
        if(settings.exists() == false) {
            try {
                settings.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(FXMLsettingsController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(settings));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLsettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String [] set = null;
                
        try {
            set = br.readLine().split(",");
        } catch (IOException ex) {
            Logger.getLogger(FXMLsettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(FXMLsettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(set[0].equals("true")) {
            sharpCheck0.setSelected(true);
        } else sharpCheck0.setSelected(false);
        
        if(set[1].equals("true")) {
            bCheck0.setSelected(true);
        } else bCheck0.setSelected(false);
        
        if(set[2].equals("true")) {
            toneCheck0.setSelected(true);
        } else toneCheck0.setSelected(false);
        
    }    
    
}
