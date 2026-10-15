package org.example.ejerciciofxml;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {



    @FXML
    private Button btnVaciar;
    @FXML
    private ListView lista;
    @FXML
    private Button btnAñadir;
    @FXML
    private Button btnCerrar;
    @FXML
    private TextField inputTextLista;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lista.getItems().add("Hugo");
        lista.getItems().add("Francisco");
        lista.getItems().add("Adrian");
        lista.getSelectionModel().selectFirst();

        btnAñadir.setDisable(true);

        lista.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    mostrarElemento(newValue);
                });

    }



    @FXML
    public void cerrar(ActionEvent actionEvent) {
        System.exit(0);
    }

    @FXML
    public void añadir(ActionEvent actionEvent) {
        String s = inputTextLista.getText();
        if(!s.isBlank()){
            lista.getItems().add(s);
            inputTextLista.clear();
            btnAñadir.setDisable(true);
        }
      


    }

    @FXML
    public void vaciar(ActionEvent actionEvent) {
        lista.getItems().clear();
    }


    private static void mostrarElemento(Object newValue) {
        String seleccion = newValue.toString();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Seleccion");
        alert.setHeaderText(null);
        alert.setContentText(seleccion);
        alert.showAndWait();
    }

    @FXML
    public void activarBoton(Event event) {
        if (inputTextLista.getText().length()<5){
            btnAñadir.setDisable(true);
        }else {
            btnAñadir.setDisable(false);
        }
    }
}
