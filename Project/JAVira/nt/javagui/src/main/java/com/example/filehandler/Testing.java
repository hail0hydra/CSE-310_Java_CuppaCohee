package com.example.filehandler;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Testing extends Application {
    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("first window");
        window.setMinWidth(479);
        window.setMinHeight(256);

        button = new Button("check");
        button.setOnAction(e -> Alertbox.display("Checking the file" , "Oops! File Corrupted :("));
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene= new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }


}
