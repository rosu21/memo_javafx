package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class GamingRoom extends Application {

    private static Stage stage;
    private static GamingRoom gamingRoom;



    @Override
    public void start(Stage stage) throws Exception {
        stage = stage;
        stage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("GamingRoom.fxml"));

        stage.setScene(new Scene(createContent()));
        stage.show();
    }

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

}
