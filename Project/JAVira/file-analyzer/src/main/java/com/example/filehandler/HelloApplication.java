package com.example.filehandler;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {


        try{
            Object root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            //scene is created from the data in the fxml file
            Scene scene = new Scene((Parent) root);
            primaryStage.setScene(scene);
            Icon.setStageIcon(primaryStage);
            primaryStage.show();
            primaryStage.setResizable(false);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        launch();
    }
}
