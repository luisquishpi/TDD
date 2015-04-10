package klondike;

public class MoveWasteToTableouController {

    private Board board;
    Card tableouCard;
    public MoveWasteToTableouController(Board board) {
        this.setBoard(board);
    }
    public Board getBoard() {
        return board;
    }
    public void setBoard(Board board) {
        this.board = board;
    }
    public boolean isLastTableouCardHighTest(int indexPalo, Card card) {
        tableouCard=new Card();
        tableouCard=board.getTableous().get(indexPalo).getLastCard();
        return tableouCard.isHigh(indexPalo,card);
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
