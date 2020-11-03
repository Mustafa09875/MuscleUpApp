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
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Test
 */
public class UebungenViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BtnUebungen(MouseEvent event) throws IOException {
        App.setRoot("UebungenView");
    }

    @FXML
    private void BtnEinstellung(MouseEvent event) throws IOException {
        App.setRoot("EinstellungView");
    }

    @FXML
    private void BtnProfil(MouseEvent event) throws IOException {
        App.setRoot("ProfilView");
    }

    @FXML
    private void BtnStartView(MouseEvent event) throws IOException {
        App.setRoot("StartView");
    }
    
}
