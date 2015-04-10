package klondike;

import java.util.List;

public class Palos {
    private List<Card> listCard;

    public Palos(List<Card> listCard){
        setListCard(listCard);
    }
    public List<Card> getListCard() {
        return listCard;
    }

    public void setListCard(List<Card> listCard) {
        this.listCard = listCard;
    }

    public Card getLastCard() {
        return listCard.get(listCard.size()-1);
    }
}
