/**
 * @author Jack Finlay - 1399273
 * @author Warrick Wills - 13831575
 */
public enum Suit {

    CLUBS("Club", "black"), SPADES("Spade", "black"), DIAMONDS("Diamond", "red"), HEARTS("Heart", "red");

    private String suit;
    private String color;

    private Suit(String suit, String color) {
        this.suit = suit;
        this.color = color;
    }

    public String getSuit() {
        return suit;
    }

    public String getColor() {
        return color;
    }
}
