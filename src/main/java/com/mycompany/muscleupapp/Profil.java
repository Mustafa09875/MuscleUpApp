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
public class Profil {
    String vorname;
    String nachname;
    int alter;
    int gewicht;
    int groeße;
    String email;
    
    private Profil(String vorname, String nachname, int alter, int gewicht, int groeße, String email)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.gewicht = gewicht;
        this.email = email;
                
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public int getGroeße() {
        return groeße;
    }

    public void setGroeße(int groeße) {
        this.groeße = groeße;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
