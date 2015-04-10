package klondike;

public class MoveWasteToFoundationController {

    Board board;
    public MoveWasteToFoundationController(Board board) {
        this.board=board;
    }
    public boolean isLastFoundationCardHigh(int i) {
        return true;
    }
    public boolean isLastFoundationCardVisible(int indexPalo) {
        return true;
    }
    public boolean isLastFoundationCardOtherColor(int indexPalo) {
        return true;
    }
    public boolean isMovedWasteCardToFoundation(int indexPalo) {
        return true;
    }

}
