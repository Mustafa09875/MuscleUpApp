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
           lwProfil.getItems().add(p.getVorname() + "" + p.getNachname());
           
           /*String alterzustring = "" + p.getAlter();
           String gewichtzustring = "" + p.getGewicht();
           String groessezustring = "" + p.getGroeße();
           lwProfil.getItems().add(alterzustring);
           lwProfil.getItems().add(gewichtzustring);
           lwProfil.getItems().add(groessezustring);
           lwProfil.getItems().add(p.getEmail());*/
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

    @FXML
    private void btnProfilaendernView(MouseEvent event) throws IOException {
       
        int index = lwProfil.getSelectionModel().getSelectedIndex();
        App.setSelectedProfil(App.getProfile().get(index));
        
        //App.setSelectedProfil(App.getProfile().get(index).vorname);
        
        
        App.setRoot("ProfilAktualisierenView");
    }
    
    
}
