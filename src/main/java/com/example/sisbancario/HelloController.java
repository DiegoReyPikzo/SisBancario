package com.example.sisbancario;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private TextField usuario;
    @FXML
    private TextField contrasena;  //Id de los campos y texto
    @FXML
    private Label mensajeError;

    @FXML
    protected void onSesion() throws IOException {
        String user = usuario.getText();
        String pass = contrasena.getText();

        if (user.equals("admin") && pass.equals("admin1234")){
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Opcionsotas"));
                Stage stage = (Stage) usuario.getScene().getWindow();
                stage.setScene(new Scene(loader.load()));
                stage.show();

            } catch (Exception e){
                e.printStackTrace();
            }

        }else {
            mensajeError.setText("Contraseña o ussuario incorrectos");
        }
    }
    // Oal amigazos
}
