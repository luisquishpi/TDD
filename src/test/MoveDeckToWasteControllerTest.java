package test;

import static org.junit.Assert.*;
import klondike.Card;
import klondike.MoveDeckToWasteController;

import org.junit.Before;
import org.junit.Test;

public class MoveDeckToWasteControllerTest {

    private MoveDeckToWasteController moveDeckToWasteController;
    
    @Before
    public void before() {
        moveDeckToWasteController = new MoveDeckToWasteController();
    }

    @Test
    public void isMovedDeckToWasteTest() {
        Card card = new Card();
        assertTrue(moveDeckToWasteController.isMovedDeckToWaste(card));
    }

}
