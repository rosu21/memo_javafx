package sample;

import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

class ChooseSetsTest {

    private ChooseSets chooseSets = new ChooseSets();
    private JFXPanel panel = new JFXPanel(); //creates JFX application so tests can run
    private Class<? extends javafx.event.ActionEvent> ActionEvent;

    ActionEvent event = mock(ActionEvent, "2");




    @Test
    void readSetSizeTest() {
        chooseSets.readSetSize(event);
        assertEquals(chooseSets.getSetSize(), 2);
    }

    @Test
    void readSetNumber() {
    }

    @Test
    void enterSetChoice() {
    }
}