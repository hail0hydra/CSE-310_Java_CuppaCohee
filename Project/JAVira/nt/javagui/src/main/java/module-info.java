module com.example.filehandler {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.net.http;
    requires java.json;


    opens com.example.filehandler to javafx.fxml;
    exports com.example.filehandler;
}
