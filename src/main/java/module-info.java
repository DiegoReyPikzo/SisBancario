module com.example.sisbancario {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.sisbancario to javafx.fxml, javafx.web;
    exports com.example.sisbancario;
}