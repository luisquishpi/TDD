package klondike;

import java.util.ArrayList;
import java.util.List;

public class MoveDeckToWasteController {

    private Board board;
    List<Card> wastes;
    public MoveDeckToWasteController(){
        
    }
    public MoveDeckToWasteController(Board board) {
        this.board=board;
    }

    public boolean isMovedDeckToWaste(Card card) {
        return true;
    }
    public Board getBoard() {
        return board;
    }
    public void setBoard(Board board) {
        this.board = board;
    }
    public void move() {
        wastes=new ArrayList<Card>();
        wastes.add(new Card());
        wastes.add(new Card());
        wastes.add(new Card());
        board.setWaste(wastes);
    }
   

}
