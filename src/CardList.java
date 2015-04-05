/**
 * @author Jack Finlay - 1399273
 */

@SuppressWarnings("unchecked")
public class CardList extends SinglyLinkedList {
    private SinglyLinkedList<Card> cards;
    private int openedIndex;
    private Card tailCard;

    public SinglyLinkedList<Card> cut(int index) {
        SinglyLinkedList cutList = null;

        if (index < count) {
            cutList = new SinglyLinkedList();
            Node<Card> node = head;


            // Get node before index
            for (int j = 0; j < index - 1; j++) {
                node = node.next;
            }


            cutList.head = node.next;

            // Separate the linkedLists.
            node.next = null;

            // Set the tail card and open if possible.
            tailCard = node.value();
            if (tailCard != null) {
                tailCard.setOpen(true);
                openedIndex = cards.indexOf(tailCard);
            }
        }

        return cutList;

    }

    public void link(CardList other) {
        // Check not the same colour, and head of this list is one less than the tail of other.
        if ((other.tailCard.getColour().equals(tailCard.getColour())) &&
                (other.tailCard.getValue() - this.cards.head.value().getValue() == 1)) {

            Node<Card> node = other.head;

            // Get tail node.
            while (node.next != null) {
                node = node.next;
            }

            // Connect the tail of other to head of this CardList.
            node.next = this.cards.head;

        }

    }

    public void add(Card c) {
        // Check not the same colour, and head of this list is one less than the tail of other.
        if ((tailCard.getColour().equals(c.getColour())) &&
                (tailCard.getValue() - c.getValue() == 1)) {

            Node node = head;

            // Get tail node.
            while (node.next != null) {
                node = node.next;
            }

            // Add c as current tail's next node.
            node.next = new Node<Card>(c, null);

            tailCard = c;

        }

    }

    public Card moveTail() {
        Card card = (Card) remove(indexOf(tailCard));

        Node<Card> node = head;

        // Get the new tail node.
        while (node.next != null) {
            node = node.next;
        }

        tailCard = node.value();


        tailCard.setOpen(true);
        openedIndex = indexOf(tailCard);


        return card;
    }


}
