package klondike;

public class StartController {

    Board board;

    public StartController(Board board) {
        this.board = board;
    }

    public boolean isEmptyWaste() {
        return board.isEmptyWaste();
    }

    public boolean isEmptyFoundation() {
        return board.isEmptyFoundation();
    }

    public int getTotalCardsInTableou() {
        return board.getTotalCardsInTableou();
    }

    public int getTotalCardsInDeck() {
        return board.getTotalCardsInDeck();
    }

    public void startGame() {
        board.Fill52CardsInDeck();
        board.MoveFromDeckToTableouFirstTime();
    }

}
