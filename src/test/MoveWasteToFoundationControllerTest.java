package test;

import static org.junit.Assert.*;
import klondike.Board;
import klondike.Card;
import klondike.MoveWasteToFoundationController;
import klondike.StartController;

import org.junit.Before;
import org.junit.Test;

public class MoveWasteToFoundationControllerTest {

    MoveWasteToFoundationController moveWasteToFoundationController;

    private StartController startController;

    Board board;

    Card card;

    @Before
    public void before() {
        board = new Board();
        card = new Card();
        startController = new StartController(board);
        startController.startGame();
        moveWasteToFoundationController = new MoveWasteToFoundationController(board);
    }

    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
