/**
 * @author Jack Finlay - 1399273
 * @author Warrick Wills - 13831575
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

        currentCard = cards.get(cards.indexOf(currentCard) - 1);
        Card card = cards.get(cards.indexOf(currentCard) - 1);


        if (card == cards.tail.value()) {
            card = null;
        }

        if (card != null) {
            card.setOpen(true);
        }

        return card;
    }

    public Card takeCard() {
        Card card = cards.remove(currentCard);
        currentCard = cards.get(cards.size() - 1);
        drawCard();

        return card;

    }

    public void add(Card card) {
        cards.add(cards.size(), card);
        currentCard = card;
    }

    @Override
    public String toString() {
        String theString;

        if (cards.size() > 0) {
            theString = "Card Deck: Not Empty   Open Card: " + currentCard;
        } else {
            theString = "Card Deck: Empty";
        }
        return theString;
    }
}


