package klondike;


public class StartController {

    Board board;
    public StartController(){
        board=new Board();
        board.startGame();
    }
    public boolean isEmptyWaste() {
        return board.isEmptyWaste();
    }
    public int getTotalCardsInDeck() {
        return 24;
    }
    public boolean isEmptyFoundation() {
        return board.isEmptyFoundation();
    }
    public int getTotalCardsInTableou() {
        return 28;
    }

}
