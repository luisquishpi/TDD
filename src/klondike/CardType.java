package klondike;

public enum CardType {
    CORAZON(0), PICA(1), DIAMENTE(2), TREBOL(3);
    private int puestoCardType;

    public int getPuestoCardType() {
        return puestoCardType;
    }

    private CardType(int puestoCardType) {
        this.puestoCardType = puestoCardType;
    }
}
