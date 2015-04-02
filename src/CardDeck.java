/**
 * @author Jack Finlay - 1399273
 */
public class CardDeck extends CircularlyLinkedList {
    public CircularlyLinkedList<Card> cards;
    public Card currentCard;

    public Card drawCard() {
        Card card = cards.get(cards.indexOf(currentCard) + 1);

        if (card == cards.tail.value()) {
            card = null;
        }

        return card;
    }

    public Card takeCard() {
        return cards.remove(currentCard);
    }
}
