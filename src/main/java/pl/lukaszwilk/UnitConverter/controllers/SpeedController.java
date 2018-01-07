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

public class SpeedController implements Initializable {

    ObservableList<String> observableList = FXCollections.observableArrayList();
    @FXML
    Button speedButtonBack, speedButtonConvert;
    @FXML
    ChoiceBox<String> speedChoiceBoxTo, speedChoiceBoxFrom;
    @FXML
    Label speedLabel;
    @FXML
    TextField speedTextField;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();
        speedButtonConvert.setOnMouseClicked(event -> obliczenie());
        speedButtonBack.setOnMouseClicked(event -> back());

    }

    private void obliczenie() {
//km/h
        if (speedChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("km/h") &&
                speedChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mph")) {
            double result = Double.parseDouble(speedTextField.getText()) * 0.6214;
            speedLabel.setText(result + " mph");
        }
        else if (speedChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("km/h") &&
                speedChoiceBoxTo.getSelectionModel().getSelectedItem().equals("km/s")) {
            double result = Double.parseDouble(speedTextField.getText()) * 0.003;
            speedLabel.setText(result + " km/s");
        }
        else if (speedChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("km/h") &&
                speedChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mps")) {
            double result = Double.parseDouble(speedTextField.getText()) * 0.002;
            speedLabel.setText(result + " mps");
        }
        else if (speedChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("km/h") &&
                speedChoiceBoxTo.getSelectionModel().getSelectedItem().equals("m/s")) {
            double result = Double.parseDouble(speedTextField.getText()) * 0.2778;
            speedLabel.setText(result + " m/s");
        }
        //mph
        if (speedChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mph") &&
                speedChoiceBoxTo.getSelectionModel().getSelectedItem().equals("km/h")) {
            double result = Double.parseDouble(speedTextField.getText()) * 1.6093;
            speedLabel.setText(result + " km/h");
        } else if (speedChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mph") &&
                speedChoiceBoxTo.getSelectionModel().getSelectedItem().equals("km/s")) {
            double result = Double.parseDouble(speedTextField.getText()) * 0.0004;
            speedLabel.setText(result + " km/s");
        }
        else if (speedChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mph") &&
                speedChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mps")) {
            double result = Double.parseDouble(speedTextField.getText()) * 0.003;
            speedLabel.setText(result + " mps");
        }
        else if (speedChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mph") &&
                speedChoiceBoxTo.getSelectionModel().getSelectedItem().equals("m/s")) {
            double result = Double.parseDouble(speedTextField.getText()) * 0.447;
            speedLabel.setText(result + " m/s");
        }
        //km/s
        if (speedChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("km/s") &&
                speedChoiceBoxTo.getSelectionModel().getSelectedItem().equals("km/h")) {
            double result = Double.parseDouble(speedTextField.getText()) * 3600;
            speedLabel.setText(result + " km/h");
        } else if (speedChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("km/s") &&
                speedChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mph")) {
            //sprawdzic
            double result = Double.parseDouble(speedTextField.getText()) * 2236.9363;
            speedLabel.setText(result + " mph");
        }
        else if (speedChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("km/s") &&
                speedChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mps")) {
            double result = Double.parseDouble(speedTextField.getText()) * 0.6214;
            speedLabel.setText(result + " mps");
        }
        else if (speedChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("km/s") &&
                speedChoiceBoxTo.getSelectionModel().getSelectedItem().equals("m/s")) {
            double result = Double.parseDouble(speedTextField.getText()) * 1000;
            speedLabel.setText(result + " m/s");
        }
        //mps
        if (speedChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mps") &&
                speedChoiceBoxTo.getSelectionModel().getSelectedItem().equals("km/h")) {
            double result = Double.parseDouble(speedTextField.getText()) * 5793.6384;
            speedLabel.setText(result + " km/h");
        } else if (speedChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mps") &&
                speedChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mph")) {
            double result = Double.parseDouble(speedTextField.getText()) * 3600;
            speedLabel.setText(result + " mph");
        }
        else if (speedChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mps") &&
                speedChoiceBoxTo.getSelectionModel().getSelectedItem().equals("km/s")) {
            double result = Double.parseDouble(speedTextField.getText()) * 1.69093;
            speedLabel.setText(result + " km/s");
        }
        else if (speedChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mps") &&
                speedChoiceBoxTo.getSelectionModel().getSelectedItem().equals("m/s")) {
            double result = Double.parseDouble(speedTextField.getText()) * 1609.344;
            speedLabel.setText(result + " m/s");
        }
        //m/s
        if (speedChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("m/s") &&
                speedChoiceBoxTo.getSelectionModel().getSelectedItem().equals("km/h")) {
            double result = Double.parseDouble(speedTextField.getText()) * 3.6;
            speedLabel.setText(result + " km/h");
        } else if (speedChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("m/s") &&
                speedChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mph")) {
            double result = Double.parseDouble(speedTextField.getText()) * 2.2369;
            speedLabel.setText(result + " mph");
        }
        else if (speedChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("m/s") &&
                speedChoiceBoxTo.getSelectionModel().getSelectedItem().equals("km/s")) {
            double result = Double.parseDouble(speedTextField.getText()) * 0.001;
            speedLabel.setText(result + " km/s");
        }
        else if (speedChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("m/s") &&
                speedChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mps")) {
            double result = Double.parseDouble(speedTextField.getText()) * 0.0006;
            speedLabel.setText(result + " mps");
        }
    }





    private void back() {
        {
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getClassLoader().getResource("mainView.fxml"));
                Stage stage = (Stage) speedButtonBack.getScene().getWindow();
                stage.setScene(new Scene(root, 780, 300));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadData(){
        observableList.removeAll();
        observableList.addAll("km/h","mph","km/s","mps","ms");
        speedChoiceBoxFrom.getItems().setAll(observableList);
        speedChoiceBoxTo.getItems().setAll(observableList);
    }
}
