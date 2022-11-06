module com.example.programmer_life {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.programmer_life to javafx.fxml;
    exports com.example.programmer_life;
}