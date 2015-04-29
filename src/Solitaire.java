

import java.util.Random;
import java.util.Scanner;

/**
 * @author Jack Finlay - 1399273
 */
public class Solitaire {
    private CardDeck deck;
    private CardStack[] stacks;
    private CardList[] lists;
    private Solitaire solitaire;

    public Solitaire() {
        deck = new CardDeck();
        lists = new CardList[7];
        stacks = new CardStack[4];
        Card[] cards = createCards();

        //initialise card stacks
        for (int i = 0; i < 4; i++) {
            stacks[i] = new CardStack();
        }

        Shuffle(cards);

        // Add all cards to deck
        for (Card card : cards) {
            deck.add(card);
            //System.out.println(card);
        }

        // Populate lists, pulling from the deck.
        for (int i = 0; i < 7; i++) {
            lists[i] = new CardList();
            for (int j = 0; j <= i; j++) {
                Card card = deck.takeCard();
                lists[i].initialAdd(card);
                //System.out.println(card.toString());
            }
            //System.out.println();
        }

        //System.out.println(deck.cards.size());


    }

    private void printUI() {
        System.out.println("--------------Current Setup--------------");
        System.out.println(deck);
        System.out.println("Card Stacks: " + stacks[0] + " " + stacks[1] + " " + stacks[2] + " " + stacks[3]);
        System.out.println("Card Lists:");
        for (int i = 0; i < 7; i++) {
            System.out.println((i + 1) + ": " + lists[i]);
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
        command = "";
        Scanner c = new Scanner(System.in);
        System.out.print("Enter a command: ");
        command = c.nextLine();

        String[] split = command.toLowerCase().split("\\s+");
        if (command.contains("drawcard")) {

            deck.drawCard();
        } else if (command.contains("deckto")) {

            if (Integer.parseInt(split[1]) >= 1 && Integer.parseInt(split[1]) <= 7) {
                Card deckto = deck.takeCard();
                deckto.setOpen(true);
                if (deckto != null) {
                    lists[Integer.parseInt(split[1]) - 1].add(deckto);

                }
            } else if (command.contains("restart")) {
                restart();
                printUI();

            } else if (command.contains("link")) {
                
            } else if (command.contains("send")) {

            }

        } else if (command.contains("quit")) {

            System.out.println("Thanks for playing.");
            System.exit(0);
        }
    }

    private void restart() {

    }


    private void startGame() {
        while (true) {
            printUI();
            executeCommand("");
        }
    }

}
