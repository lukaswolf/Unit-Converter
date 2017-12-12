package pl.lukaszwilk.UnitConverter.controllers;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import pl.lukaszwilk.UnitConverter.models.MySQLConnector;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable{
    @FXML
    Button buttonTime
    ,buttonComputer
    ,buttonLenght
    ,buttonSpeed
    ,buttonPressure
    ,buttonEnergy
    ,buttonTemperature
    ,buttonWeight
    ,buttonVolume
    ,buttonSquare;

    public void initialize(URL location, ResourceBundle resources) {
        MySQLConnector.getInstance();

        buttonLenght.setOnMouseClicked(event -> tryIn());
        buttonTime.setOnMouseClicked(event -> enter());

    }

    private void enter() {Parent root = null;
        try {
            root=FXMLLoader.load(getClass().getClassLoader().getResource("timeView.fxml"));
            Stage stage = (Stage) buttonLenght.getScene().getWindow();
            stage.setScene(new Scene(root,600,580));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void tryIn() {
        Parent root = null;
        try {
            root=FXMLLoader.load(getClass().getClassLoader().getResource("lenghtView.fxml"));
            Stage stage = (Stage) buttonLenght.getScene().getWindow();
            stage.setScene(new Scene(root,600,580));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    }



