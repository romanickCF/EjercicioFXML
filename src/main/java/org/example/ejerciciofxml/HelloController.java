package org.example.ejerciciofxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import javax.swing.*;

public class HelloController {

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

    @FXML
    protected void onHelloButtonClick() {

    }

    @FXML
    public void cerrar(ActionEvent actionEvent) {
        System.exit(0);
    }

    @FXML
    public void añadir(ActionEvent actionEvent) {
        String s = inputTextLista.getText();
        lista.getItems().add(s);
        inputTextLista.clear();


    }

    @FXML
    public void vaciar(ActionEvent actionEvent) {
        lista.getItems().clear();
    }
}
