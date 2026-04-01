package com.example.sisbancario;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloOpciones {

    //Se usa el botón para salir :D
    @FXML
    private Button btnSalir;

    @FXML
    public void initialize() {
        // Método vacío para borrar hello view
        System.out.println("Menú de opciones cargado correctamente.");
    }

    @FXML
    protected void onRetiro() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Retiro-view.fxml"));
            Parent root = loader.load();

            // Obtenemos la ventana actual a través del botón salir
            Stage stage = (Stage) btnSalir.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            System.err.println("Error al abrir la ventana de Retiro");
            e.printStackTrace();
        }
    }
    @FXML
    private void onConsulta() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("consulta-view.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Consulta de Saldo");
            stage.setScene(new Scene(root, 600, 400));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void onDeposito() {
        System.out.println("Depósito seleccionado");
    }

    @FXML
    protected void onSalir() {
        // Cerramos la ventana actual
        Stage stage = (Stage) btnSalir.getScene().getWindow();
        stage.close();
    }
}