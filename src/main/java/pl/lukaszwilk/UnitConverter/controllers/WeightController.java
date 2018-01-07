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

public class WeightController implements Initializable {
    ObservableList<String> observableList = FXCollections.observableArrayList();
    @FXML
    Button weiButtonBack, weiButtonConvert;
    @FXML
    ChoiceBox<String> weiChoiceBoxTo, weiChoiceBoxFrom;
    @FXML
    Label weiLabel;
    @FXML
    TextField weiTextField;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();
        weiButtonConvert.setOnMouseClicked(event -> obliczenie());
        weiButtonBack.setOnMouseClicked(event -> back());

    }

    private void obliczenie() {
//mg
        if (weiChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mg") &&
                weiChoiceBoxTo.getSelectionModel().getSelectedItem().equals("g")) {
            double result = Double.parseDouble(weiTextField.getText()) * 0.001;
            weiLabel.setText(result + " g");
        } else if (weiChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mg") &&
                weiChoiceBoxTo.getSelectionModel().getSelectedItem().equals("dag")) {
            double result = Double.parseDouble(weiTextField.getText()) * 0.0001;
            weiLabel.setText(result + " dkg");
        } else if (weiChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mg") &&
                weiChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Kg")) {
            double result = Double.parseDouble(weiTextField.getText()) * 0.00001;
            weiLabel.setText(result + " Kg");
        }else if (weiChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mg") &&
                weiChoiceBoxTo.getSelectionModel().getSelectedItem().equals("T")) {
            double result = Double.parseDouble(weiTextField.getText()) * 0.000000001;
            weiLabel.setText(result + " T");
        }
        //G
        if (weiChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("g") &&
                weiChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mg")) {
            double result = Double.parseDouble(weiTextField.getText()) * 1000;
            weiLabel.setText(result + " mg");
        } else if (weiChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("g") &&
                weiChoiceBoxTo.getSelectionModel().getSelectedItem().equals("dag")) {
            double result = Double.parseDouble(weiTextField.getText()) * 0.1;
            weiLabel.setText(result + " dag");
        } else if (weiChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("g") &&
                weiChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Kg")) {
            double result = Double.parseDouble(weiTextField.getText()) * 0.001;
            weiLabel.setText(result + " Kg");
        }else if (weiChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("g") &&
                weiChoiceBoxTo.getSelectionModel().getSelectedItem().equals("T")) {
            double result = Double.parseDouble(weiTextField.getText()) * 0.000001;
            weiLabel.setText(result + " T");
        }
        //dag
        if (weiChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("dag") &&
                weiChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mg")) {
            double result = Double.parseDouble(weiTextField.getText()) * 10000;
            weiLabel.setText(result + " mg");
        } else if (weiChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("dag") &&
                weiChoiceBoxTo.getSelectionModel().getSelectedItem().equals("g")) {
            double result = Double.parseDouble(weiTextField.getText()) * 10;
            weiLabel.setText(result + " g");
        } else if (weiChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("dag") &&
                weiChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Kg")) {
            double result = Double.parseDouble(weiTextField.getText()) * 0.01;
            weiLabel.setText(result + " Kg");
        }else if (weiChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("dag") &&
                weiChoiceBoxTo.getSelectionModel().getSelectedItem().equals("T")) {
            double result = Double.parseDouble(weiTextField.getText()) * 0.00001;
            weiLabel.setText(result + " T");
        }
        //Kg
        if (weiChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("Kg") &&
                weiChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mg")) {
            double result = Double.parseDouble(weiTextField.getText()) * 1000000;
            weiLabel.setText(result + " mg");
        } else if (weiChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("Kg") &&
                weiChoiceBoxTo.getSelectionModel().getSelectedItem().equals("g")) {
            double result = Double.parseDouble(weiTextField.getText()) * 1000;
            weiLabel.setText(result + " g");
        } else if (weiChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("Kg") &&
                weiChoiceBoxTo.getSelectionModel().getSelectedItem().equals("dag")) {
            double result = Double.parseDouble(weiTextField.getText()) * 100;
            weiLabel.setText(result + " dag");
        }else if (weiChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("Kg") &&
                weiChoiceBoxTo.getSelectionModel().getSelectedItem().equals("T")) {
            double result = Double.parseDouble(weiTextField.getText()) * 0.001;
            weiLabel.setText(result + " T");
        }
        //T
        if (weiChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("T") &&
                weiChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mg")) {
            double result = Double.parseDouble(weiTextField.getText()) * 1000000000;
            weiLabel.setText(result + " mg");
        } else if (weiChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("T") &&
                weiChoiceBoxTo.getSelectionModel().getSelectedItem().equals("g")) {
            double result = Double.parseDouble(weiTextField.getText()) * 1000000;
            weiLabel.setText(result + " g");
        } else if (weiChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("T") &&
                weiChoiceBoxTo.getSelectionModel().getSelectedItem().equals("dag")) {
            double result = Double.parseDouble(weiTextField.getText()) * 100000;
            weiLabel.setText(result + " dag");
        }else if (weiChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("T") &&
                weiChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Kg")) {
            double result = Double.parseDouble(weiTextField.getText()) *1000;
            weiLabel.setText(result + " Kg");
        }
    }





    private void back() {
        {
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getClassLoader().getResource("mainView.fxml"));
                Stage stage = (Stage) weiButtonBack.getScene().getWindow();
                stage.setScene(new Scene(root, 780, 300));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadData(){
        observableList.removeAll();
        observableList.addAll("mg","g","dag","Kg","T");
        weiChoiceBoxFrom.getItems().setAll(observableList);
        weiChoiceBoxTo.getItems().setAll(observableList);
    }
}
