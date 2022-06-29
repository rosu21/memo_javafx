package sample;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CardController {
    Game game = Game.getInstance();



    @FXML
    public ImageView cardImage;
    private Card card;
    private MyListener myListener;

    public Card getCard() {
        return card;
    }
    public ImageView getImg() {
        return cardImage;
    }

    public CardController (){};

    /**
     * Sets cardBackCover.jpg as back cover for all cards
     * @param card
     */
    public void setData(Card card) {
        this.card = card;
        Image cardBackCover = new Image(card.getImgBackCover());
        cardImage.setImage(cardBackCover);
    }

    /**
     * On click event on ImageView cardImage. Shoes front of cards if card.isShowFront() == true,
     * else shows back.
     * @param event
     */
    public void showCardFront(Event event) {
        if (this.card.isShowFront() == true){
            try {
                Image image = new Image(card.getImgURL());
                cardImage.setImage(image);

                this.card.setShowFront(false);

                game.setTurnNumber(game.getTurnNumber() + 1);

            } catch (Exception e) {
                System.err.println(String.format("Error: %s", e.getMessage()));
            }
        } else {
            try {
                Image cardBackCover = new Image(card.getImgBackCover());
                cardImage.setImage(cardBackCover);

                this.card.setShowFront(true);

            } catch (Exception e) {
                System.err.println(String.format("Error: %s", e.getMessage()));
            }
        }
    }


}


