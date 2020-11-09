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
public class MuscleUpModelController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BtnBacktostartview(MouseEvent event) throws IOException {
        App.setRoot("StartView");
    }

    @FXML
    private void BtnToUebungen(MouseEvent event) throws IOException {
        App.setRoot("UebungenView");
    }
    
    
    //Code zum implementiren von einem Youtube Video. Beinhaltet noch einpaar Unklarheiten.
    /**
     * package com.guigarage.youtube;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.layout.Region;
import javafx.scene.web.WebView;

public class YouTubePlayer extends Region {

    public WebView webView;

    public ObjectProperty<YouTubeVideo> youTubeVideo;

    public YouTubePlayer() {
        this(null);
    }

    public YouTubePlayer(YouTubeVideo youTubeVideo) {
        getStyleClass().add("you-tube-player");
        webView = new WebView();
        getChildren().add(webView);
        this.youTubeVideo = new SimpleObjectProperty<>(youTubeVideo);
        this.youTubeVideo.addListener(e -> update());
        update();

        sceneProperty().addListener(e -> {
            update();
        });
    }

    @Override
    protected double computePrefWidth(double height) {
        return 600;
    }

    @Override
    protected double computePrefHeight(double width) {
        return 400;
    }

    @Override
    protected void layoutChildren() {
        super.layoutChildren();
        webView.relocate(0, 0);
        webView.resize(getWidth(), getHeight());
    }

    private void update() {
        System.out.println(getScene());
        if (getScene() == null) {
            webView.getEngine().loadContent("<html></html>");
        } else if (getYouTubeVideo() == null) {
            webView.getEngine().loadContent(null);
        } else {
            webView.getEngine().load("http://www.youtube.com/embed/" + getYouTubeVideo().getId() + "?fs=0&rel=0&showinfo=0&autoplay=1");
        }
    }

    public YouTubeVideo getYouTubeVideo() {
        return youTubeVideo.get();
    }

    public void setYouTubeVideo(YouTubeVideo youTubeVideo) {
        this.youTubeVideo.set(youTubeVideo);
    }

    public ObjectProperty<YouTubeVideo> youTubeVideoProperty() {
        return youTubeVideo;
    }
}

     */
    
}
