package pl.lukaszwilk.UnitConverter.controllers;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.IntegerStringConverter;

import pl.lukaszwilk.UnitConverter.models.Utils;
import sun.awt.SunHints;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ResourceBundle;
import java.util.function.UnaryOperator;
import java.util.regex.Pattern;

public class LenghtController  implements Initializable

{
    ObservableList<String> list = FXCollections.observableArrayList();

    @FXML
    ChoiceBox<String> lenghtChoiceBoxTo,lenghtChoiceBoFrom;
    @FXML
    Label lenghtLabel;
    @FXML
   TextField lenghtTextField;
    @FXML
    Button lenghtButtonConvert , lenghtButtonBack;







    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();
        lenghtButtonConvert.setOnMouseClicked(event -> obliczenie());
        lenghtButtonBack.setOnMouseClicked(event -> back());

    }





    private void back() {Parent root = null;
        try {
            root= FXMLLoader.load(getClass().getClassLoader().getResource("mainView.fxml"));
            Stage stage = (Stage) lenghtButtonBack.getScene().getWindow();
            stage.setScene(new Scene(root,700,280));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void obliczenie() {
        //km

        if (lenghtChoiceBoxTo.getSelectionModel().getSelectedItem().equals("KM")
                && lenghtChoiceBoFrom.getSelectionModel().getSelectedItem().equals("M")) {
            double result = Double.parseDouble(lenghtTextField.getText()) * 1000;
            lenghtLabel.setText("" + result + " M");
        } else if (lenghtChoiceBoxTo.getSelectionModel().getSelectedItem().equals("KM")
                && lenghtChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Dm")) {
            double result = Double.parseDouble(lenghtTextField.getText()) * 10000;
            lenghtLabel.setText("" + result + " Dm");
        } else if ((lenghtChoiceBoxTo.getSelectionModel().getSelectedItem().equals("KM")
                && lenghtChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Cm"))) {
            double result = Double.parseDouble(lenghtTextField.getText()) * 100000;
            lenghtLabel.setText("" + result + " Cm");
        } else if (lenghtChoiceBoxTo.getSelectionModel().getSelectedItem().equals("KM")
                && lenghtChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Mm")) {
            double result = Double.parseDouble(lenghtTextField.getText()) * 1000000;
            lenghtLabel.setText("" + result + " Mm");
        }
        //M
        if (lenghtChoiceBoxTo.getSelectionModel().getSelectedItem().equals("M")
                && lenghtChoiceBoFrom.getSelectionModel().getSelectedItem().equals("KM")) {
            Double result = Double.parseDouble(lenghtTextField.getText()) * 0.001;
            lenghtLabel.setText("" + result + " KM");
        } else if (lenghtChoiceBoxTo.getSelectionModel().getSelectedItem().equals("M")
                && lenghtChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Dm")) {
            double result = Double.parseDouble(lenghtTextField.getText()) * 10;
            lenghtLabel.setText("" + result + " Dm");
        } else if ((lenghtChoiceBoxTo.getSelectionModel().getSelectedItem().equals("M")
                && lenghtChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Cm"))) {
            double result = Double.parseDouble(lenghtTextField.getText()) * 100;
            lenghtLabel.setText("" + result + " Cm");
        } else if (lenghtChoiceBoxTo.getSelectionModel().getSelectedItem().equals("M")
                && lenghtChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Mm")) {
            double result = Double.parseDouble(lenghtTextField.getText()) * 1000;
            lenghtLabel.setText("" + result + " Mm");
        }
        //Dm
        if (lenghtChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Dm")
                && lenghtChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Km")) {
            Double result = Double.parseDouble(lenghtTextField.getText()) * 0.0001;
            lenghtLabel.setText("" + result + " Km");
        } else if (lenghtChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Dm")
                && lenghtChoiceBoFrom.getSelectionModel().getSelectedItem().equals("M")) {
            double result = Double.parseDouble(lenghtTextField.getText()) * 0.01;
            lenghtLabel.setText("" + result + " M");
        } else if ((lenghtChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Dm")
                && lenghtChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Cm"))) {
            double result = Double.parseDouble(lenghtTextField.getText()) * 10;
            lenghtLabel.setText("" + result + " Cm");
        } else if (lenghtChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Dm")
                && lenghtChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Mm")) {
            double result = Double.parseDouble(lenghtTextField.getText()) * 100;
            lenghtLabel.setText("" + result + " Mm");
        }
//        cm
        if (lenghtChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Cm")
                && lenghtChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Km")) {
            double result = Double.parseDouble(lenghtTextField.getText()) * 0.00001;
            lenghtLabel.setText("" + result + " Km");
        } else if (lenghtChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Cm")
                && lenghtChoiceBoFrom.getSelectionModel().getSelectedItem().equals("M")) {
            double result = Double.parseDouble(lenghtTextField.getText()) * 0.001;
            lenghtLabel.setText("" + result + " M");
        } else if ((lenghtChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Cm")
                && lenghtChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Dm"))) {
            double result = Double.parseDouble(lenghtTextField.getText()) * 0.1;
            lenghtLabel.setText("" + result + " Dm");
        } else if (lenghtChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Cm")
                && lenghtChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Mm")) {
            double result = Double.parseDouble(lenghtTextField.getText()) * 10;
            lenghtLabel.setText("" + result + " Mm");
        }
        //Mm
        if (lenghtChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Mm")
                && lenghtChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Km")) {
            double result = Double.parseDouble(lenghtTextField.getText()) * 0.0000001;
            lenghtLabel.setText("" + result + " Km");
        } else if (lenghtChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Mm")
                && lenghtChoiceBoFrom.getSelectionModel().getSelectedItem().equals("M")) {
            double result = Double.parseDouble(lenghtTextField.getText()) * 0.001;
            lenghtLabel.setText("" + result + " M");
        } else if ((lenghtChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Mm")
                && lenghtChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Dm"))) {
            double result = Double.parseDouble(lenghtTextField.getText()) * 0.01;
            lenghtLabel.setText("" + result + " Dm");
        } else if (lenghtChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Mm")
                && lenghtChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Cm")) {
            double result = Double.parseDouble(lenghtTextField.getText()) * 0.1;
            lenghtLabel.setText("" + result + " Cm");
        }else if (lenghtChoiceBoxTo.getSelectionModel().getSelectedItem().equals("Mm")
                && lenghtChoiceBoFrom.getSelectionModel().getSelectedItem().equals("Mm")){
            Utils.createSimpleDialog("Lenght","You cant convert from Mm to Mm","Edit");
        }

        }







    private void loadData(){
        list.removeAll(list);
        list.addAll("KM","M","Dm","Cm","Mm");
        lenghtChoiceBoxTo.getItems().setAll(list);
        lenghtChoiceBoFrom.getItems().setAll(list);
    }


   private void textConvertToNumbers1(){
      lenghtTextField.textProperty().addListener(new ChangeListener<String>() {
          @Override
          public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
               if (!newValue.matches("[0-9]{10}(\\.[0-9]*)?")){
                   lenghtTextField.setText(newValue.replaceAll("[^\\d].",""));
                   StringBuilder aus = new StringBuilder(newValue);
                   boolean firstPointFound = false;
                   for (int i = 0; i < aus.length(); i++){
                       if(aus.charAt(i) == '.') {
                           if(!firstPointFound)
                               firstPointFound = true;
                           else
                               aus.deleteCharAt(i);
                       }
                   }
                   newValue = aus.toString();

               }
          }
       });
   }



}
