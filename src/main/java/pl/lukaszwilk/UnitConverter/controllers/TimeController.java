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
import pl.lukaszwilk.UnitConverter.models.UnitsTime;
import pl.lukaszwilk.UnitConverter.models.UnitsTimeCalulations;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TimeController  implements Initializable {
    ObservableList<String> list = FXCollections.observableArrayList();
    @FXML
    Button timeButtonBack, timeButtonConvert;
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
                stage.setScene(new Scene(root, 780, 300));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private void obliczenie() {
        //seconds



    }

    private void loadData() {
        list.removeAll(list);
        list.addAll(UnitsTime.getSeconds(),UnitsTime.getMinutes(),UnitsTime.getHour(),UnitsTime.getDay(),UnitsTime.getYear());

        timeChoiceBoFrom.getItems().setAll(list);
        timeChoiceBoxTo.getItems().setAll(list);

    }







}
