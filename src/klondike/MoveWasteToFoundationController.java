package klondike;

public class MoveWasteToFoundationController {

    Board board;
    Card foundationCard;
    public MoveWasteToFoundationController(Board board) {
        this.board=board;
    }
    public boolean isLastFoundationCardLow(int indexPalo, Card card) {
        foundationCard=new Card();
        foundationCard=board.getFoundations().get(indexPalo).getLastCard();
        return foundationCard.isLow(indexPalo,card);
    }
    public boolean isLastFoundationCardVisible(int indexPalo) {
        return true;
    }
    public boolean isLastFoundationCardEqualColor(int indexPalo, Card card) {
        foundationCard=new Card();
        foundationCard=board.getFoundations().get(indexPalo).getLastCard();
        return foundationCard.isEqual(indexPalo,card);
    }
    public boolean isMovedWasteCardToFoundation(int indexPalo) {
        return true;
    }

}
