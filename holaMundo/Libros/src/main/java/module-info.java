module com.example.libros {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.libros to javafx.fxml;
    exports com.example.libros;
}