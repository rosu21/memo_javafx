package sample;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CardController {

    @FXML
    private ImageView img;
    private Card card;

    public Card getCard() {
        return card;
    }
    public ImageView getImg() {
        return img;
    }


    public CardController (){};

    public void setData(Card card) {
        this.card = card;

        Image image = new Image(card.getImgURL());
        img.setImage(image);
    }


}


