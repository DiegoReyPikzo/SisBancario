module com.example.sisbancario {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.sisbancario to javafx.fxml;
    exports com.example.sisbancario;
}