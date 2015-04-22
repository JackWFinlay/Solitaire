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
        lists = new CardList[7];
        Card[] cards = createCards();


        Shuffle(cards);

        for (Card card : cards) {
            deck.add(card);
            System.out.println(deck.currentCard.toString());
        }

        System.out.println();

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                Card card = deck.takeCard();
                lists[i].add(card);
                System.out.println(card.toString());
            }
            System.out.println();
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
