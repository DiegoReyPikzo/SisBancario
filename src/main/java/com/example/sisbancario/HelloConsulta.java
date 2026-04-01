package com.example.sisbancario;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
public class HelloConsulta {
    @FXML
    private Button btonVolver3;

    @FXML
    private TextField lblSaldo;

    @FXML
    private void consultarSaldo() {
        lblSaldo.setText("$" + String.format("%.2f", Banco.saldo));
    }

    @FXML
    private void volverMenu() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("opciones-view.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Menusito bonito");
            stage.setScene(new Scene(root, 530, 500));
            stage.show();
            ((Stage) btonVolver3.getScene().getWindow()).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



