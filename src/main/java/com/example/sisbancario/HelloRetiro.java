package com.example.sisbancario;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent; //Importando las librerias ;DDDDD
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class HelloRetiro {


    @FXML
    private TextField txtCanti;
    @FXML
    private Button btonVolver;

    @FXML
    private  void confiRetiro(){
        String cantidad = txtCanti.getText();

        //Verifica que no esté vacío:
        if (cantidad.isEmpty()) {
            txtCanti.setText("Escribe una cantidad.");
            return;
        }

        // Convierte el texto a número:
        double monto = Double.parseDouble(cantidad);

        //Verifica que el valor sea mayor a 0
        if (monto <= 0) {
            txtCanti.setText("La cantidad debe ser mayor a 0.");
            return;
        }

        // Verifica que haya suficiente saldo:
        if (monto > Banco.saldo) {
            txtCanti.setText("Saldo insuficiente.");
            return;
        }

        Banco.saldo = Banco.saldo - monto;
        System.out.println("Retiro exitoso. Saldo actual: $" + Banco.saldo);
        txtCanti.clear();

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
