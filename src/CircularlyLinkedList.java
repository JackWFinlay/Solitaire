/**
 * @author Jack Finlay - 1399273
 */
public class CircularlyLinkedList<E> extends SinglyLinkedList<E> {

    protected SinglyLinkedList<E> data;
    protected Node<E> tail;

    public CircularlyLinkedList() {
        data = new SinglyLinkedList<E>();
        tail = null;
    }

    @Override
    public void add(int i, E o) {
        if (i < 0 || i > count) {
            return;
        }

        Node<E> current = head;

        for (int j = 0; j < i; j++) {
            current = current.next;
        }

        if (current == null) {
            current = new Node<E>(o, head);
            tail = current;
        } else {
            current.next = current;
            current = new Node<E>(o, current.next);
        }

        count++;

    }

    @Override
    public E remove(int i) {
        E element = null;

        if (i < count) {

            Node<E> current = head;
            for (int j = 0; j < (i - 1); j++) {
                // Node before the one you want to remove.
                current = current.next;
            }

            element = (E) current.next.value();
            current.next = current.next.next;

            if (element == tail.value()) {
                tail = current;
            }

            count--;
        }

        return element;
    }

    @Override
    public void set(int i, E o) {
        Node<E> current = head;

        for (int j = 0; j < i; j++) {
            current = current.next;
        }

        if (current == null) {
            current = new Node<E>(o, tail.next);
            tail = current;
        } else {
            current = new Node<E>(o, current.next);
        }
    }
}
