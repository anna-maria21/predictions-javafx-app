module org.example.dailyjokes {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.simtechdata.jokeapi;


    opens org.example.dailyjokes to javafx.fxml;
    exports org.example.dailyjokes;
}