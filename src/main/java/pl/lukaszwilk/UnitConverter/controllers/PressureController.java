package pl.lukaszwilk.UnitConverter.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PressureController implements Initializable {
    ObservableList<String> observableList = FXCollections.observableArrayList();
    @FXML
    Button pressureButtonBack,pressureButtonConvert;
    @FXML
    ChoiceBox<String> pressureChoiceBoxTo, pressureChoiceBoFrom;
    @FXML
    Label pressureLabel;
    @FXML
    TextField pressureTextField;
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();
        pressureButtonConvert.setOnMouseClicked(event -> obliczenie());
        pressureButtonBack.setOnMouseClicked(event -> back());
        
    }

    private void obliczenie() {
//pa
        if (pressureChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Pa") &&
                pressureChoiceBoxTo.getSelectionModel().getSelectedItem().equals("hPa")){
            double result = Double.parseDouble(pressureTextField.getText()) * 0.01;
            pressureLabel.setText( result + " hPa");
        }
        else if (pressureChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Pa") &&
                pressureChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Kg/m2")) {
            double result = Double.parseDouble(pressureTextField.getText()) * 0.102;
            pressureLabel.setText( result + " Kg/m2");
        }
        //hPa
        if (pressureChoiceBoFrom.getSelectionModel().getSelectedItem().equals("hPa")
                && pressureChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Pa")){
            double result = Double.parseDouble(pressureTextField.getText()) * 100;
            pressureLabel.setText("" + result + " Pa");
        }else if(pressureChoiceBoFrom.getSelectionModel().getSelectedItem().equals("hPa")
                && pressureChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Kg/m2")) {
            double result = Double.parseDouble(pressureTextField.getText()) * 10.1972;
            pressureLabel.setText("" + result + " Kg/m2");
        }
        //kg/m2
        if (pressureChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Kg/m2")
                && pressureChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Pa")){
            double result = Double.parseDouble(pressureTextField.getText()) * 9.8067;
            pressureLabel.setText("" + result + " Pa");
        }else if(pressureChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Kg/m2")
                && pressureChoiceBoxTo.getSelectionModel().getSelectedItem().equals("hPa")) {
            double result = Double.parseDouble(pressureTextField.getText()) * 0.0981;
            pressureLabel.setText("" + result + " hPa");
        }
    }

    private void back() {
        {
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getClassLoader().getResource("mainView.fxml"));
                Stage stage = (Stage) pressureButtonBack.getScene().getWindow();
                stage.setScene(new Scene(root, 700, 280));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadData(){
        observableList.removeAll();
        observableList.addAll("Pa","hPa","Kg/m2");
        pressureChoiceBoFrom.getItems().setAll(observableList);
        pressureChoiceBoxTo.getItems().setAll(observableList);
    }
}
