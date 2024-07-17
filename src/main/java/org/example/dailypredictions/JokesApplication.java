package org.example.dailypredictions;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class JokesApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(JokesApplication.class.getResource("jokes-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 365, 390);
        stage.setTitle("Your Joke For Today ^_^");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}