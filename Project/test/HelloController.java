package com.example.filehandler;

// added
import javax.json.JsonObject;
//

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class HelloController implements Initializable {


    FileChooser fc = new FileChooser();

    // two click handle
    JsonObject jo;
    int logKarnaHai = -1;
    boolean dumpKarnaHai = false;
    int mal = -1;

    String fileAsString;


    @FXML
    private Button check;

    @FXML
    private Button file;

    @FXML
    private TextArea txtview;

    @FXML
    private CheckBox box1;

    @FXML
    private CheckBox box2;


    private BackEnd be = new BackEnd();

    @FXML
    void selectbox1(MouseEvent event) throws Exception {
        if (box1.isSelected()) {
            dumpKarnaHai = true;
        } else {
            dumpKarnaHai = false;
        }

    }

    @FXML
    void selectbox2(MouseEvent event) throws Exception {
        if (box2.isSelected()) {
            logKarnaHai = logKarnaHai + 1;
        } else {

            logKarnaHai = -1;
        }
    }



    @FXML
        // void clickedOncheck(ActionEvent event) throws Exception {
    void clickedOncheck(Event event) throws Exception{

        //the method name for check button is checkVirus , and stored it in variable mal .

        jo = be.handleAPI(fileAsString);
        mal = be.checkVirus(fileAsString,jo);
        // mal is checked for malicious or not

        logKarnaHai = logKarnaHai + 1;

        if (logKarnaHai == 2){
            be.createLog(fileAsString,mal);
        }

        if (dumpKarnaHai){
            be.dumpJson(fileAsString,jo);
        }
        if(mal>0){

            check.setOnAction(e -> Alertbox.display("Checking for the files" , "Oops! File is malicious!!!"));
            //passing the title and the message in the alertbox's display method

        }
        else{
            check.setOnAction(e -> Alertbox.display("Checking for the files" , "Yay! File is safe!!!"));
        }
        Icon.setStageIcon(new Stage());

        //will uncheck the boxes
        box1.setSelected(false);
    box2.setSelected(false);

//will refresh the json object
        if (jo != null) {
            jo = be.handleAPI(fileAsString);
        }
    txtview.setText("");

    }

    @FXML
    void getText(MouseEvent event)throws Exception
    {
        //selecting file from system
        File selectedfile = fc.showOpenDialog(new Stage());
        if(selectedfile!=null)
        {
            //writes the absolute path in the text window
            txtview.appendText(selectedfile.getAbsolutePath());

            fileAsString = selectedfile.toString();
            System.out.println("File selected is: " + fileAsString);
        }

    }
    @FXML
    void clickedOnfile(ActionEvent event) throws Exception{


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        //        fc.showOpenDialog(null);

    }
}
