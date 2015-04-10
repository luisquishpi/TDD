package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import klondike.Board;
import klondike.Card;
import klondike.CardType;
import klondike.Foundation;
import klondike.MoveWasteToFoundationController;

import org.junit.Before;
import org.junit.Test;

public class MoveWasteToFoundationControllerTest {

    MoveWasteToFoundationController moveWasteToFoundationController;
    Board board;
    Card lastWasteCard;
    int indexPalo=0;
    @Before
    public void before() {
        board = new Board();
        board.getWaste().add(new Card(3,true,CardType.CORAZON));
        board.getWaste().add(new Card(8,true,CardType.PICA));
        board.getWaste().add(new Card(2,true,CardType.TREBOL));
        List<Card> listCard=new ArrayList<Card>();
        listCard.add(new Card(1,true,CardType.TREBOL));
        board.getFoundations().add(new Foundation(new ArrayList<Card>(listCard)));
        lastWasteCard=new Card();
        lastWasteCard = board.getWaste().get(board.getWaste().size()-1);
        
        moveWasteToFoundationController = new MoveWasteToFoundationController(board);
    }

    @Test
    public void isLastFoundationCardLowTest(){
        assertTrue(moveWasteToFoundationController.isLastFoundationCardLow(indexPalo,lastWasteCard));
    }
    @Test
    public void isLastFoundationCardEqualColorTest(){
        assertTrue(moveWasteToFoundationController.isLastFoundationCardEqualColor(indexPalo,lastWasteCard));
    }
    @Test
    public void isMovedWasteCardToFoundationTest(){
        moveWasteToFoundationController.move(indexPalo);
        assertEquals(2, board.getFoundations().get(indexPalo).getListCard().size());
    }

}
