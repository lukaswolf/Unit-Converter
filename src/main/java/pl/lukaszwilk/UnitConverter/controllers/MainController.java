package pl.lukaszwilk.UnitConverter.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import pl.lukaszwilk.UnitConverter.models.MySQLConnector;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable{
    @FXML
    Button buttonTime
    ,buttonComputer
    ,buttonLenght
    ,buttonSpeed
    ,buttonPressure
    ,buttonEnergy
    ,buttonTemperature
    ,buttonWeight
    ,buttonVolume
    ,buttonSquare;



    public void setButtonEnergy(Button buttonEnergy) {
        buttonEnergy.setGraphic(new ImageView("images/plug.png"));

    }

    public void setButtonComputer(Button buttonComputer) {
        buttonComputer.setGraphic(new ImageView("images/computer.png"));
    }

    public void setButtonLenght(Button buttonLenght) {
        buttonLenght.setGraphic(new ImageView("images/lenght.png"));
    }

    public void setButtonSquare(Button buttonSquare) {
        buttonSquare.setGraphic(new ImageView("images/area.png"));
    }

    public void setButtonPressure(Button buttonPressure) {
        buttonPressure.setGraphic(new ImageView("images/pressure.png"));
    }

    public void setButtonSpeed(Button buttonSpeed) {
        buttonSpeed.setGraphic(new ImageView("images/speed.png"));
    }

    public void setButtonTime(Button buttonTime) {
        buttonTime.setGraphic(new ImageView("images/time.png"));
    }

    public void setButtonVolume(Button buttonVolume) {
        buttonVolume.setGraphic(new ImageView("images/volume.png"));
    }

    public void setButtonWeight(Button buttonWeight) {
        buttonWeight.setGraphic(new ImageView("images/weight.png"));
    }

    public void setButtonTemperature(Button buttonTemperature) {
        buttonTemperature.setGraphic(new ImageView("images/thermometr.png"));
    }

    public void initialize(URL location, ResourceBundle resources) {
        MySQLConnector.getInstance();

        buttonLenght.setOnMouseClicked(event -> tryIn());
        buttonTime.setOnMouseClicked(event -> enter());
        buttonComputer.setOnMouseClicked(event -> in());
        buttonPressure.setOnMouseClicked(event -> on());
        buttonSquare.setOnMouseClicked(event -> ol());
        buttonTemperature.setOnMouseClicked(event -> o2());
        buttonVolume.setOnMouseClicked(event -> o3());
        buttonWeight.setOnMouseClicked(event -> o4());
        buttonEnergy.setOnMouseClicked(event -> o5());
        buttonSpeed.setOnMouseClicked(event -> o6());
        setButtonComputer(buttonComputer);
        setButtonEnergy(buttonEnergy);
        setButtonLenght(buttonLenght);
        setButtonSquare(buttonSquare);
        setButtonPressure(buttonPressure);
        setButtonSpeed(buttonSpeed);
        setButtonTime(buttonTime);
        setButtonVolume(buttonVolume);
        setButtonWeight(buttonWeight);
        setButtonTemperature(buttonTemperature);

    }

    private void o6() {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("speedView.fxml"));
            Stage stage = (Stage) buttonSpeed.getScene().getWindow();
            stage.setScene(new Scene(root, 600, 580));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void o5() {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("energyView.fxml"));
            Stage stage = (Stage) buttonEnergy.getScene().getWindow();
            stage.setScene(new Scene(root, 600, 580));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void o4() {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("weightView.fxml"));
            Stage stage = (Stage) buttonPressure.getScene().getWindow();
            stage.setScene(new Scene(root, 600, 580));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void o3() {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("volumeView.fxml"));
            Stage stage = (Stage) buttonPressure.getScene().getWindow();
            stage.setScene(new Scene(root, 600, 580));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void o2() {Parent root = null;
        try {
            root=FXMLLoader.load(getClass().getClassLoader().getResource("temperatureView.fxml"));
            Stage stage = (Stage) buttonPressure.getScene().getWindow();
            stage.setScene(new Scene(root,600,580));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void ol() {Parent root = null;
        try {
            root=FXMLLoader.load(getClass().getClassLoader().getResource("squareView.fxml"));
            Stage stage = (Stage) buttonPressure.getScene().getWindow();
            stage.setScene(new Scene(root,600,580));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void on() {Parent root = null;
        try {
            root=FXMLLoader.load(getClass().getClassLoader().getResource("pressureView.fxml"));
            Stage stage = (Stage) buttonPressure.getScene().getWindow();
            stage.setScene(new Scene(root,600,580));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void in() {Parent root = null;
        try {
            root=FXMLLoader.load(getClass().getClassLoader().getResource("itView.fxml"));
            Stage stage = (Stage) buttonComputer.getScene().getWindow();
            stage.setScene(new Scene(root,600,580));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void enter() {Parent root = null;
        try {
            root=FXMLLoader.load(getClass().getClassLoader().getResource("timeView.fxml"));
            Stage stage = (Stage) buttonLenght.getScene().getWindow();
            stage.setScene(new Scene(root,600,580));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void tryIn() {
        Parent root = null;
        try {
            root=FXMLLoader.load(getClass().getClassLoader().getResource("lenghtView.fxml"));
            Stage stage = (Stage) buttonLenght.getScene().getWindow();
            stage.setScene(new Scene(root,600,580));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}



