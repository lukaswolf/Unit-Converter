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

public class SquareController implements Initializable {

    ObservableList<String> observableList = FXCollections.observableArrayList();
    @FXML
    Button squareButtonBack, squareButtonConvert;
    @FXML
    ChoiceBox<String> squareChoiceBoxTo, squareChoiceBoxFrom;
    @FXML
    Label squareLabel;
    @FXML
    TextField squareTextField;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();
        squareButtonConvert.setOnMouseClicked(event -> obliczenie());
        squareButtonBack.setOnMouseClicked(event -> back());

    }

    private void obliczenie() {
//mm2
        if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mm2") &&
                squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("cm2")){
            double result = Double.parseDouble(squareTextField.getText()) * 0.01;
            squareLabel.setText( result + " cm2");
        }
        else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mm2") &&
                squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("dm2")) {
            double result = Double.parseDouble(squareTextField.getText()) * 0.0001;
            squareLabel.setText( result + " dm2");
        }else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mm2") &&
                squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("m2")) {
            double result = Double.parseDouble(squareTextField.getText()) * 0.000001;
            squareLabel.setText(result + " m2");
        } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mm2") &&
                    squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("km2")) {
            double result = Double.parseDouble(squareTextField.getText()) * 0.00000000001;
            squareLabel.setText(result + " km2");
        }else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mm2") &&
                    squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("ar")) {
            double result = Double.parseDouble(squareTextField.getText()) * 0.0000001;
            squareLabel.setText(result + " ar");
        }else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("mm2") &&
                    squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("dm2")) {
            double result = Double.parseDouble(squareTextField.getText()) * 0.00000000001;
            squareLabel.setText(result + " ha");
        }
            //cm2
            if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("cm2")
                    && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mm2")) {
              double  result = Double.parseDouble(squareTextField.getText()) * 100;
                squareLabel.setText("" + result + " mm2");
            } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("cm2")
                    && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("dm2")) {
               double result = Double.parseDouble(squareTextField.getText()) * 0.01;
                squareLabel.setText("" + result + " dm2");
            } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("cm2")
                    && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("m2")) {
               double result = Double.parseDouble(squareTextField.getText()) * 0.0001;
                squareLabel.setText("" + result + " m2");
            } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("cm2")
                    && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("km2")) {
               double result = Double.parseDouble(squareTextField.getText()) * 0.000000000001;
                squareLabel.setText("" + result + " km2");
            } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("cm2")
                    && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("ar")) {
               double result = Double.parseDouble(squareTextField.getText()) * 0.000001;
                squareLabel.setText("" + result + " ar");
            } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("cm2")
                    && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("ha")) {
                double result = Double.parseDouble(squareTextField.getText()) * 0.000000001;
                squareLabel.setText("" + result + " ha");
            }
                //dm2
                if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("dm2")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mm2")) {
                  double  result = Double.parseDouble(squareTextField.getText()) * 10000;
                    squareLabel.setText("" + result + " mm2");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("dm2")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("cm2")) {
                   double result = Double.parseDouble(squareTextField.getText()) * 100;
                    squareLabel.setText("" + result + " cm2");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("dm2")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("m22")) {
                  double  result = Double.parseDouble(squareTextField.getText()) * 0.01;
                    squareLabel.setText("" + result + " m2");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("dm2")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("km2")) {
                   double result = Double.parseDouble(squareTextField.getText()) * 0.000000001;
                    squareLabel.setText("" + result + " km2");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("dm2")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("ar")) {
                   double result = Double.parseDouble(squareTextField.getText()) * 0.001;
                    squareLabel.setText("" + result + " ar");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("dm2")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("ha")) {
                    double result = Double.parseDouble(squareTextField.getText()) * 0.0000001;
                    squareLabel.setText("" + result + " ha");
                }
                //m2
                if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("m2")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mm2")) {
                   double result = Double.parseDouble(squareTextField.getText()) * 1000000;
                    squareLabel.setText("" + result + " mm2");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("m2")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("cm2")) {
                    double result = Double.parseDouble(squareTextField.getText()) * 10000;
                    squareLabel.setText("" + result + " cm2");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("m2")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("dm2")) {
                   double result = Double.parseDouble(squareTextField.getText()) * 100;
                    squareLabel.setText("" + result + " dm2");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("m2")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("km2")) {
                    double result = Double.parseDouble(squareTextField.getText()) * 0.000001;
                    squareLabel.setText("" + result + " km2");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("m2")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("ar")) {
                    double result = Double.parseDouble(squareTextField.getText()) * 0.01;
                    squareLabel.setText("" + result + " ar");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("m2")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("ha")) {
                    double result = Double.parseDouble(squareTextField.getText()) * 0.00001;
                    squareLabel.setText("" + result + " ha");
                }
                //km2
                if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("km2")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mm2")) {
                    double result = Double.parseDouble(squareTextField.getText()) * 1000000 * 1000000;
                    squareLabel.setText("" + result + " mm2");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("km2")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("cm2")) {
                   double result = Double.parseDouble(squareTextField.getText()) * 1000000000 * 10;
                    squareLabel.setText("" + result + " cm2");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("km2")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("dm2")) {
                   double result = Double.parseDouble(squareTextField.getText()) * 100000000;
                    squareLabel.setText("" + result + " dm2");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("km2")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("ar")) {
                   double result = Double.parseDouble(squareTextField.getText()) * 10000;
                    squareLabel.setText("" + result + " ar");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("km2")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("ha")) {
                   double result = Double.parseDouble(squareTextField.getText()) * 100;
                    squareLabel.setText("" + result + " ha");
                }
                //ar
                if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("ar")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mm2")) {
                   double result = Double.parseDouble(squareTextField.getText()) * 100000000;
                    squareLabel.setText("" + result + " mm2");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("ar")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("cm2")) {
                   double result = Double.parseDouble(squareTextField.getText()) * 1000000;
                    squareLabel.setText("" + result + " cm2");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("ar")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("dm2")) {
                   double result = Double.parseDouble(squareTextField.getText()) * 10000;
                    squareLabel.setText("" + result + " dm2");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("ar")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("m2")) {
                   double result = Double.parseDouble(squareTextField.getText()) * 100;
                    squareLabel.setText("" + result + " m2");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("ar")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("km2")) {
                   double result = Double.parseDouble(squareTextField.getText()) * 0.0001;
                    squareLabel.setText("" + result + " km2");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("ar")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("ha")) {
                   double result = Double.parseDouble(squareTextField.getText()) * 0.01;
                    squareLabel.setText("" + result + " ha");
                }
                //ha
                if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("ha")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("mm2")) {
                   double result = Double.parseDouble(squareTextField.getText()) * (10000000 * 1000);
                    squareLabel.setText("" + result + " mm2");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("ha")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("cm2")) {
                   double result = Double.parseDouble(squareTextField.getText()) * 100000000;
                    squareLabel.setText("" + result + " cm2");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("ha")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("dm2")) {
                   double result = Double.parseDouble(squareTextField.getText()) * 1000000;
                    squareLabel.setText("" + result + " dm2");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("ha")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("m2")) {
                   double result = Double.parseDouble(squareTextField.getText()) * 10000;
                    squareLabel.setText("" + result + " m2");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("ha")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("km2")) {
                    double result = Double.parseDouble(squareTextField.getText()) * 0.01;
                    squareLabel.setText("" + result + " km2");
                } else if (squareChoiceBoxFrom.getSelectionModel().getSelectedItem().equals("ha")
                        && squareChoiceBoxTo.getSelectionModel().getSelectedItem().equals("ar")) {
                   double result = Double.parseDouble(squareTextField.getText()) * 100;
                    squareLabel.setText("" + result + " ar");
                }
            }



    private void back() {
        {
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getClassLoader().getResource("mainView.fxml"));
                Stage stage = (Stage) squareButtonBack.getScene().getWindow();
                stage.setScene(new Scene(root, 780, 300));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadData(){
        observableList.removeAll();
        observableList.addAll("mm2","cm2","dm2","m2","km2","ar","ha");
        squareChoiceBoxFrom.getItems().setAll(observableList);
        squareChoiceBoxTo.getItems().setAll(observableList);
    }



}
