package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class GamingRoom {

    @FXML
    private Button buttonGoBack;

    @FXML
    private Label labelMode;


    public void goBack(javafx.event.ActionEvent actionEvent) throws IOException {
        Main m = new Main();

        m.changeScene("ChooseMode.fxml");

    }




}
