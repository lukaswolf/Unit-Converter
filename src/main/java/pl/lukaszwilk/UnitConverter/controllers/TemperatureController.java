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

public class TemperatureController implements Initializable {
    ObservableList<String> observableList = FXCollections.observableArrayList();
    @FXML
    Button tempButtonBack, tempButtonConvert;
    @FXML
    ChoiceBox<String> tempChoiceBoxTo, tempChoiceBoxFrom;
    @FXML
    Label tempLabel;
    @FXML
    TextField tempTextField;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();
        tempButtonConvert.setOnMouseClicked(event -> obliczenie());
        tempButtonBack.setOnMouseClicked(event -> back());

    }

    private void obliczenie() {
//c
        if (tempChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("C") &&
                tempChoiceBoxTo.getSelectionModel().getSelectedItem().equals("F")) {
            double result = Double.parseDouble(tempTextField.getText()) * 33.8;
            tempLabel.setText(result + " F");
        } else if (tempChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("C") &&
                tempChoiceBoxTo.getSelectionModel().getSelectedItem().equals("K")) {
            double result = Double.parseDouble(tempTextField.getText()) * 274.15;
            tempLabel.setText(result + " K");
        } else if (tempChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("C") &&
                tempChoiceBoxTo.getSelectionModel().getSelectedItem().equals("R")) {
            double result = Double.parseDouble(tempTextField.getText()) * 493.47;
            tempLabel.setText(result + " R");
        }
        //f
        if (tempChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("F")
                && tempChoiceBoxTo.getSelectionModel().getSelectedItem().equals("C")) {
            double result = Double.parseDouble(tempTextField.getText()) * (-17.22);
            tempLabel.setText("" + result + " C");
        } else if (tempChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("F")
                && tempChoiceBoxTo.getSelectionModel().getSelectedItem().equals("K")) {
            double result = Double.parseDouble(tempTextField.getText()) * 255.93;
            tempLabel.setText("" + result + " K");
        } else if (tempChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("F")
                && tempChoiceBoxTo.getSelectionModel().getSelectedItem().equals("R")) {
            double result = Double.parseDouble(tempTextField.getText()) * 460.67;
            tempLabel.setText("" + result + " R");
        }
        //k
        if (tempChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("K")
                && tempChoiceBoxTo.getSelectionModel().getSelectedItem().equals("C")) {
            double result = Double.parseDouble(tempTextField.getText()) * (-272.15);
            tempLabel.setText("" + result + " C");
        } else if (tempChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("K")
                && tempChoiceBoxTo.getSelectionModel().getSelectedItem().equals("F")) {
            double result = Double.parseDouble(tempTextField.getText()) * (-458.67);
            tempLabel.setText("" + result + " F");
        } else if (tempChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("K")
                && tempChoiceBoxTo.getSelectionModel().getSelectedItem().equals("R")) {
            double result = Double.parseDouble(tempTextField.getText()) * 1.8;
            tempLabel.setText("" + result + " R");
        }
        //r
        if (tempChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("R")
                && tempChoiceBoxTo.getSelectionModel().getSelectedItem().equals("C")) {
            double result = Double.parseDouble(tempTextField.getText()) * (-272.59);
            tempLabel.setText("" + result + " C");
        } else if (tempChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("R")
                && tempChoiceBoxTo.getSelectionModel().getSelectedItem().equals("F")) {
            double result = Double.parseDouble(tempTextField.getText()) * (-458067);
            tempLabel.setText("" + result + " F");
        } else if (tempChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("R")
                && tempChoiceBoxTo.getSelectionModel().getSelectedItem().equals("K")) {
            double result = Double.parseDouble(tempTextField.getText()) * 0.56;
            tempLabel.setText("" + result + " K");
        }
    }





    private void back() {
        {
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getClassLoader().getResource("mainView.fxml"));
                Stage stage = (Stage) tempButtonBack.getScene().getWindow();
                stage.setScene(new Scene(root, 780, 300));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadData(){
        observableList.removeAll();
        observableList.addAll("C","K","R","F");
        tempChoiceBoxFrom.getItems().setAll(observableList);
        tempChoiceBoxTo.getItems().setAll(observableList);
    }


}
