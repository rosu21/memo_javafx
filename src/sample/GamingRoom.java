package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;

import java.net.URL;
import java.util.ArrayList;
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
    @FXML
    private GridPane grid;
    private List<Card> cards = new ArrayList<>();
    private Image image;

    //Methods
    private List<Card> getData() {
        List<Card> cards = new ArrayList<>();
        Card card;

        card = new Card();
        card.setImgURL("img/FS-XRMBWUAAhL-s.jpg");
        card.setSetID(1);
        cards.add(card);

        card = new Card();
        card.setImgURL("img/FS-XgpfWUAMpgA6.jpg");
        card.setSetID(2);
        cards.add(card);

        card = new Card();
        card.setImgURL("img/FS-XAYwWUAM3SHE.jpg");
        card.setSetID(3);
        cards.add(card);

        return cards;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cards.addAll(getData());
        int column = 0;
        int row = 1;

        for (int i = 0; i < cards.size(); i++) {

            //Rectangle rectangle = new Rectangle(80,80, Color.BLACK);

            CardController cardController = new CardController();
            cardController.setData(cards.get(i));

            //grid.add(rectangle, column++, row);
            grid.add(cardController.getImg(), column++, row);


            //set grid width
            grid.setMinWidth(Region.USE_COMPUTED_SIZE);
            grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
            grid.setMaxWidth(Region.USE_PREF_SIZE);

            //set grid height
            grid.setMinHeight(Region.USE_COMPUTED_SIZE);
            grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
            grid.setMaxHeight(Region.USE_PREF_SIZE);

            //GridPane.setMargin(rectangle, new Insets(10));
            GridPane.setMargin(cardController.getImg(), new Insets(10));

        }
    }

    /*
    *  @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //cards.addAll(getData());
        int column = 0;
        int row = 1;

        try {
            for (int i = 0; i < cards.size(); i++) {


                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("card.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();

                CardController cardController = fxmlLoader.getController();
                cardController.setData(cards.get(i));


                grid.add(anchorPane, column++, row);



                //set grid width
                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_PREF_SIZE);

                //set grid height
                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMaxHeight(Region.USE_PREF_SIZE);

                GridPane.setMargin(anchorPane, new Insets(10));

            }

        } catch (IOException e) {
            System.err.println(String.format("Error: %s", e.getMessage()));
        }

    }
    * */

}

   /*
    @Override
    public void start(Stage stage) throws Exception {
        stage = stage;
        stage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("GamingRoom.fxml"));

        stage.setScene(new Scene(createContent()));
        stage.show();
    }
*/
    /*
    private Parent createContent() {
        VBox root = new VBox();
        root.setPrefSize(1280, 720 + 100);

        var cardTilePane = new Pane();

        Random random = new Random();

        for (int i = 1; i <=9; i ++){

            var cardTile = new Card(Integer.toString(i));

            cardTile.setTranslateX(random.nextInt(1280 / 80) * 80);
            cardTile.setTranslateY(random.nextInt(720 / 80) * 80);

            cardTilePane.getChildren().add(cardTile);

        }

        root.getChildren().add(cardTilePane);


        return root;

    }
*/





/*

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

*/
