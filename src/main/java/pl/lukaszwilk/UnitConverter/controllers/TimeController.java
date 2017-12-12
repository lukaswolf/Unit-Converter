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
import pl.lukaszwilk.UnitConverter.models.Utils;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TimeController implements Initializable {
    ObservableList<String> list = FXCollections.observableArrayList();
    @FXML
    Button timeButtonBack,timeButtonConvert;
    @FXML
    ChoiceBox<String> timeChoiceBoxTo, timeChoiceBoFrom;
    @FXML
    Label timeLabel;
    @FXML
    TextField timeTextField;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();
        timeButtonConvert.setOnMouseClicked(event -> obliczenie());
        timeButtonBack.setOnMouseClicked(event -> back());

    }

    private void back() {
        {
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getClassLoader().getResource("mainView.fxml"));
                Stage stage = (Stage) timeButtonBack.getScene().getWindow();
                stage.setScene(new Scene(root, 700, 280));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private void obliczenie() {
        //seconds
        if (timeChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Second") &&
                timeChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Minutes")){
            double result = Double.parseDouble(timeTextField.getText()) * 0.0166;
            timeLabel.setText("" + result + " Minutes");
        }else if (timeChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Second") &&
                timeChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Hour")){
            double result = Double.parseDouble(timeTextField.getText()) * 0.000277;
            timeLabel.setText("" + result + " Hour");
        }else if (timeChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Second") &&
                timeChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Day")) {
            double result = Double.parseDouble(timeTextField.getText()) * 0.00001157407;
            timeLabel.setText("" + result + " Day");
        }else if (timeChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Second") &&
                timeChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Year")) {
            double result = Double.parseDouble(timeTextField.getText()) * 0.0000000317097919;
            timeLabel.setText("" + result + " Year");
        }
        //minutes
         if (timeChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Minutes") &&
                timeChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Second")) {
             double result = Double.parseDouble(timeTextField.getText()) * 60;
             timeLabel.setText("" + result + " Seconds");
         }
         else if (timeChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Minutes") &&
                 timeChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Hour")) {
             double result = Double.parseDouble(timeTextField.getText()) * 0.0166;
             timeLabel.setText("" + result + " Hour");
         } else if (timeChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Minutes") &&
                 timeChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Day")) {
             double result = Double.parseDouble(timeTextField.getText()) * 0.0006944;
             timeLabel.setText("" + result + " Day");
         } else if (timeChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Minutes") &&
                 timeChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Year")) {
             double result = Double.parseDouble(timeTextField.getText()) * 0.00000019025;
             timeLabel.setText("" + result + " Year");
         }
         //hours
         if (timeChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Hour") &&
                timeChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Second")) {
            double result = Double.parseDouble(timeTextField.getText()) * 3600;
            timeLabel.setText("" + result + " Second");
        }
         else if (timeChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Hour") &&
                 timeChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Minutes")) {
             double result = Double.parseDouble(timeTextField.getText()) * 60;
             timeLabel.setText("" + result + " Minutes");
         } else if (timeChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Hour") &&
                 timeChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Day")) {
             double result = Double.parseDouble(timeTextField.getText()) * 0.041666;
             timeLabel.setText("" + result + " Day");
         } else if (timeChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Hour") &&
                 timeChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Year")) {
             double result = Double.parseDouble(timeTextField.getText()) * 0.0001141552511;
             timeLabel.setText("" + result + " Year");
         }
         //day
          if (timeChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Day") &&
                timeChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Second")) {
            double result = Double.parseDouble(timeTextField.getText()) * 86400;
            timeLabel.setText("" + result + " Second");
        }else if (timeChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Day") &&
                  timeChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Minutes")) {
              double result = Double.parseDouble(timeTextField.getText()) * 1440;
              timeLabel.setText("" + result + " Minutes");
          }else if (timeChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Day") &&
                  timeChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Hour")) {
              double result = Double.parseDouble(timeTextField.getText()) * 24;
              timeLabel.setText("" + result + " Hour");
          }else if (timeChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Day") &&
                  timeChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Year")) {
              double result = Double.parseDouble(timeTextField.getText()) * 0.0027397;
              timeLabel.setText("" + result + " Year");
          }
          //year
           if (timeChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Year") &&
                  timeChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Second")) {
              double result = Double.parseDouble(timeTextField.getText()) * 31536000;
              timeLabel.setText("" + result + " Second");
          }else if (timeChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Year") &&
                timeChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Minutes")) {
            double result = Double.parseDouble(timeTextField.getText()) * 525600;
            timeLabel.setText("" + result + " Minutes");
        }else if (timeChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Year") &&
                   timeChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Hour")) {
               double result = Double.parseDouble(timeTextField.getText()) * 8760;
               timeLabel.setText("" + result + " Hour");
           }else if (timeChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Year") &&
                   timeChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Day")) {
               double result = Double.parseDouble(timeTextField.getText()) * 365;
               timeLabel.setText("" + result + " Day");
           }else if (timeChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Year")
                   &&timeChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Year")){
               Utils.createSimpleDialog("Error","You cant convert from Year to Year","Edit!");
           }
    }

    private void loadData() {
        list.removeAll(list);
        list.addAll("Second","Minutes","Hour","Day","Year");
        timeChoiceBoFrom.getItems().setAll(list);
        timeChoiceBoxTo.getItems().setAll(list);
    }
}
