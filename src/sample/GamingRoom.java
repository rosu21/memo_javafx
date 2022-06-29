package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

public class GamingRoom implements Initializable { // extends Application

    //Attributes from singleton class Game
    Game game = Game.getInstance();
    private final int setNumber = game.getSetNumber();
    private final int setSize = game.getSetSize();
    private final boolean gamingMode = game.getGamingMode();
    private final int numberCards = setNumber * setSize;

    //Other attributes
    private String imgURL = new String("img/FS-XRMBWUAAhL-s.jpg");
    //private Image image = new Image("img/FS-XRMBWUAAhL-s.jpg");



    @FXML
    private GridPane grid;

    @FXML
    private MyListener myListener;

    @FXML
    private ImageView cardImg;

    @FXML
    private Label labelZug;

    @FXML
    private Button buttonBack;

    private List<Card> cards = new ArrayList<>();
    private Image image;



    //Methods

    /**
     * Generates the entire deck of cards.
     * @return cards
     */
    private List<Card> getData() {
        List<Card> cards = new ArrayList<>();
        Card card;

        card = new Card();
        card.setImgURL("img/FS-XAYwWUAM3SHE.jpg");
        card.setSetID(1);
        cards.add(card);

        card = new Card();
        card.setImgURL("img/FS-XgpfWUAMpgA6.jpg");
        card.setSetID(2);
        cards.add(card);

        card = new Card();
        card.setImgURL("img/FS-XKkTXEAI7g_C.jpg");
        card.setSetID(3);
        cards.add(card);

        card = new Card();
        card.setImgURL("img/FS-XRMBWUAAhL-s.jpg");
        card.setSetID(4);
        cards.add(card);

        card = new Card();
        card.setImgURL("img/FS-XuelWQAAfmtg.jpg");
        card.setSetID(5);
        cards.add(card);

        card = new Card();
        card.setImgURL("img/FS-YHtNWAAAdIOQ.jpg");
        card.setSetID(6);
        cards.add(card);

        card = new Card();
        card.setImgURL("img/FS-YmapWQAA4ezj.jpg");
        card.setSetID(7);
        cards.add(card);

        card = new Card();
        card.setImgURL("img/FS-YmbYWYAMhu_D.jpg");
        card.setSetID(8);
        cards.add(card);

        card = new Card();
        card.setImgURL("img/FS-YvSNWYAAfb-6.jpg");
        card.setSetID(9);
        cards.add(card);

        return cards;
    }


    /**
     * Generates the playing deck based on setNumber and setSize. Cards are returned in random
     * order.
     * @return playingDeck;
     */
    public List<Card> getCards() {
        List<Card> completeDeck = new ArrayList<>();
        completeDeck.addAll(getData());
        Collections.shuffle(completeDeck);

        List<Card> playingDeck = new ArrayList<>();

        for (int i = 0; i < setNumber; i++){

            playingDeck.add(completeDeck.get(i));

            for (int j = 1; j < setSize; j++){
                playingDeck.add(completeDeck.get(i));
            }
        }
        Collections.shuffle(playingDeck);
        return playingDeck;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cards.addAll(getCards());
        changeLabelZug();

        int column = 0;
        int row = 1;
        try {
            for (int i = 0; i < cards.size(); i++) {

                //Rectangle rectangle = new Rectangle(80,80, Color.BLACK);

                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("Card.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();

                CardController cardController = fxmlLoader.getController();
                cardController.setData(cards.get(i));

                if (column == 6) {
                    column = 0;
                    row++;
                }

                grid.add(anchorPane, column, row); //(child,column,row)
                column++;
                // set grid width
                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_PREF_SIZE);
                //set grid height
                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMaxHeight(Region.USE_PREF_SIZE);

                grid.setHgap(10);
                grid.setVgap(10);

                //GridPane.setMargin(rectangle, new Insets(10));
                //GridPane.setMargin(cardController.getImg(), new Insets(0, 0 ,0, 0));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void changeLabelZug(){
        labelZug.setText(String.format("Zug: %s",game.getTurnNumber()));
    }


    public void goBack(javafx.event.ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("ChooseMode.fxml");

    }

}






/*



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

*/
