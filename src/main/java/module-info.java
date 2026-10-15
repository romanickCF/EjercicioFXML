module org.example.ejerciciofxml {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.ejerciciofxml to javafx.fxml;
    exports org.example.ejerciciofxml;
}