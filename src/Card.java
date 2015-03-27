/**
 * @author Jack Finlay - 1399273
 */
public class Card {

    private int cardIndex;
    private Value value;
    private Suit suit;

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return this.value.getRank();
    }

    public String getColour() {
        return this.suit.getColor();
    }


}

