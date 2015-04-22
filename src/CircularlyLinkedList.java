/**
 * @author Jack Finlay - 1399273
 */
public class CircularlyLinkedList<E> extends AbstractList<E> {
    int count;
    protected Node<E> tail;

    public CircularlyLinkedList() {
        tail = null;
        count = 0;
    }

    @Override
    public int indexOf(E value) {
        int index = 0;

        if (tail == null) {

            return -1;
        } else {

            Node<E> current = tail.next;
            while (current != null && !current.value().equals(value)) {
                current = current.next();
                index++;
            }
            if (current != null) {
                return index--;
            } else {
                return -1;
            }
        }
    }

    @Override
    public E get(int i) {
        return null;
    }

    @Override
    public void add(int i, E o) {
        if (i < 0 || i > count) {
            return;
        }


        if (tail == null) {
            tail = new Node<E>(o, null);
        } else {

            Node<E> current = tail.next;

            for (int j = 0; j < i; j++) {
                current = current.next;
            }

            if (current == null) {
                current = new Node<E>(o, tail.next);
                tail = current;
            } else {
                current.next = current;
                current = new Node<E>(o, current.next);
            }
        }
        count++;

    }

    @Override
    public E remove(int i) {
        E element = null;

        if (i < count) {

            Node<E> current = tail.next;
            for (int j = 0; j < (i - 1); j++) {
                // Node before the one you want to remove.
                current = current.next;
            }

            element = (E) current.next.value();

            if (element == tail.next.value()) {
                tail.next = current.next.next;
            }

            current.next = current.next.next;

            count--;
        }

        return element;
    }

    @Override
    public void set(int i, E o) {
        Node<E> current = tail.next;

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

    @Override
    public int size() {
        return count;
    }

    @Override
    public void clear() {
        tail = null;
    }
}
