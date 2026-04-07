package com.example.sisbancario;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloDeposito {

    @FXML
    private TextField txtCanti2;
    @FXML
    private Button btonVolver2;
    @FXML
    private Label txtError2;

//Boton de DEPOSITO
@FXML
private void confiDeposito(){
    String cantidad = txtCanti2.getText();

    //Verifica que no esté vacío:
    if (cantidad.isEmpty()) {
        txtError2.setText("Escribe una cantidad.");
        return;
    }

    // Convierte el texto a número:
    double monto = Double.parseDouble(cantidad);

    //Verifica que el valor sea mayor a 0
    if (monto <= 0) {
        txtError2.setText("La cantidad debe ser mayor a 0.");
        return;
    }

    Banco.saldo = Banco.saldo + monto;
    txtError2.setText("Deposito exitoso.");
    txtCanti2.clear();


}

    @FXML
    protected void volverMenu2() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("opciones-view.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) btonVolver2.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
