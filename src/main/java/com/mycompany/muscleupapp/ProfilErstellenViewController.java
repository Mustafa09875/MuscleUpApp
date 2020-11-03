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
public class ProfilErstellenViewController implements Initializable {

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
        
    }    

    @FXML
    private void btnProfilSpeichern(MouseEvent event) throws IOException {
        
        int textFieldAlter = Integer.parseInt(txtFieldAlter.getText());
        int textFieldGewicht = Integer.parseInt(txtFieldGewicht.getText());
        int textFieldGroeße = Integer.parseInt(txtFieldGroeße.getText());
       App.getProfile().add(new Profil(txtFieldVorname.getText(), txtFieldNachname.getText(), textFieldAlter, textFieldGewicht, textFieldGroeße, txtFieldEmail.getText()));
        App.setRoot("ProfilView");
        
    }

    @FXML
    private void btnProfilAbbrechen(MouseEvent event) throws IOException {
        App.setRoot("ProfilView");
    }

    private void BtnEnter(KeyEvent event) throws IOException {
        
        switch (event.getCode()){
            case ENTER:
            case PLUS:
                App.setRoot("ProfilView");
               
        }
        
    }

    @FXML
    private void BtnKeySpeicher(KeyEvent event) {
    }
    
}
