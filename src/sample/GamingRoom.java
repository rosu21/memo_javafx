package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class GamingRoom {

    @FXML
    private Button buttonGoBack;

    @FXML
    private Button buttonUpdate;

    @FXML
    private Label labelMode;

    @FXML
    private Label labelSets;


    public void goBack(javafx.event.ActionEvent actionEvent) throws IOException {
        Main m = new Main();

        m.changeScene("ChooseMode.fxml");

    }

    public void update(javafx.event.ActionEvent actionEvent) throws IOException {
        Game game = Game.getInstance();
        int setSize = game.getSetSize();
        int setNumber = game.getSetNumber();
        boolean gameMode = game.getGamingMode();
        String mode = new String();
        if (gameMode) {
            mode = "Botmode";
        } else {
            mode = "SinglePlayer mode";
        }

        changeLabels("Size = " + Integer.toString(setSize) + "Number = " + Integer.toString(setNumber), mode);
    }


    public void changeLabels(String sets, String mode){
        labelSets.setText(sets);
        labelMode.setText(mode);

    }




}
