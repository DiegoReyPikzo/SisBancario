package com.example.sisbancario;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.IOException;

public class HelloController {

    @FXML
    private TextField usuario;
    @FXML
    private TextField contrasena;  //Id de los campos y texto
    @FXML
    private Label mensajeError;
    @FXML
    private Button btnIniciar;



    @FXML
    protected void onSesion() throws IOException {
        String user = usuario.getText();
        String pass = contrasena.getText();

        if (user.equals("admin") && pass.equals("admin1234")){
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("opciones-view.fxml"));
                Parent root = loader.load();
                Stage stage = new Stage();
                stage.setTitle("Menusito bonito");
                stage.setScene(new Scene(root));
                stage.show();
                ((Stage) btnIniciar.getScene().getWindow()).close();

            } catch (IOException e){
                e.printStackTrace();
            }

        }else {
            mensajeError.setText("Contraseña o usuario incorrectos");
        }
    }
    // Oal amigazos
}
