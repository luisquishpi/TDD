package klondike;

public class MoveWasteToTableouController {

    private Board board;
    public MoveWasteToTableouController(Board board) {
        this.setBoard(board);
    }
    public Board getBoard() {
        return board;
    }
    public void setBoard(Board board) {
        this.board = board;
    }
    public boolean isLastTableouCardHighTest(int indexPalo, Card lastWasteCard) {
        return true;
    }
    public boolean isLastTableouCardVisible() {
        return true;
    }
    public boolean isLastTableouCardOtherColor(int indexPalo, Card lastWasteCard) {
        return true;
    }
    public void move(int indexPalo) {
        
    }

}
