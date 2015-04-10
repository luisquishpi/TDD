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
    int indexPalo=0;
    @Before
    public void before() {
        board = new Board();
        moveWasteToFoundationController = new MoveWasteToFoundationController(board);
    }

    @Test
    public void isLastFoundationCardLow(){
        board.getWaste().add(new Card(3,true,CardType.CORAZON));
        board.getWaste().add(new Card(8,true,CardType.PICA));
        board.getWaste().add(new Card(11,true,CardType.TREBOL));
        List<Card> listCard=new ArrayList<Card>();
        listCard.add(new Card(9,true,CardType.TREBOL));
        board.getFoundations().add(new Foundation(new ArrayList<Card>(listCard)));
        Card lastWasteCard=new Card();
        lastWasteCard = board.getWaste().get(board.getWaste().size()-1);
        
        assertTrue(moveWasteToFoundationController.isLastFoundationCardLow(0,lastWasteCard));
    }
   
    public void isLastFoundationCardEqualColor(){
        assertTrue(moveWasteToFoundationController.isLastFoundationCardEqualColor(indexPalo));
    }
    public void isMovedWasteCardToFoundation(){
        assertTrue(moveWasteToFoundationController.isMovedWasteCardToFoundation(indexPalo));
        
    }

}
