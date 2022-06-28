package tutorial;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import sample.Main;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class AfterLogin {
    @FXML
    private Button logout;

    public void userLogout(javafx.event.ActionEvent actionEvent) throws IOException{

        Main m = new Main();
        m.changeScene("sample.fxml");
    }
}
