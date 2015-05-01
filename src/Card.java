import java.awt.*;

/**
 * @author Jack Finlay - 1399273
 * @author Warrick Wills - 13831575
 */
public class Card {

    private int cardIndex;
    private Value value;
    private Suit suit;
    private boolean open;

    public Card(int cardIndex, Value value, Suit suit) {
        this.cardIndex = cardIndex;
        this.value = value;
        this.suit = suit;
        this.open = false;
    }

    public int getCardIndex() {
        return cardIndex;
    }

    public void setCardIndex(int cardIndex) {
        this.cardIndex = cardIndex;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return this.value.getRank();
    }

    public String getColour() {
        return this.suit.getColor();
    }

    public boolean getOpen() {
        return this.open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String toString() {
        return (suit.getSuit() + value.getVal());
    }

    public void paintThis(Graphics g) {
        // TODO
    }

}

