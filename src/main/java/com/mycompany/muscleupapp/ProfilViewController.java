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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Test
 */
public class ProfilViewController implements Initializable {

    private ListView<String> lwProfil;
    @FXML
    private TextField txtFieldVorname;
    @FXML
    private TextField txtFieldNachame;
    @FXML
    private TextField txtFieldAlter;
    @FXML
    private TextField txtFieldGewicht;
    @FXML
    private TextField txtFieldGroesse;
    @FXML
    private TextField txtFieldEmail;
    @FXML
    private ListView<String> ListViewProfilAnzeigen;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        for(Profil p : App.getProfile()){
            ListViewProfilAnzeigen.getItems().add(p.getVorname() + " - " + p.getNachname() + " - " + p.getAlter() + " - " + p.getGewicht() + " - " + p.getGroeße() + " - " + p.getEmail());
        }
        txtFieldVorname.setText(App.getProfile().get(0).getVorname());
        txtFieldNachame.setText(App.getProfile().get(0).getNachname());
        String textFieldAlter = String.valueOf(App.getProfile().get(0).getAlter());
        txtFieldAlter.setText(textFieldAlter);
        String textFieldGewicht = String.valueOf(App.getProfile().get(0).getGewicht());
        txtFieldGewicht.setText(textFieldGewicht);
        String TextFieldGroeße = String.valueOf(App.getProfile().get(0).getGroeße());
        txtFieldGroesse.setText(TextFieldGroeße);
        txtFieldEmail.setText(App.getProfile().get(0).getEmail());
        
        /**int index = ListViewProfilAnzeigen.getSelectionModel().getSelectedIndex();
         *App.setProfile(App.getProfile().get(index));
         */
        
        //int alter = Integer.parseInt(txtFieldAlter.getText());
        //this.txtFieldVorname.setText(App.getSelectedProfil().getVorname());
       //this.txtFieldNachame.setText(App.getSelectedProfil().getNachname());
       //this.txtFieldNachame.setText(App.getSelectedProfil().alter);
    
        
        for(Profil p : App.getProfile()){
           //lwProfil.getItems().add(p.getVorname() + "" + p.getNachname());
           
           
           /**String alterzustring = "" + p.getAlter();
           String gewichtzustring = "" + p.getGewicht();
           String groessezustring = "" + p.getGroeße();
           lwProfil.getItems().add(alterzustring);
           lwProfil.getItems().add(gewichtzustring);
           lwProfil.getItems().add(groessezustring);
           lwProfil.getItems().add(p.getEmail());**/
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
    private void BtnStartView(MouseEvent event) throws IOException {
        App.setRoot("StartView");
    }

    @FXML
    private void BtnEinstellungView(MouseEvent event) throws IOException {
        App.setRoot("EinstellungView");
                
    }

    @FXML
    private void btnProfilSpeichernn(MouseEvent event) throws IOException {
        int textFieldAlter = Integer.parseInt(txtFieldAlter.getText());
        int textFieldGewicht = Integer.parseInt(txtFieldGewicht.getText());
        int textFieldGroeße = Integer.parseInt(txtFieldGroesse.getText());
        App.getProfile().get(0).setVorname(txtFieldVorname.getText()); 
        App.getProfile().get(0).setNachname(txtFieldNachame.getText());
        App.getProfile().get(0).setAlter(textFieldAlter); 
        App.getProfile().get(0).setGewicht(textFieldGewicht);
        App.getProfile().get(0).setGroeße(textFieldGroeße);
        App.getProfile().get(0).setEmail(txtFieldEmail.getText());
        App.setRoot("ProfilView");
    }

    
}
