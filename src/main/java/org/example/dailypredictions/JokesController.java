package org.example.dailypredictions;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class JokesController {
    @FXML
    private TextArea joke;

    @FXML
    protected void onButtonClick() {
        joke.setText("Welcome to JavaFX Application!");
    }
}