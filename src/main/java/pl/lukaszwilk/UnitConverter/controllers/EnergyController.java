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

public class EnergyController implements Initializable {

    ObservableList<String> observableList = FXCollections.observableArrayList();
    @FXML
    Button enButtonBack, enButtonConvert;
    @FXML
    ChoiceBox<String> enChoiceBoxTo, enChoiceBoxFrom;
    @FXML
    Label enLabel;
    @FXML
    TextField enTextField;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();
        enButtonConvert.setOnMouseClicked(event -> obliczenie());
        enButtonBack.setOnMouseClicked(event -> back());

    }

    private void obliczenie() {
//W
        if (enChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("W") &&
                enChoiceBoxTo.getSelectionModel().getSelectedItem().equals("kW")) {
            double result = Double.parseDouble(enTextField.getText()) * 0.001;
            enLabel.setText(result + " kW");
        } else if (enChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("W") &&
                enChoiceBoxTo.getSelectionModel().getSelectedItem().equals("KM")) {
            double result = Double.parseDouble(enTextField.getText()) * 0.0014;
            enLabel.setText(result + " KM");
        }
        else if (enChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("W") &&
                enChoiceBoxTo.getSelectionModel().getSelectedItem().equals("HP")) {
            double result = Double.parseDouble(enTextField.getText()) * 0.0013;
            enLabel.setText(result + " HP");
        }
        //kW
        if (enChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("kW") &&
                enChoiceBoxTo.getSelectionModel().getSelectedItem().equals("W")) {
            double result = Double.parseDouble(enTextField.getText()) * 1000;
            enLabel.setText(result + " W");
        } else if (enChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("kW") &&
                enChoiceBoxTo.getSelectionModel().getSelectedItem().equals("KM")) {
            double result = Double.parseDouble(enTextField.getText()) * 1.3596;
            enLabel.setText(result + " KM");
        }
        else if (enChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("kW") &&
                enChoiceBoxTo.getSelectionModel().getSelectedItem().equals("HP")) {
            double result = Double.parseDouble(enTextField.getText()) * 1.341;
            enLabel.setText(result + " HP");
        }
        //KM
        if (enChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("KM") &&
                enChoiceBoxTo.getSelectionModel().getSelectedItem().equals("W")) {
            double result = Double.parseDouble(enTextField.getText()) * 735.4988;
            enLabel.setText(result + " W");
        } else if (enChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("W") &&
                enChoiceBoxTo.getSelectionModel().getSelectedItem().equals("kW")) {
            double result = Double.parseDouble(enTextField.getText()) *0.7355 ;
            enLabel.setText(result + " kW");
        }
        else if (enChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("KM") &&
                enChoiceBoxTo.getSelectionModel().getSelectedItem().equals("HP")) {
            double result = Double.parseDouble(enTextField.getText()) * 0.9863;
            enLabel.setText(result + " HP");
        }
        //HP
        if (enChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("HP") &&
                enChoiceBoxTo.getSelectionModel().getSelectedItem().equals("W")) {
            double result = Double.parseDouble(enTextField.getText()) * 745.6999;
            enLabel.setText(result + " W");
        } else if (enChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("HP") &&
                enChoiceBoxTo.getSelectionModel().getSelectedItem().equals("kW")) {
            double result = Double.parseDouble(enTextField.getText()) * 0.7457;
            enLabel.setText(result + " kW");
        }
        else if (enChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("HP") &&
                enChoiceBoxTo.getSelectionModel().getSelectedItem().equals("KM")) {
            double result = Double.parseDouble(enTextField.getText()) * 1.0139;
            enLabel.setText(result + " KM");
        }
    }





    private void back() {
        {
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getClassLoader().getResource("mainView.fxml"));
                Stage stage = (Stage) enButtonBack.getScene().getWindow();
                stage.setScene(new Scene(root, 780, 300));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadData(){
        observableList.removeAll();
        observableList.addAll("W","kW","KM","HP");
        enChoiceBoxFrom.getItems().setAll(observableList);
        enChoiceBoxTo.getItems().setAll(observableList);
    }
}
