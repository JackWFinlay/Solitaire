/**
 * @author Jack Finlay - 1399273
 */
public class CardList extends SinglyLinkedList {
    SinglyLinkedList<Card> cards;
    int openedIndex;
    Card tailCard;

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
            }
        }

        return cutList;

    }

    



}
