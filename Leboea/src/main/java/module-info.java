module com.example.leboea {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.leboea to javafx.fxml;
    exports com.example.leboea;
}