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
public class DipsModel {
    String name;
    String beschreibung;
    String bilder;
    
    private DipsModel(String name, String beschreibung, String bilder)
    {
        this.name = name;
        this.beschreibung = beschreibung;
        this.bilder = bilder;
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
        System.out.println("hi");
        return bilder;
    }

    public void setBilder(String Bilder) {
        this.bilder = Bilder;
    }
    
    
    
    
    
}
