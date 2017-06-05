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
import java.util.Random;
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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

/**
 * FXML Controller class
 *
 * @author aileenkaz
 */
public class FXMLpracticeController implements Initializable {

    @FXML
    Button start, next;

    /**
     * Initializes the controller class.
     */
    @FXML
    Button c, ces, cis, d, dis, des, e, es, f, fis, g, gis, ges, a, b, Bb;
    
    @FXML
    Label tries, right;
    
    @FXML
    Line helpLine;
    
    @FXML
    ImageView violinKey, note0, note1, note2, note3, note4, note5, note6, note7, note8, note9, note10, note11,
                        sharp0, sharp1, sharp2, sharp3, sharp4, sharp5, sharp6, sharp7, sharp8, sharp9, sharp10, sharp11,
                        b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;
    
    private ImageView [] noteArray;
    private ImageView [] sharpArray;
    private ImageView [] bArray;
    private Button [] buttonsArray;
    
    private boolean sharps, bs, tone;
    private int show;
    @FXML
    private Label countdown;
    
    @FXML
    public void cA(ActionEvent e) throws IOException, InterruptedException, LineUnavailableException {
        
        for(int i = 0; i < buttonsArray.length; i++) {
            buttonsArray[i].setStyle(null);
        }
        
        if(sharps == true || bs == true) {
            
            if(sharp6.isVisible() && show == 6
                    || show == 0 && sharp0.isVisible() == false && b0.isVisible() == false 
                    || show == 7 && sharp7.isVisible() == false && b7.isVisible() == false) {
                
                if(show == 0) {
                    tone(26163);
                } else tone(52325);
                
                good(c);
            } else bad(c);
        } else {
            
            if(show == 0 || show == 7) {
                
                if(show == 0) {
                    tone(26163);
                } else tone(52325);
                good(c);
                
            } else bad(c);
        }
    }
    
    @FXML
    public void dA(ActionEvent e) throws IOException, LineUnavailableException {
        
        for(int i = 0; i < buttonsArray.length; i++) {
            buttonsArray[i].setStyle(null);
        }
        
        if(sharps == true || bs == true) {
            
            if(show == 1 && sharp1.isVisible() == false && b1.isVisible() == false 
            || show == 8 && sharp8.isVisible() == false && b8.isVisible() == false) {
                
                if(show == 1) {
                    tone(29366);
                } else tone(58733);
                good(d);
            } else bad(d);
        } else {
            
            if(show == 1 || show == 8) {
                
                if(show == 1) {
                    tone(29366);
                } else tone(58733);
                good(d);
            } else bad(d);
        }
    }
    
    @FXML
    public void eA(ActionEvent ev) throws IOException, LineUnavailableException {
        
        for(int i = 0; i < buttonsArray.length; i++) {
            buttonsArray[i].setStyle(null);
        }
        
        if(sharps == true || bs == true) {
            
            if(b3.isVisible() && show == 3 || b10.isVisible() && show == 10
                    || show == 2 && sharp2.isVisible() == false && b2.isVisible() == false 
                    || show == 9 && sharp9.isVisible() == false && b9.isVisible() == false) {
                
                if(show == 2 || show == 3) {
                    tone(32963);
                } else tone(65925);
                good(e);
            } else bad(e);
        } else {
            
            if(show == 2 || show == 9) {
                
                if(show == 2) {
                    tone(32963);
                } else tone(65925);
                good(e);
            } else bad(e);
        }
    }
    
    @FXML
    public void fA(ActionEvent e) throws IOException, LineUnavailableException {
        
        for(int i = 0; i < buttonsArray.length; i++) {
            buttonsArray[i].setStyle(null);
        }
        
        if(sharps == true || bs == true) {
            
            if(sharp2.isVisible() && show == 2 || sharp9.isVisible() && show == 9
                    || show == 3 && sharp3.isVisible() == false && b3.isVisible() == false 
                    || show == 10 && sharp10.isVisible() == false && b10.isVisible() == false) {
                
                if(show == 2 || show == 3) {
                    tone(34923);
                } else tone(69846);
                good(f);
            } else bad(f);
        } else {
            
            if(show == 3 || show == 10) {
                
                if(show == 2 || show == 3) {
                    tone(34923);
                } else tone(69846);
                good(f);
            } else bad(f);
        }
    }
    
    @FXML
    public void gA(ActionEvent e) throws IOException, LineUnavailableException {
        
        for(int i = 0; i < buttonsArray.length; i++) {
            buttonsArray[i].setStyle(null);
        }
        
        if(sharps == true || bs == true) {
            
            if(show == 4 && sharp4.isVisible() == false && b4.isVisible() == false 
            || show == 11 && sharp11.isVisible() == false && b11.isVisible() == false) {
                
                if(show == 4) {
                    tone(39200);
                } else tone(78399);
                good(g);
            } else bad(g);
        } else {
            
            if(show == 4 || show == 11) {
                
                if(show == 4) {
                    tone(39200);
                } else tone(78399);
                good(g);
            } else bad(g);
        }
    }
    
    @FXML
    public void aA(ActionEvent e) throws IOException, LineUnavailableException {
        
        for(int i = 0; i < buttonsArray.length; i++) {
            buttonsArray[i].setStyle(null);
        }
        
        if(sharps == true || bs == true) {
            
            if(show == 5 && sharp5.isVisible() == false && b5.isVisible() == false) {
                
                tone(44000);
                good(a);
            } else bad(a);
        } else {
            
            if(show == 5) {
                
                tone(44000);
                good(a);
            } else bad(a);
        }
    }
    
    @FXML
    public void bA(ActionEvent e) throws IOException, LineUnavailableException {
        
        for(int i = 0; i < buttonsArray.length; i++) {
            buttonsArray[i].setStyle(null);
        }
        
        if(sharps == true || bs == true) {
            
            if(b0.isVisible() && show == 0 || b7.isVisible() && show == 7
            || show == 6 && sharp6.isVisible() == false && b6.isVisible() == false) {
                
                tone(49388);
                good(b);
            } else bad(b);
        } else {
            
            if(show == 6) {
                
                tone(49388);
                good(b);
            } else bad(b);
        }
    }
    
    @FXML
    public void cisA(ActionEvent e) throws IOException, LineUnavailableException {
        
        for(int i = 0; i < buttonsArray.length; i++) {
            buttonsArray[i].setStyle(null);
        }
        
        if(sharp0.isVisible() && show == 0 || sharp7.isVisible() && show == 7
        || b1.isVisible() && show == 1 || b8.isVisible() && show == 8) {
                
            if(show == 0 || show == 1) {
                    tone(27718);
                } else tone(55437);
            good(cis);
                
        } else bad(cis);
        
    }
    
    @FXML
    public void disA(ActionEvent e) throws IOException, LineUnavailableException {
        
        for(int i = 0; i < buttonsArray.length; i++) {
            buttonsArray[i].setStyle(null);
        }
        
        if(sharp1.isVisible() && show == 1 || sharp8.isVisible() && show == 8
        || b2.isVisible() && show == 2 || b9.isVisible() && show == 9) {
                
            if(show == 1 || show == 2) {
                    tone(31113);
                } else tone(62225);
            good(dis);
                
        } else bad(dis);
    }
    
    @FXML
    public void fisA(ActionEvent e) throws IOException, LineUnavailableException {
        
        for(int i = 0; i < buttonsArray.length; i++) {
            buttonsArray[i].setStyle(null);
        }
        
        if(sharp3.isVisible() && show == 3 || sharp10.isVisible() && show == 10
        || b4.isVisible() && show == 4 || b11.isVisible() && show == 11) {
                
            if(show == 3 || show == 4) {
                    tone(36999);
                } else tone(73999);
            good(fis);
                
        } else bad(fis);
    }
    
    @FXML
    public void gisA(ActionEvent e) throws IOException, LineUnavailableException {
        
        for(int i = 0; i < buttonsArray.length; i++) {
            buttonsArray[i].setStyle(null);
        }
        
        if(sharp4.isVisible() && show == 4 || sharp11.isVisible() && show == 11
        || b5.isVisible() && show == 5) {
                
            if(show == 4 || show == 5) {
                    tone(41530);
                } else tone(83061);
            good(gis);
                
        } else bad(gis);
    }
    
    @FXML
    public void cesA(ActionEvent e) throws IOException, LineUnavailableException {
        
        for(int i = 0; i < buttonsArray.length; i++) {
            buttonsArray[i].setStyle(null);
        }
        
        if(b0.isVisible() && show == 0 || b7.isVisible() && show == 7 
        || sharp6.isVisible() && show == 6) {
            
            if(show == 0) {
                    tone(24694);
                } else tone(49388);
            good(ces);
            
        } else bad(ces);
    }
    
    @FXML
    public void desA(ActionEvent e) throws IOException, LineUnavailableException {
        
        for(int i = 0; i < buttonsArray.length; i++) {
            buttonsArray[i].setStyle(null);
        }
        
        if(b1.isVisible() && show == 1 || b8.isVisible() && show == 8 
        || sharp0.isVisible() && show == 0 || sharp7.isVisible() && show == 7) {
            
            if(show == 0 || show == 1) {
                    tone(27718);
                } else tone(55437);
            good(des);
            
        } else bad(des);
    }
    
    @FXML
    public void esA(ActionEvent e) throws IOException, LineUnavailableException {
        
        for(int i = 0; i < buttonsArray.length; i++) {
            buttonsArray[i].setStyle(null);
        }
        
        if(b2.isVisible() && show == 2 || b9.isVisible() && show == 9 
        || sharp1.isVisible() && show == 1 || sharp8.isVisible() && show == 8) {
            
            if(show == 2 || show == 1) {
                    tone(31113);
                } else tone(62225);
            good(es);
            
        } else bad(es);
    }
    
    @FXML
    public void gesA(ActionEvent e) throws IOException, LineUnavailableException {
        
        for(int i = 0; i < buttonsArray.length; i++) {
            buttonsArray[i].setStyle(null);
        }
        
        if(b4.isVisible() && show == 4 || b10.isVisible() && show == 10 
        || sharp3.isVisible() && show == 3 || sharp9.isVisible() && show == 9) {
            
            if(show == 3 || show == 4) {
                    tone(36999);
                } else tone(73999);
            good(ges);
            
        } else bad(ges);
    }
    
    @FXML
    public void BbA(ActionEvent e) throws IOException, LineUnavailableException {
        
        for(int i = 0; i < buttonsArray.length; i++) {
            buttonsArray[i].setStyle(null);
        }
        
        if(b6.isVisible() && show == 6 
        || sharp5.isVisible() && show == 5) {
            
            tone(46616);
            good(Bb);
            
        } else bad(Bb);
    }
    
    
    public void next(ActionEvent e) throws IOException {
        
        next();
    }
    
    @FXML
    public void start(ActionEvent e) throws IOException {
        
        next.setDisable(false);
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
        
        sharps = Boolean.parseBoolean(set[0]);
        bs = Boolean.parseBoolean(set[1]);
        tone = Boolean.parseBoolean(set[2]);
        
        
        
        Random raNum = new Random();
        
        int bOrS = raNum.nextInt(2); //b or sharp
        int ifBorS = raNum.nextInt(2); //if b or sharp will be included
        
        show = raNum.nextInt(11);
        
        if(ifBorS == 1) {
            
            if(set[0].equals("true") && set[1].equals("true")) {
            
                if(bOrS == 0) {

                    sharpArray[show].setVisible(true);
                } else bArray[show].setVisible(true);
                
            } else if (set[0].equals("true")) {

                sharpArray[show].setVisible(true);
            } else if(set[1].equals("true")) {

                bArray[show].setVisible(true);
            }
        }
        
        for(int i = 0; i < buttonsArray.length; i++) {
            
            if(i < 7) {
                buttonsArray[i].setDisable(false);
            }
            
            if(set[0].equals("true")) {
                if(i > 6 && i < 11) {
                    buttonsArray[i].setDisable(false);
                }
            }
            
            if(set[1].equals("true")) {
                if(i > 10) {
                    buttonsArray[i].setDisable(false);
                }
            }
        }
                    
        noteArray[show].setVisible(true);
        
        if(show == 0) {
            
            helpLine.setVisible(true);
        }
        
        start.setDisable(true);
    }
    
    public void exit(ActionEvent e) throws IOException {
        
        String path = new File(".").getCanonicalPath();
        File file = new File(path+"/result.txt");
        float percentage;
        
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        
        percentage = Float.parseFloat(right.getText()) / Float.parseFloat(tries.getText());
        bw.write(percentage+"");
        bw.close();
        
        Parent endOfPractice = FXMLLoader.load(getClass().getResource("FXMLendOfPractice.fxml"));
        Scene endOfPracticeScene = new Scene(endOfPractice);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setScene(endOfPracticeScene);
        app_stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        next.setDisable(true);
        buttonsArray = new Button[] {c, d, e, f, g, a, b, cis, dis, fis, 
                                    gis, ces, des, es, ges, Bb};
        
        noteArray = new ImageView[] {note0,note1,note2,note3,note4,note5,
                                    note6,note7,note8,note9,note10,note11};
        
        sharpArray = new ImageView[] {sharp0,sharp1,sharp2,sharp3,sharp4,sharp5,
                                    sharp6,sharp7,sharp8,sharp9,sharp10,sharp11};
        
        bArray = new ImageView[] {b0,b1,b2,b3,b4,b5,
                                    b6,b7,b8,b9,b10,b11};
        
        Image violinK = new Image(getClass().getResourceAsStream("/images/violin.png"));
        violinKey.setImage(violinK);
        
        helpLine.setVisible(false);
        
        for(int i = 0; i < noteArray.length; i++) {
            
            Image note = new Image(getClass().getResourceAsStream("/images/note.png"));
            Image sharp = new Image(getClass().getResourceAsStream("/images/sharp.png"));
            Image b = new Image(getClass().getResourceAsStream("/images/b.png"));
            
            noteArray[i].setImage(note);
            noteArray[i].setVisible(false);
            
            sharpArray[i].setImage(sharp);
            sharpArray[i].setVisible(false);
            
            bArray[i].setImage(b);
            bArray[i].setVisible(false);
        }
        
    }
    
    public void good(Button but) throws IOException {
        
        but.setStyle("-fx-base: #b6e7c9;");
        right.setText((Integer.parseInt(right.getText())+1)+"");
        next();
    }
    
    public void bad(Button but) throws IOException {
        
        but.setStyle("-fx-base: #AA0114;");
        tries.setText((Integer.parseInt(tries.getText())+1)+"");
    }
    
    public void tone(float freq) throws LineUnavailableException {
        
        if(tone == true) {
            
            byte[] buf = new byte[ 1 ];
            AudioFormat af = new AudioFormat( (float) freq, 8, 1, true, false );
            SourceDataLine sdl = AudioSystem.getSourceDataLine( af );
            sdl.open();
            sdl.start();
            for( int i = 0; i < 1000 *(float )15000 / 1000; i++ ) {
                double angle = i / ( (float )44100 / 440 ) * 2.0 * Math.PI;
                buf[ 0 ] = (byte )(Math.sin( angle ) * 100);
                sdl.write( buf, 0, 1 );
            }
            sdl.drain();
            sdl.stop();
        }
        
    }
    
    public void next() throws IOException {
        
        helpLine.setVisible(false);
        bArray[show].setVisible(false);
        sharpArray[show].setVisible(false);
        noteArray[show].setVisible(false);
        
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
        
        Random raNum = new Random();
        
        int bOrS = raNum.nextInt(2); //b or sharp
        int ifBorS = raNum.nextInt(2); //if b or sharp will be included
        
        tries.setText((Integer.parseInt(tries.getText())+1)+"");
        show = raNum.nextInt(11);
        
        if(ifBorS == 1) {
            
            if(set[0].equals("true") && set[1].equals("true")) {
            
                if(bOrS == 0) {

                    sharpArray[show].setVisible(true);
                } else bArray[show].setVisible(true);
                
            } else if (set[0].equals("true")) {

                sharpArray[show].setVisible(true);
            } else if(set[1].equals("true")) {

                bArray[show].setVisible(true);
            }
        }
        
        
        noteArray[show].setVisible(true);
        if(show == 0) {
            
            helpLine.setVisible(true);
        }
    }
}
