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
public class Uebungen {
    String suche;
    KlimmzuegeModel klimmzuguebung;
    LiegestuetzeModel liegestuetze;
    DipsModel dips;
    
    
    private Uebungen(String suche, KlimmzuegeModel klimmzuguebung, LiegestuetzeModel liegestuetze, DipsModel dips)
    {
        this.suche = suche;
        this.klimmzuguebung = klimmzuguebung;
        this.liegestuetze = liegestuetze;
        this.dips = dips;
    }

    public String getSuche() {
        return suche;
    }

    public void setSuche(String suche) {
        this.suche = suche;
    }

    public KlimmzuegeModel getKlimmzuguebung() {
        return klimmzuguebung;
    }

    public void setKlimmzuguebung(KlimmzuegeModel klimmzuguebung) {
        this.klimmzuguebung = klimmzuguebung;
    }

    public LiegestuetzeModel getLiegestuetze() {
        return liegestuetze;
    }

    public void setLiegestuetze(LiegestuetzeModel liegestuetze) {
        this.liegestuetze = liegestuetze;
    }

    public DipsModel getDips() {
        return dips;
    }

    public void setDips(DipsModel dips) {
        this.dips = dips;
    }
    
    
    
}
