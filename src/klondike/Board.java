package klondike;

import java.util.List;

public class Board {
    private List<Card> deck;
    private List<Card> waste;
    public List<Card> getDeck() {
        return deck;
    }
    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }
    public List<Card> getWaste() {
        return waste;
    }
    public void setWaste(List<Card> waste) {
        this.waste = waste;
    }
}
