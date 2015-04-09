package klondike;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Card> deck;
    private List<Card> waste;
    private List<Foundation> foundations;
    

    public Board(){
       
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

    public boolean isEmptyWaste() {
        return getWaste().size()==0 || getWaste()==null;
    }
    public void startGame() {
        deck=new ArrayList<Card>();
        waste =new ArrayList<Card>();
        foundations=new ArrayList<Foundation>();
        
    }
    public boolean isEmptyFoundation() {
        return getFoundations().size()==0 || getFoundations()==null;
    }
    public List<Foundation> getFoundations() {
        return foundations;
    }
    public void setFoundations(List<Foundation> foundations) {
        this.foundations = foundations;
    }
}
