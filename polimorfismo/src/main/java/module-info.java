module org.example.polimorfismo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.polimorfismo to javafx.fxml;
    exports org.example.polimorfismo;
    exports org.example.polimorfismo.controllers;
    opens org.example.polimorfismo.controllers to javafx.fxml;
}