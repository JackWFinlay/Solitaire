/**
 * @author Jack Finlay - 1399273
 */
public class CardStack {
    protected Stack<Card> stack;

    public void add(Card c) {
        if ((c.getValue() - stack.peek().getValue() == 1) && c.getSuit() == stack.peek().getSuit()) {
            stack.push(c);
        }
    }
}
