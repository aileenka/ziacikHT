/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingf;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class SearchingF extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        String path = null;
        try {
            path = new File(".").getCanonicalPath();
        } catch (IOException ex) {
            Logger.getLogger(FXMLsettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        File highscore = new File(path+"/highscore.txt");
        if(highscore.exists() == false) {
            highscore.createNewFile();
            BufferedWriter bwHs = new BufferedWriter(new FileWriter(highscore));
            bwHs.write("0,0,0,0,0");
            bwHs.close();
        }
        
        File hsNames = new File(path+"/hsNames.txt");
        if(highscore.exists() == false) {
            highscore.createNewFile();
            BufferedWriter bwHsNames = new BufferedWriter(new FileWriter(highscore));
            bwHsNames.write("0nan,0nan,0nan,0nan,0nan");
            bwHsNames.close();
        }
        
        File results = new File(path+"/result.txt");
        results.createNewFile();
        
        File settings = new File(path+"/settings.txt");
        settings.createNewFile();
        BufferedWriter bw = new BufferedWriter(new FileWriter(settings));
        bw.write("false,false,false");
        bw.close();
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
