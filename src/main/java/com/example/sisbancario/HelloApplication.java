package com.example.sisbancario;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Font.loadFont(HelloApplication.class.getResourceAsStream(
                "/com/example/sisbancario/fonts/FiraCode-Regular.ttf"), 14);

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 480, 520);

        scene.getStylesheets().add(HelloApplication.class.getResource(
                "/com/example/sisbancario/estilo.css").toExternalForm());

        stage.setTitle("Banco Bañorte!");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}
