package com.example.filehandler;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

//this is the alertbox class which will pop up when check button is clicked
public class Alertbox {
    //passing 2 parameter title and message
    public static void display(String title, String message) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        //title is set to the value we passed in the controller method .
        window.setTitle(title);
        window.setMinWidth(379);
        window.setMinHeight(256);

        Label label = new Label();
        label.setText(message);
        //label(the text shown on the screen) is set to the value we passed as the message .
        Button closeButton = new Button("Close");

        //closes pop up window when close button clicked
        closeButton.setOnAction(e -> window.close());

        //the layout of the scene
        VBox layout = new VBox(20);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        //this is used so that only after the close button the pop up screen closes.
    }
}
