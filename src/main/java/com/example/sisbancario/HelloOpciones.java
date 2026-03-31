package com.example.sisbancario;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.web.WebView; //importé todas las dependencias  :D e incluso agregué una que me ayuda a poner un gifsito
import javafx.stage.Stage;
public class HelloOpciones {
    @FXML
    private  WebView gifRupia;
    @FXML
    private  void initialize(){
        gifRupia.getEngine().load(getClass().getResource("GifRupi.gif").toExternalForm());
    }

    @FXML
    protected void onRetiro(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Retiro.view.fxml"));
            Stage stage = (Stage) gifRupia.getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
