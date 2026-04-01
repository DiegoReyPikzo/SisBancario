package com.example.sisbancario;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent; //Importando las librerias ;DDDDD
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloDeposito {
    @FXML
    private TextField txtCanti;
    @FXML
    private Button btonVolver;
    @FXML
    private  void confiRetiro(){
        String cantidad = txtCanti.getText();
        System.out.println("Depositando: $" + cantidad);

    }
    @FXML
    protected void volverMenu() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("opciones-view.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) btonVolver.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
