package klondike;

import java.util.List;

public class MoveDeckToWasteController {

    private Board board;

    List<Card> waste;

    List<Card> deck;

    public MoveDeckToWasteController(Board board) {
        setBoard(board);
        waste = board.getWaste();
        deck = board.getDeck();
    }
    public void move() {
        if (waste.isEmpty()) {
            for (int i = 1; i <= 3; i++) {
                move(deck.get(deck.size() - i));
            }
        } else {
            move(deck.get(deck.size() - 1));
        }
    }

    public void move(Card card) {
        waste.add(card);
        deck.remove(card);
        waste.get(waste.size() - 1).setVisible(true);
        if (waste.size() > 3) {
            deck.add(0, waste.get(0));
            deck.get(0).setVisible(false);
            waste.remove(0);
        }
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

    

}
