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

    public void setTableous(List<Tableou> tableous) {
        this.tableous = tableous;
    }
    public Board() {

    }

    public void startGame() {
        deck = new ArrayList<Card>();
        waste = new ArrayList<Card>();
        foundations = new ArrayList<Foundation>();
        tableous = new ArrayList<Tableou>();
        this.Fill52CardsInDeck();
        this.MoveFromDeckToTableouFirstTime();
    }

    private void MoveFromDeckToTableouFirstTime() {
        for (int i = 1; i <= NUMPALOSTABLEOU; i++) {
            tableous.add(new Tableou(deck.subList(deck.size() - i - 1, deck.size() - 1)));
            deck.removeAll(deck.subList(deck.size() - i - 1, deck.size() - 1));
        }
    }

    private void Fill52CardsInDeck() {
        int numero = 1;
        int iteracion = 1;
        for (int i = 0; i < 52; i++) {
            if (iteracion == 1)
                deck.add(new Card(numero, false, CardType.CORAZON));
            if (iteracion == 2)
                deck.add(new Card(numero, false, CardType.DIAMENTE));
            if (iteracion == 3)
                deck.add(new Card(numero, false, CardType.PICA));
            if (iteracion == 4)
                deck.add(new Card(numero, false, CardType.TREBOL));
            if (numero == 13) {
                numero = 1;
                iteracion++;
            } else
                numero++;
        }
        Collections.shuffle(deck);
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

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }

    public List<Card> getWaste() {
        return waste;
    }

    public void setWaste(List<Card> waste) {
        this.waste = waste;
    }

    public List<Foundation> getFoundations() {
        return foundations;
    }

    public void setFoundations(List<Foundation> foundations) {
        this.foundations = foundations;
    }

    public int getTotalCardsInTableou() {
        int total = 28;
       
        return total;
    }

    public int getTotalCardsInDeck() {
        return this.deck.size();
    }

}
