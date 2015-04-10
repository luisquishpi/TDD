package test;

import static org.junit.Assert.*;
import klondike.Board;
import klondike.Card;
import klondike.MoveWasteToFoundationController;

import org.junit.Before;
import org.junit.Test;

public class MoveWasteToFoundationControllerTest {

    MoveWasteToFoundationController moveWasteToFoundationController;
    Board board;
    Card card;
    int indexPalo=0;
    @Before
    public void before() {
        board = new Board();
        card = new Card();
        moveWasteToFoundationController = new MoveWasteToFoundationController(board);
    }

    @Test
    public void isLastFoundationCardHigh(){
        assertTrue(moveWasteToFoundationController.isLastFoundationCardHigh(indexPalo));
    }
    @Test
    public void isLastFoundationCardVisible(){
        assertTrue(moveWasteToFoundationController.isLastFoundationCardVisible(indexPalo));
    }
    public void isLastFoundationCardOtherColor(){
        assertTrue(moveWasteToFoundationController.isLastFoundationCardOtherColor(indexPalo));
    }
    public void isMovedWasteCardToFoundation(){
        assertTrue(moveWasteToFoundationController.isMovedWasteCardToFoundation(indexPalo));
        
    }

}
