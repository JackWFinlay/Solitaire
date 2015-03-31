/**
 * @author Jack Finlay - 1399273
 */
public class CircularlyLinkedList<E> extends SinglyLinkedList<E> {

    private Node<E> tail;

    public CircularlyLinkedList() {
        super();
    }

    @Override
    public void add(int i, E o) {
        if (i < 0 || i > count) {
            return;
        }

        Node<E> current = head;

        while (count < i) {
            if (current.next == null) {
                current.next = new Node<E>(null, null);
                current = current.next;
            } else {
                current = current.next;
            }
        }

        if (current == null) {
            current = new Node<E>(o, head);
        } else {
            current.next = current;
            current = new Node<E>(o, current.next);
        }

        count++;

    }

}
