package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class ChooseMode {
    // Attributes
    //---------------------------------------------------------------------------
    Game game;

    //Constructor, getter, setter
    //---------------------------------------------------------------------------
    public ChooseMode(Game game){
        this.game = game;
    }


    //FXML
    //---------------------------------------------------------------------------
    // controller of ChooseMode.fxml
    @FXML
    private Button buttonSinglePlayer;

    @FXML
    private Button buttonBotMode;

    @FXML
    private Button buttonBack;


    public void goBack(javafx.event.ActionEvent actionEvent) throws IOException {
        Main m = new Main();

        m.changeScene("ChooseSets.fxml");

    }

    public void singlePlayer(javafx.event.ActionEvent actionEvent) throws IOException {
        game.setGamingMode(false);

        Main m = new Main();

        m.changeScene("GamingRoom.fxml");



    }

    public void botMode(javafx.event.ActionEvent actionEvent) throws IOException {
        game.setGamingMode(true);

        Main m = new Main();

        m.changeScene("GamingRoom.fxml");

    }


}
