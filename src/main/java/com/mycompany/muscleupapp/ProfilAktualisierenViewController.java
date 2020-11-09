/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.muscleupapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Test
 */
public class ProfilAktualisierenViewController implements Initializable {

    @FXML
    private TextField txtFieldVorname;
    @FXML
    private TextField txtFieldNachname;
    @FXML
    private TextField txtFieldAlter;
    @FXML
    private TextField txtFieldGewicht;
    @FXML
    private TextField txtFieldGroeße;
    @FXML
    private TextField txtFieldEmail;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       this.txtFieldVorname.setText(App.getSelectedProfil().getVorname());
       this.txtFieldNachname.setText(App.getSelectedProfil().getNachname());
       
    }    

    @FXML
    private void BtnKeySpeicher(KeyEvent event) {
        App.getSelectedProfil().setVorname(txtFieldVorname.getText());
        App.getSelectedProfil().setNachname(txtFieldNachname.getText());
        int alter = Integer.parseInt(txtFieldAlter.getText());
        int gewicht = Integer.parseInt(txtFieldGewicht.getText());
        int groeße = Integer.parseInt(txtFieldGroeße.getText());
        
        App.getSelectedProfil().setAlter(alter);
        App.getSelectedProfil().setGewicht(gewicht);
        App.getSelectedProfil().setGroeße(groeße);
        App.getSelectedProfil().setEmail(txtFieldEmail.getText());
    }

    @FXML
    private void btnProfilSpeichern(MouseEvent event) {
        App.getSelectedProfil().setVorname(this.txtFieldVorname.getText());
        App.getSelectedProfil().setNachname(this.txtFieldNachname.getText());
        
        int alter = Integer.parseInt(this.txtFieldAlter.getText());
        int gewicht = Integer.parseInt(this.txtFieldGewicht.getText());
        int groeße = Integer.parseInt(this.txtFieldGroeße.getText());
        
        App.getSelectedProfil().setAlter(alter);
        App.getSelectedProfil().setGewicht(gewicht);
        App.getSelectedProfil().setGroeße(groeße);
        App.getSelectedProfil().setEmail(this.txtFieldEmail.getText());
    }

    @FXML
    private void btnProfilAbbrechen(MouseEvent event) throws IOException {
        System.out.println("df");
        App.setRoot("ProfilView");
    }
    
}
