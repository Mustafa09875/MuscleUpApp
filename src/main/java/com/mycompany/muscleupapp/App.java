package com.mycompany.muscleupapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.ArrayList;

//GIT!

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    
    private static ArrayList<Profil> profile;
    private static Profil selectedProfil;
    
    
    
    
/**
 * Setter und Getter für Profil 
 */
    public static ArrayList<Profil> getProfile() {
        return profile;
    }

    public static void setProfile(ArrayList<Profil> profile) {
        App.profile = profile;
    }

    public static Profil getSelectedProfil() {
        return App.selectedProfil;
    }

    public static void setSelectedProfil(Profil selectedProfil) {
        App.selectedProfil = selectedProfil;
    }
    
    
    
    
    
    
    
    
    
    

    @Override
    public void start(Stage stage) throws IOException {
        
        scene = new Scene(loadFXML("StartView"), 328, 500);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    
    
    
    
    
    
    public static void main(String[] args) {
        App.profile = new ArrayList <>();
        profile.add(new Profil("Okal", "Loral", 23, 78, 179, "OkaLoa008@gmail.com"));
        
        
        launch();
        
    }

}