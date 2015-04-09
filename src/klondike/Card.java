package klondike;

public class Card {

    private int Number;
    private boolean visible=false;
    private CardType cardType;
    public Card(int number, boolean visible, CardType cardType) {
        setNumber(number);
        setVisible(visible);
        setCardType(cardType);
    }
    public int getNumber() {
        return Number;
    }
    public void setNumber(int number) {
        Number = number;
    }
    public CardType getCardType() {
        return cardType;
    }
    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
    public boolean isVisible() {
        return visible;
    }
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

}
