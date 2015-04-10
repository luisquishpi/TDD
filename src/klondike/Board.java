package klondike;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Board {
    private final int NUMPALOSTABLEOU = 7;

    private List<Card> deck;

    private List<Card> waste;

    private List<Foundation> foundations;

    private List<Tableou> tableous;

    public List<Tableou> getTableous() {
        return tableous;
    }
    
    public Board() {
        deck = new ArrayList<Card>();
        waste = new ArrayList<Card>();
        foundations = new ArrayList<Foundation>();
        tableous = new ArrayList<Tableou>();
    }

    public void MoveFromDeckToTableouFirstTime() {
        for (int i = 1; i <= NUMPALOSTABLEOU; i++) {
            List<Card> subLista=deck.subList(deck.size() - i - 1, deck.size() - 1);
            tableous.add(new Tableou(new ArrayList<Card>(subLista)));
            tableous.get(i-1).getListCard().get(tableous.get(i-1).getListCard().size()-1).setVisible(true);
            deck.removeAll(subLista);
        }
    }
    public void Fill52CardsInDeck() {
        for (CardType cardType: CardType.values()) {
            for (int i = 1; i <= 13; i++) {
                deck.add(new Card(i, false, cardType));
            }
        }
        Collections.shuffle(deck);
    }
    public int getTotalCardsInTableou() {
        int total = 0;
        for (int i = 0; i < NUMPALOSTABLEOU; i++) {
            total+=tableous.get(i).getListCard().size();
        }
        return total;
    }

    public int getTotalCardsInDeck() {
        return this.deck.size();
    }

    public boolean isEmptyWaste() {
        return getWaste().size() == 0 || getWaste() == null;
    }

    public boolean isEmptyFoundation() {
        return getFoundations().size() == 0 || getFoundations() == null;
    }

    public List<Card> getDeck() {
        return deck;
    }

    public List<Card> getWaste() {
        return waste;
    }

    public List<Foundation> getFoundations() {
        return foundations;
    }

}
