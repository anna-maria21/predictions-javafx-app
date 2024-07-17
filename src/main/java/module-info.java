module org.example.dailypredictions {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.dailypredictions to javafx.fxml;
    exports org.example.dailypredictions;
}