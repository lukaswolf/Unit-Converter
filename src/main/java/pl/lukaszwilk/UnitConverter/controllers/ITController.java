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

public class ITController implements Initializable {
    ObservableList<String> list = FXCollections.observableArrayList();
    @FXML
    ChoiceBox<String> itChoiceBoxFrom,itChoiceBoxTo;
    @FXML
    Label itLabel;
    @FXML
    TextField itTextField;
    @FXML
    Button itButtonConvert,itButtonBack;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();
        itButtonConvert.setOnMouseClicked(event -> obliczenia());
        itButtonBack.setOnMouseClicked(event -> back());

    }

    private void back() {Parent root = null;
        try {
            root= FXMLLoader.load(getClass().getClassLoader().getResource("mainView.fxml"));
            Stage stage = (Stage) itButtonBack.getScene().getWindow();
            stage.setScene(new Scene(root,700,280));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void obliczenia() {
        //bit
        if (itChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("b") && itChoiceBoxTo.getSelectionModel()
                .getSelectedItem().equals("B")) {
            double result = Double.parseDouble(itTextField.getText()) / 8;
            itLabel.setText("" + result);
        } else if (itChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("b") && itChoiceBoxTo.getSelectionModel()
                .getSelectedItem().equals("KB")) {
            double result = Double.parseDouble(itTextField.getText()) / 1024 / 8;
            itLabel.setText("" + result);
        } else if (itChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("b") && itChoiceBoxTo.getSelectionModel()
                .getSelectedItem().equals("MB")) {
            double result = Double.parseDouble(itTextField.getText()) / 1024/1024 / 8;
            itLabel.setText(String.format("%.13f%n",result));
        }else if (itChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("b") && itChoiceBoxTo.getSelectionModel()
                .getSelectedItem().equals("GB")) {
            double result = Double.parseDouble(itTextField.getText()) / 1024/1024/1024 / 8;
            itLabel.setText(String.format("%.16f%n",result));
        }
        //Bajt
        if (itChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("B") &&
                itChoiceBoxTo.getSelectionModel().getSelectedItem().equals("b")){
            double result = Double.parseDouble(itTextField.getText())*8;
            itLabel.setText("" + result);
        }
        else if (itChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("B") &&
                itChoiceBoxTo.getSelectionModel().getSelectedItem().equals("KB")){
            double result = Double.parseDouble(itTextField.getText())/1024;
            itLabel.setText(String.format("%.13f%n",result));
        }else if (itChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("B") &&
                itChoiceBoxTo.getSelectionModel().getSelectedItem().equals("MB")){
            double result = Double.parseDouble(itTextField.getText())/1024/1024;
            itLabel.setText(String.format("%.13f%n",result));
        }else if (itChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("B") &&
                itChoiceBoxTo.getSelectionModel().getSelectedItem().equals("GB")){
            double result = Double.parseDouble(itTextField.getText())/1024/1024/1024;
            itLabel.setText(String.format("%.13f%n",result));
        }
        //KB
        if (itChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("KB") &&
                itChoiceBoxTo.getSelectionModel().getSelectedItem().equals("b")){
            double result =Double.parseDouble(itTextField.getText())*8192;
            itLabel.setText("" + result);
        }
        else  if (itChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("KB") &&
                itChoiceBoxTo.getSelectionModel().getSelectedItem().equals("B")){
            double result =Double.parseDouble(itTextField.getText())*1024;
            itLabel.setText("" + result);
        }else  if (itChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("KB") &&
                itChoiceBoxTo.getSelectionModel().getSelectedItem().equals("MB")){
            double result =Double.parseDouble(itTextField.getText())/1024;
            itLabel.setText(String.format("%.13f%n",result));
        }else  if (itChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("KB") &&
                itChoiceBoxTo.getSelectionModel().getSelectedItem().equals("GB")) {
            double result = Double.parseDouble(itTextField.getText()) / 1024 / 1024;
            itLabel.setText(String.format("%.13f%n", result));
        }
        //MB
        if (itChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("MB") &&
                itChoiceBoxTo.getSelectionModel().getSelectedItem().equals("b")){
            double result = Double.parseDouble(itTextField.getText())*8388608;
            itLabel.setText(String.format("%.13f%n",result));
        }
        else if (itChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("MB") &&
                itChoiceBoxTo.getSelectionModel().getSelectedItem().equals("B")){
            double result = Double.parseDouble(itTextField.getText())*1048576;
            itLabel.setText(String.format("%.13f%n",result));
        }else if (itChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("MB") &&
                itChoiceBoxTo.getSelectionModel().getSelectedItem().equals("KB")){
            double result = Double.parseDouble(itTextField.getText())*1024;
            itLabel.setText(String.format("%.13f%n",result));
        }else if (itChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("MB") &&
                itChoiceBoxTo.getSelectionModel().getSelectedItem().equals("GB")){
            double result = Double.parseDouble(itTextField.getText())/1024;
            itLabel.setText(String.format("%.13f%n",result));
        }//GB
        if (itChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("GB") &&
        itChoiceBoxTo.getSelectionModel().getSelectedItem().equals("b")){
            long result = Long.parseLong(itTextField.getText())*1048576*8192;
            itLabel.setText(""+result);
        }
        else if (itChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("GB") &&
                itChoiceBoxTo.getSelectionModel().getSelectedItem().equals("B")){
            long result = Long.parseLong(itTextField.getText())*1073741824;
            itLabel.setText(""+result);
        }else if (itChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("GB") &&
                itChoiceBoxTo.getSelectionModel().getSelectedItem().equals("KB")){
            long result = Long.parseLong(itTextField.getText())*1048576;
            itLabel.setText(""+result);
        }else if (itChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("GB") &&
                itChoiceBoxTo.getSelectionModel().getSelectedItem().equals("MB")){
            long result = Long.parseLong(itTextField.getText())*1024;
            itLabel.setText(""+result);
        }
    }

    private void loadData() {
        list.removeAll();
        list.addAll("b","B","KB","MB","GB");
        itChoiceBoxFrom.getItems().setAll(list);
        itChoiceBoxTo.getItems().setAll(list);
    }
}
