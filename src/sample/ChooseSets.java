package sample;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ChooseSets implements Initializable {
    // Attributes
    //---------------------------------------------------------------------------
    private int setSize = 0;
    private int setNumber = 0;



    // Constructor, getter and setter
    //---------------------------------------------------------------------------
    public ChooseSets() { }

    public int getSetSize() {
        return setSize;
    }

    //FXML
    //---------------------------------------------------------------------------
    // controller of ChooseSets.fxml


    @FXML
    private javafx.scene.control.Label promptSetSize;

    @FXML
    private Label promptSetNumber;


    @FXML
    private ChoiceBox boxSetSize;

    @FXML
    private ChoiceBox boxSetNumber;

    @FXML
    private Button submitSetChoice;

    //Available choices for ChoiceBoxes
    private String[] setSizeChoice = {"2","3","4"};
    private String[] setNumberChoice = {"3","6","9"};

    /**
     * Initializes ChoiceBoxes
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        boxSetSize.getItems().addAll(setSizeChoice);
        boxSetNumber.getItems().addAll(setNumberChoice);

        boxSetSize.setOnAction(this::readSetSize);
        boxSetNumber.setOnAction(this::readSetNumber);

    }


    // Methods
    //---------------------------------------------------------------------------

    /**
     * Reads set size from boxSetNumber. Saves value in this.setSize.
     *
     * @param event Userinput on ChoiceBox boxSetSize
     */
    public void readSetSize(Event event) {

        String setSize = (String) boxSetSize.getValue();
        this.setSize = Integer.valueOf(setSize);


    }

    /**
     * Reads set number from boxSetNumber. Saves value in this.setNumber.
     * @param event Userinput on ChoiceBox boxSetNumber
     */
    public void readSetNumber(Event event) {

        String setNumber = (String) boxSetNumber.getValue();
        this.setNumber = Integer.valueOf(setNumber);

    }

    /**
     * Passes this.setSize and this.setNumber to singleton class game. Changes scene to
     * ChooseMode.fxml
     * @throws IOException
     */
    public void enterSetChoice() throws IOException{


        if (this.setSize != 0 && this.setNumber != 0) {

            try{

                Game game = Game.getInstance();
                game.setSetSize(this.setSize);
                game.setSetNumber(this.setNumber);

                Main m = new Main();
                m.changeScene("ChooseMode.fxml");
                //nextWindow("ChooseMode.fxml");


            } catch (IOException e) {
                System.err.println(String.format("Error: %s", e.getMessage()));
            }



        }


    }
/*
    public void nextWindow(String fxml) throws IOException{

        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        Stage stg = (Stage) pane.getScene().getWindow();
        stg.getScene().setRoot(pane);

    }
*/
    /*
    *     public void enterSetChoice() throws IOException{
        if (game.getSetNumber() != 0 && game.getSetSize() != 0) {
        Main m = new Main();
        m.changeScene("ChooseMode.fxml");
        }
    }
*/










}
