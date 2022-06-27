package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class ChooseMode {
    // Attributes
    //---------------------------------------------------------------------------


    //Constructor, getter, setter
    //---------------------------------------------------------------------------
    public ChooseMode(){    }


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

        try{
            Game game = Game.getInstance();

            game.setGamingMode(false);

            Main m = new Main();
            m.changeScene("GamingRoom.fxml");


        } catch (IOException e) {
            System.err.println(String.format("Error: %s", e.getMessage()));
        }
    }

    public void botMode(javafx.event.ActionEvent actionEvent) throws IOException {

        try{
            Game game = Game.getInstance();

            game.setGamingMode(true);

            Main m = new Main();
            m.changeScene("GamingRoom.fxml");


        } catch (IOException e) {
            System.err.println(String.format("Error: %s", e.getMessage()));
        }

    }


}
