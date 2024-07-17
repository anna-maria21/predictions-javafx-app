package org.example.dailyjokes;

import com.simtechdata.jokes.Jokes;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import static com.simtechdata.jokes.enums.Category.PROGRAMMING;

public class JokesController {
    @FXML
    private TextArea joke;
    @FXML
    private Button btn;
    @FXML
    private TextField username;
    @FXML
    private Slider slider;
    @FXML
    private Label sliderText;

    @FXML
    private void initialize() {
        btn.disableProperty().bind(username.textProperty().isEmpty());
        slider.valueProperty().addListener((observable, oldValue, newValue) -> sliderText.setOpacity(1 - newValue.doubleValue() / 100));
    }

    @FXML
    protected void onButtonClick() {
        Jokes jokes = new Jokes.Builder().addCategory(PROGRAMMING).build();
        String receivedJoke = jokes.getAny();

        joke.setVisible(true);
        joke.setText("Hi, " + username.getText() + "! Here is yore joke:\n" + receivedJoke);
    }

}