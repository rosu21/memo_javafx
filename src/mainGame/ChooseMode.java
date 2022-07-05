package mainGame;

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


    /**
     * Changes to scene ChooseSets.fxml
     * @param actionEvent
     * @throws IOException
     */
    public void goBack(javafx.event.ActionEvent actionEvent) throws IOException {
        Main m = new Main();

        m.changeScene("ChooseSets.fxml");

    }

    /**
     * Saves single player gaming mode value (false) in singleton class game. Changes to scene GamingRoom.fxml
     * @param actionEvent
     * @throws IOException
     */
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

    /**
     * Saves bot gaming mode value (true) in singleton class game. Changes to scene GamingRoom.fxml
     * @param actionEvent
     * @throws IOException
     */
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
