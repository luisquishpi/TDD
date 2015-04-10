package klondike;

public class MoveWasteToFoundationController {

    Board board;
    public MoveWasteToFoundationController(Board board) {
        this.board=board;
    }
    public boolean isLastFoundationCardLow(int indexPalo, Card card) {
        Card foundationCard=new Card();
        foundationCard=board.getFoundations().get(indexPalo).getLastCard();
        return foundationCard.isLow(indexPalo,card);
    }
    public boolean isLastFoundationCardVisible(int indexPalo) {
        return true;
    }
    public boolean isLastFoundationCardEqualColor(int indexPalo) {
        return true;
    }
    public boolean isMovedWasteCardToFoundation(int indexPalo) {
        return true;
    }

}
