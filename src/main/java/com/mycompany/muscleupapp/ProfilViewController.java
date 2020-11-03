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
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Test
 */
public class ProfilViewController implements Initializable {

    @FXML
    private ListView<String> lwProfil;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        for(Profil p : App.getProfile()){
           lwProfil.getItems().add(p.getVorname());
           lwProfil.getItems().add(p.getNachname());
           String alterzustring = "" + App.getSelectedProfil().getAlter();
           String gewichtzustring = "" + App.getSelectedProfil().getGewicht();
           String groessezustring = "" + App.getSelectedProfil().getGroeße();
           lwProfil.getItems().add(alterzustring);
           lwProfil.getItems().add(gewichtzustring);
           lwProfil.getItems().add(p.getEmail());
        }
            
    }    

    @FXML
    private void BtnUebungen(MouseEvent event) throws IOException {
        App.setRoot("UebungenView");
    }

    @FXML
    private void BtnProfil(MouseEvent event) throws IOException {
        App.setRoot("ProfilView");
    }

    @FXML
    private void btnProfilaendern(MouseEvent event) throws IOException {
        App.setRoot("ProfilAendernView");
    }

    @FXML
    private void btnNeuesProfil(MouseEvent event) throws IOException {
        App.setRoot("ProfilErstellenView");
    }

    @FXML
    private void BtnStartView(MouseEvent event) throws IOException {
        App.setRoot("StartView");
    }

    @FXML
    private void BtnEinstellungView(MouseEvent event) throws IOException {
        App.setRoot("EinstellungView");
                
    }
    
    
}
