package sample;

import javafx.event.ActionEvent;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ChooseSetsTest {

    ChooseSets chooseSets = new ChooseSets();

    ActionEvent event = mock(ActionEvent, "2");

    Game game;


    @Test
    void readSetSize() throws IOException {
        chooseSets.readSetSize(event);

    }

    @Test
    void readSetNumber() {
    }

    @Test
    void enterSetChoice() {
    }
}