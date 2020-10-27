/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.muscleupapp;

/**
 *
 * @author Test
 */
public class KlimmzuegeModel {
    String name;
    String beschreibung;
    String bilder;
    String video;
    
    private KlimmzuegeModel(String name, String beschreibung, String bilder, String video)
   {
      this.name = name;
      this.beschreibung = beschreibung;
      this.bilder = bilder; 
      this.video = video;
    }            

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getBilder() {
        return bilder;
    }

    public void setBilder(String bilder) {
        this.bilder = bilder;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
      
    
}
