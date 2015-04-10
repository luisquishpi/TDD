package test;

import static org.junit.Assert.*;
import klondike.Board;
import klondike.Card;
import klondike.MoveDeckToWasteController;
import klondike.StartController;

import org.junit.Before;
import org.junit.Test;

public class MoveDeckToWasteControllerTest {

    private MoveDeckToWasteController moveDeckToWasteController;

    private StartController startController;

    Board board;

    Card card;

    @Before
    public void before() {
        board = new Board();
        card = new Card();
        startController = new StartController(board);
        startController.startGame();
        moveDeckToWasteController = new MoveDeckToWasteController(board);
    }

    @Test
    public void isMovedCardFromDeckToWasteTest() {
        card = board.getDeck().get(board.getDeck().size() - 1);
        moveDeckToWasteController.move(card);
        assertTrue(moveDeckToWasteController.isMovedDeckToWaste(card));
    }

    @Test
    public void moveCardsFromDeckToEmptyWasteTest() {
        // debe mover 3 de una
        moveDeckToWasteController.move();
        assertEquals(3, moveDeckToWasteController.getBoard().getWaste().size());
    }

    @Test
    public void moveCardFromDeckToNoEmptyWasteTest() {
        // debe mover 1 en 1 hasta máximo 3
        card = board.getDeck().get(board.getDeck().size() - 1);
        moveDeckToWasteController.move(card);
        moveDeckToWasteController.move();
        assertEquals(2, moveDeckToWasteController.getBoard().getWaste().size());
    }

}
