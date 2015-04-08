package test;

import static org.junit.Assert.*;

import java.util.List;

import klondike.Board;
import klondike.Card;
import klondike.MoveDeckToWasteController;

import org.junit.Before;
import org.junit.Test;

public class MoveDeckToWasteControllerTest {

    private MoveDeckToWasteController moveDeckToWasteController;

    Board board;

    @Before
    public void before() {
        board = new Board();
        List<Card> cards = null;
        board.setDeck(cards);
        moveDeckToWasteController = new MoveDeckToWasteController(board);
    }

    @Test
    public void isMovedDeckToWasteTest() {
        Card card = new Card();
        assertTrue(moveDeckToWasteController.isMovedDeckToWaste(card));
    }

    @Test
    public void moveFullDeckToEmptyWasteTest() {
        moveDeckToWasteController.move();
        assertEquals(3, moveDeckToWasteController.getBoard().getWaste().size());
    }

    @Test
    public void moveWhen1DeckToEmptyWasteTest() {
        moveDeckToWasteController.move();
        assertEquals(1, moveDeckToWasteController.getBoard().getWaste().size());
    }

}
