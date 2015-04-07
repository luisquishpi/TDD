package klondike;

public class MoveDeckToWasteController {

    private Board board;
    public MoveDeckToWasteController(){
        
    }
    public MoveDeckToWasteController(Board board) {
        this.board=board;
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
    public void move() {
        
    }
   

}
