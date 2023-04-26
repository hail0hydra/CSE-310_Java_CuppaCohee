package com.example.filehandler;

import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Icon {
    // private static final String IMAGE_LOC = "C:\\Users\\acer\\IdeaProjects\\filehandler\\src\\main\\resources\\com\\example\\filehandler\\icon.png";
    private static final String IMAGE_LOC = "F:\\LPU\\Semester 4\\JAVA - CSE 310\\Project\\JAVira\\javagui\\src\\main\\resources\\com\\example\\filehandler\\icon.png";
    public static void setStageIcon(Stage stage)
    {
        stage.getIcons().add(new Image(IMAGE_LOC));
    }
}
