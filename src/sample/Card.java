package sample;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Card extends StackPane{

    Card(String content) {
        var border = new Rectangle(80,80, null);
        border.setStroke(Color.BLACK);
        border.setStrokeWidth(4);
        border.setStrokeType(StrokeType.INSIDE);

        var text = new Text(content);
        text.setFont(Font.font(60));

        getChildren().addAll(border, text);


    }



}
