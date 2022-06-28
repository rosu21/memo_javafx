package sample;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class CardController {

    @FXML
    private ImageView imageView;

    private Card card;


    public void setData(Card card) {
        this.card = card;

        Image image = new Image(
            Objects.requireNonNull(getClass().getResourceAsStream(card.getImgURL())));
        imageView.setImage(image);
    }

    public ImageView getImageView(){
        return imageView;
    }
}
