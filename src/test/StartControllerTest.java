package test;

import static org.junit.Assert.*;
import klondike.Board;
import klondike.StartController;

import org.junit.Before;
import org.junit.Test;

public class StartControllerTest {

    StartController startController;

    Board board;

    @Before
    public void beforeTest() {
        board = new Board();
        startController = new StartController(board);
        startController.startGame();
    }

    @Test
    public void isEmptyWasteTest() {
        assertTrue(startController.isEmptyWaste());
    }

    @Test
    public void isEmptyFoundationTest() {
        assertTrue(startController.isEmptyFoundation());
    }

    @Test
    public void is28CardsInTableouTest() {
        assertEquals(28, startController.getTotalCardsInTableou());
    }

    @Test
    public void is24CardsInDeckTest() {
        assertEquals(24, startController.getTotalCardsInDeck());
    }

}
