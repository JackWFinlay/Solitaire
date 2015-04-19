import java.util.Random;

/**
 * @author Jack Finlay - 1399273
 */
public class Solitaire {
    private CardDeck deck;
    private CardStack[] stacks;
    private CardList[] lists;

    public Solitaire() {
        deck = new CardDeck();
        Card[] cards = createCards();

        Shuffle(cards);

        for (Card card : cards) {

            // System.out.println(card.toString());
        }


        for (int i = 0; i < 24; i++) {
            deck.add(cards[i]);
        }

        for (int i = 0; i < 24; i++) {
            System.out.println(deck.currentCard.toString());
        }

    }

    private Card[] createCards() {
        Card[] cards = new Card[52];

        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++, index++) {
                cards[index] = (new Card(index, Value.values()[j], Suit.values()[i]));
            }
        }

        return cards;
    }

    private void Shuffle(Card[] cards) {
        Random random = new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            Card temp = cards[index];
            cards[index] = cards[i];
            cards[i] = temp;
        }

    }


    public static void main(String[] args) {
        Solitaire solitaire = new Solitaire();
        showGUI(solitaire);
        solitaire.startGame();
    }

    private static void showGUI(Solitaire game) {

    }

    private void executeCommand(String command) {

    }

    private void startGame() {

    }

}
