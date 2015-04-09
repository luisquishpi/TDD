package klondike;

public class Card {

    private int number;

    private boolean visible = false;

    private CardType cardType;

    public Card(int number, boolean visible, CardType cardType) {
        setNumber(number);
        setVisible(visible);
        setCardType(cardType);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    @Override
    public String toString() {
        return "Card[" + this.number + "," + this.visible + "," + this.cardType + "]";
    }

}
