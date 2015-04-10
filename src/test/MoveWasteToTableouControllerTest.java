package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import klondike.Board;
import klondike.Card;
import klondike.CardType;
import klondike.MoveWasteToTableouController;
import klondike.Tableou;

import org.junit.Before;
import org.junit.Test;

public class MoveWasteToTableouControllerTest {
    MoveWasteToTableouController moveWasteToTableouController;

    Board board;

    Card lastWasteCard;

    int indexPalo = 0;

    List<Card> listCard;

    @Before
    public void before() {
        board = new Board();
        board.getWaste().add(new Card(3, true, CardType.CORAZON));
        board.getWaste().add(new Card(8, true, CardType.PICA));
        board.getWaste().add(new Card(9, true, CardType.CORAZON));
        listCard = new ArrayList<Card>();
        listCard.add(new Card(10, true, CardType.TREBOL));
        board.getTableous().add(new Tableou(new ArrayList<Card>(listCard)));
        lastWasteCard = new Card();
        lastWasteCard = board.getWaste().get(board.getWaste().size() - 1);
        moveWasteToTableouController = new MoveWasteToTableouController(board);
    }

    @Test
    public void isLastTableouCardHighTest() {
        assertTrue(moveWasteToTableouController.isLastTableouCardHighTest(indexPalo, lastWasteCard));
    }

    @Test
    public void isLastTableouCardVisibleTest() {
        assertTrue(moveWasteToTableouController.isLastTableouCardVisible(indexPalo));
    }

    @Test
    public void isLastTableouCardOtherColorTest() {
        assertTrue(moveWasteToTableouController.isLastTableouCardOtherColor(indexPalo,
                lastWasteCard));
    }

    @Test
    public void isMovedWasteCardToTableouTest() {
        moveWasteToTableouController.move(indexPalo);
        assertEquals(2, board.getTableous().get(indexPalo).getListCard().size());
        assertEquals(2, board.getWaste().size());
    }

}
