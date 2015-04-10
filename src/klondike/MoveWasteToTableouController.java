package klondike;

public class MoveWasteToTableouController {

    private Board board;
    Card tableouCard;
    public MoveWasteToTableouController(Board board) {
        this.setBoard(board);
        tableouCard=new Card();
    }
    public Board getBoard() {
        return board;
    }
    public void setBoard(Board board) {
        this.board = board;
    }
    public boolean isLastTableouCardHighTest(int indexPalo, Card card) {
        tableouCard=board.getTableous().get(indexPalo).getLastCard();
        return tableouCard.isHigh(indexPalo,card);
    }
    public boolean isLastTableouCardVisible(int indexPalo) {
        tableouCard=board.getTableous().get(indexPalo).getLastCard();
        return tableouCard.isVisible();
    }
    public boolean isLastTableouCardOtherColor(int indexPalo, Card card) {
        tableouCard=board.getTableous().get(indexPalo).getLastCard();
        return tableouCard.isOtherColor(indexPalo,card);
    }
    public void move(int indexPalo) {
        Card lastWestCard=new Card();
        lastWestCard=board.getWaste().get(board.getWaste().size()-1);
        board.getTableous().get(indexPalo).getListCard().add(lastWestCard);
        board.getWaste().remove(board.getWaste().size()-1);
    }

}
