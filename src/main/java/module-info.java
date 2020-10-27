module com.mycompany.muscleupapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.muscleupapp to javafx.fxml;
    exports com.mycompany.muscleupapp;
}
