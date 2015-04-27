/**
 * @author Jack Finlay - 1399273
 */
public class CardStack {
    protected Stack<Card> stack;

    public CardStack() {
        this.stack = new Stack<Card>();
    }

    public void add(Card c) {
        if ((c.getValue() - stack.peek().getValue() == 1) && c.getSuit() == stack.peek().getSuit()) {
            stack.push(c);
        }
    }

    @Override
    public String toString() {
        if (stack.size() == 0) {
            return "Empty";
        } else {
            return stack.peek().toString();
        }
    }
}
