package pl.lukaszwilk.UnitConverter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("loginView.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 350));
        primaryStage.show();
        primaryStage.setAlwaysOnTop(false);
        primaryStage.setResizable(false);
       ;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
