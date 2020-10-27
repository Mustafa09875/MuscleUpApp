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
import javafx.scene.input.SwipeEvent;

/**
 * FXML Controller class
 *
 * @author Test
 */
public class StartViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void BtnHome(MouseEvent event) throws IOException {
       App.setRoot("StartViewController");
    }

    @FXML
    private void BtnUebungen(MouseEvent event) throws IOException {
        App.setRoot("UebungenViewController");
    }

    @FXML
    private void BtnEinstellung(MouseEvent event) throws IOException {
        App.setRoot("EinstellungViewController");
    }

    @FXML
    private void BtnProfil(MouseEvent event) throws IOException {
        App.setRoot("ProfilViewController");
    }

    private void DraggedMuscleUpInformation(MouseEvent event) throws IOException {
        App.setRoot("MuscleUpInfoBox");
        
    }

    @FXML
    private void SwipeUpOpenMuscleUp(SwipeEvent event) throws IOException {
        
        App.setRoot("MuscleUpModel");
    }
    
}
