package klondike;

public class MoveWasteToFoundationController {

    Board board;

    Card foundationCard;

    public MoveWasteToFoundationController(Board board) {
        this.board = board;
        foundationCard = new Card();
    }

    public boolean isLastFoundationCardLow(int indexPalo, Card card) {
        foundationCard = board.getFoundations().get(indexPalo).getLastCard();
        return foundationCard.isLow(indexPalo, card);
    }

    public boolean isLastFoundationCardVisible(int indexPalo) {
        return foundationCard.isVisible();
    }

    public boolean isLastFoundationCardEqualColor(int indexPalo, Card card) {
        foundationCard = board.getFoundations().get(indexPalo).getLastCard();
        return foundationCard.isEqual(indexPalo, card);
    }

    public void move(int indexPalo) {
        Card lastWestCard = new Card();
        lastWestCard = board.getWaste().get(board.getWaste().size() - 1);
        board.getFoundations().get(indexPalo).getListCard().add(lastWestCard);
        board.getWaste().remove(board.getWaste().size() - 1);
    }

}
