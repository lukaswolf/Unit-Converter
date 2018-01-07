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

public class VolumeController implements Initializable {
    ObservableList<String> observableList = FXCollections.observableArrayList();
    @FXML
    Button volButtonBack, volButtonConvert;
    @FXML
    ChoiceBox<String> volChoiceBoxTo, volChoiceBoxFrom;
    @FXML
    Label volLabel;
    @FXML
    TextField volTextField;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();
        volButtonConvert.setOnMouseClicked(event -> obliczenie());
        volButtonBack.setOnMouseClicked(event -> back());

    }

    private void obliczenie() {
//mm3
        if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mm3") &&
                volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("cm3")) {
            double result = Double.parseDouble(volTextField.getText()) * 0.001;
            volLabel.setText(result + " cm3");
        } else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mm3") &&
                volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("dm3")) {
            double result = Double.parseDouble(volTextField.getText()) * 0.000001;
            volLabel.setText(result + " dm3");
        } else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mm3") &&
                volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("m3")) {
            double result = Double.parseDouble(volTextField.getText()) * 0.0000000001;
            volLabel.setText(result + " m3");
        }else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mm3") &&
                volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mL")) {
            double result = Double.parseDouble(volTextField.getText()) * 0.001;
            volLabel.setText(result + " mL");
        }else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mm3") &&
                volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("L")) {
            double result = Double.parseDouble(volTextField.getText()) * 0.000001;
            volLabel.setText(result + " L");
        }
        //cm3
        if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("cm3")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mm3")) {
            double result = Double.parseDouble(volTextField.getText()) * 1000;
            volLabel.setText("" + result + " mm3");
        } else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("cm3")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("dm3")) {
            double result = Double.parseDouble(volTextField.getText()) * 0.001;
            volLabel.setText("" + result + " dm3");
        } else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("cm3")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mL")) {
            double result = Double.parseDouble(volTextField.getText()) * 1;
            volLabel.setText("" + result + " mL");
        } else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("cm3")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("L")) {
            double result = Double.parseDouble(volTextField.getText()) * 0.001;
            volLabel.setText("" + result + " L");
        }
        //dm3
        if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("dm3")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mm3")) {
            double result = Double.parseDouble(volTextField.getText()) * 1000000;
            volLabel.setText("" + result + " mm3");
        } else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("dm3")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("cm3")) {
            double result = Double.parseDouble(volTextField.getText()) * 1000;
            volLabel.setText("" + result + " cm3");
        } else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("dm3")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("m3")) {
            double result = Double.parseDouble(volTextField.getText()) * 0.001;
            volLabel.setText("" + result + " m3");
        } else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("dm3")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mL")) {
            double result = Double.parseDouble(volTextField.getText()) * 1000;
            volLabel.setText("" + result + " mL");
        } else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("dm3")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("L")) {
            double result = Double.parseDouble(volTextField.getText()) * 1;
            volLabel.setText("" + result + " L");
        }
        //M3
        if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("m3")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mm3")) {
            double result = Double.parseDouble(volTextField.getText()) * 1000000000;
            volLabel.setText("" + result + " mm3");
        } else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("m3")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("cm3")) {
            double result = Double.parseDouble(volTextField.getText()) * 1000000;
            volLabel.setText("" + result + " cm3");
        } else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("m3")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("dm3")) {
            double result = Double.parseDouble(volTextField.getText()) * 1000;
            volLabel.setText("" + result + " dm3");
        } else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("m3")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("L")) {
        double result = Double.parseDouble(volTextField.getText()) * 1000;
        volLabel.setText("" + result + " L");
    } else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("m3")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mL")) {
        double result = Double.parseDouble(volTextField.getText()) * 1000000;
        volLabel.setText("" + result + " mL");
    }
    //mL
        if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mL")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mm3")) {
            double result = Double.parseDouble(volTextField.getText()) * 1000;
            volLabel.setText("" + result + " mm3");
        } else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mL")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("cm3")) {
            double result = Double.parseDouble(volTextField.getText()) * 1;
            volLabel.setText("" + result + " cm3");
        } else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mL")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("dm3")) {
            double result = Double.parseDouble(volTextField.getText()) * 0.001;
            volLabel.setText("" + result + " dm3");
        } else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mL")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("m3")) {
            double result = Double.parseDouble(volTextField.getText()) * 0.000001;
            volLabel.setText("" + result + " m3");
        } else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mL")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("L")) {
            double result = Double.parseDouble(volTextField.getText()) * 0.001;
            volLabel.setText("" + result + " L");
        }
        //L
        if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("L")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mm3")) {
            double result = Double.parseDouble(volTextField.getText()) * 1000000;
            volLabel.setText("" + result + " mm3");
        } else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("L")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("cm3")) {
            double result = Double.parseDouble(volTextField.getText()) * 1000;
            volLabel.setText("" + result + " cm3");
        } else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("L")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("dm3")) {
            double result = Double.parseDouble(volTextField.getText()) * 1;
            volLabel.setText("" + result + " dm3");
        } else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("L")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("m3")) {
            double result = Double.parseDouble(volTextField.getText()) * 0.001;
            volLabel.setText("" + result + " m3");
        } else if (volChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("L")
                && volChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mL")) {
            double result = Double.parseDouble(volTextField.getText()) * 1000;
            volLabel.setText("" + result + " mL");
        }
    }





    private void back() {
        {
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getClassLoader().getResource("mainView.fxml"));
                Stage stage = (Stage) volButtonBack.getScene().getWindow();
                stage.setScene(new Scene(root, 780, 300));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadData(){
        observableList.removeAll();
        observableList.addAll("mm3","cm2","dm3","m3","L","mL");
        volChoiceBoxFrom.getItems().setAll(observableList);
        volChoiceBoxTo.getItems().setAll(observableList);
    }

}
