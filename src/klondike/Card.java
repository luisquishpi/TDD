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

    public Card() {
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

    public boolean isLow(int indexPalo, Card card) {
        return this.getNumber() == card.getNumber() - 1;
    }

    public boolean isEqual(int indexPalo, Card card) {
        return this.cardType == card.cardType;
    }

    public boolean isHigh(int indexPalo, Card card) {
        return this.getNumber() - 1 == card.getNumber();
    }

    public boolean isOtherColor(int indexPalo, Card card) {
        return this.cardType != card.cardType;
    }

    @Override
    public String toString() {
        return "Card[" + this.number + "," + this.visible + "," + this.cardType + "]";
    }
}
