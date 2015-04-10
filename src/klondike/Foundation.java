package klondike;

import java.util.ArrayList;
import java.util.List;

public class Foundation {
    private List<Card> listCard;

    public Foundation(ArrayList<Card> listCard) {
        this.listCard=listCard;
    }

    public List<Card> getListCard() {
        return listCard;
    }

    public void setListCards(List<Card> listCard) {
        this.listCard = listCard;
    }

    public Card getLastCard() {
        return listCard.get(listCard.size()-1);
    }

}
