/**
 * @author Jack Finlay - 1399273
 */
public class CardDeck {
    public CircularlyLinkedList<Card> cards;
    public Card currentCard;

    public CardDeck() {
        cards = new CircularlyLinkedList<Card>();
        currentCard = null;
    }

    public Card drawCard() {
        if (currentCard != null) {
            currentCard.setOpen(false);
        }

        currentCard = cards.get(cards.indexOf(currentCard));
        Card card = cards.get(cards.indexOf(currentCard));


        if (card == cards.tail.value()) {
            card = null;
        }

        if (card != null) {
            card.setOpen(true);
        }

        return card;
    }

    public Card takeCard() {
        Card card = cards.remove(cards.size() - 1);
        //currentCard = cards.get(cards.size()-1);
        //drawCard();

        return card;

    }

    public void add(Card card) {
        cards.add(cards.size(), card);
        currentCard = card;
    }
}


