package pl.lukaszwilk.UnitConverter.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import pl.lukaszwilk.UnitConverter.models.UserSession;
import pl.lukaszwilk.UnitConverter.models.Utils;
import pl.lukaszwilk.UnitConverter.models.dao.UserDao;
import pl.lukaszwilk.UnitConverter.models.dao.impl.UserDaoImpl;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    TextField textLoginL, textLoginR;
    @FXML
    TextField textPasswordR, textPasswordRR, textPasswordL;
    @FXML
    Button buttonLoginL, buttonRegister,buttonSkip;

    private UserSession userSession = UserSession.getInstance();
    private UserDao userDao = new UserDaoImpl();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        buttonLoginL.setOnMouseClicked(e -> tryLogin());
        buttonRegister.setOnMouseClicked(event -> tryRegister());
        buttonSkip.setOnMouseClicked(event -> skip());

    }

    private void skip() {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("mainView.fxml"));
            Stage stageRoot =(Stage) buttonLoginL.getScene().getWindow();
            stageRoot.setScene(new Scene(root,780,300));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private boolean checkLoginData() {
        String login = textLoginL.getText();
        String password = textPasswordL.getText();

        if (login.isEmpty() || password.isEmpty()) {
            Utils.createSimpleDialog("Logowanie", "Nie poprawne dane", "Pola nie moga byc puste");
            return false;
        }
        if (login.length() <= 3 || password.length() <= 5) {
            Utils.createSimpleDialog("Logowanie", "Nie poprawne dane", "Dlugosc musi byc wieksza niz 3 znaki");
        }
        return true;
    }

    private void tryLogin() {
        String login = textLoginL.getText();
        String password = textPasswordL.getText();
        if (!checkLoginData()) {
            return;
        }

        if (userDao.login(login, password)) {

            userSession.setUsername(login);
            userSession.setLogedIn(true);


            try {
                Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("mainView.fxml"));
                Stage stageRoot =(Stage) buttonLoginL.getScene().getWindow();
                stageRoot.setScene(new Scene(root,780,300));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            Utils.createSimpleDialog("Logowanie", "Przykro mi!", "Zaloguj ponownie");
        }
    }

    private boolean checkRegisterData() {
        String login = textLoginR.getText();
        String password = textPasswordR.getText();
        String passwordRepeat = textPasswordRR.getText();

if (login.isEmpty()||password.isEmpty()||passwordRepeat.isEmpty()){
    Utils.createSimpleDialog("Rejestracja","Popraw dane","Pola nie moga być puste");
    return false;
}
        if (!password.equals(passwordRepeat)) {
    Utils.createSimpleDialog("Rejestracja","Hasla sa nie zgodne","Sprawdź poprawnosc hasel");
    return false;
        }
        if (login.length()<=3||password.length()<=5 ){
    Utils.createSimpleDialog("Rejestracja ","Za krótkie dane","Wpisz wieksza ilosc");
    return false;
        }
        return true;
    }
    private void tryRegister(){
        String login = textLoginR.getText();
        String password = textPasswordR.getText();
        String passwordRepeat = textPasswordRR.getText();
        if (!checkRegisterData()){
            return;
        }
        if (userDao.register(login,password)){
            userSession.setLogedIn(true);
            userSession.setUsername(login);
            Utils.createSimpleDialog("Rejestracja","Gratulacje zajestrowales sie","Brawo!");

        }else {
            Utils.createSimpleDialog("Rejstracja","Nie zarejestrowales sie","Przykro mi");
        }
    }
}