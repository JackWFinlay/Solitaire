/**
 * @author Jack Finlay - 1399273
 * @author Warrick Wills - 13831575
 */
public class SinglyLinkedList<E> extends AbstractList<E> {
    protected int count;

    protected Node<E> head;

    public SinglyLinkedList() {
        head = null;
        count = 0;
    }

    @Override
    public int indexOf(E o) {
        Node<E> pointer = head;
        int index = 0;

        while (pointer != null && (pointer.value() != o)) {
            pointer = pointer.next();
            index++;
        }

        if (pointer != null) {
            return index;
        } else {
            return -1;
        }

    }

    @Override
    public E get(int i) {
        E value = null;
        if (i <= count) {
            Node<E> current = head;

            for (int j = 0; j < i; j++) {
                current = current.next;
            }

            value = (E) current.value();
        }

        return value;
    }

    @Override
    public void add(int i, E o) {
        if (i < 0 || i > count) {
            return;
        }

        if (head == null) { // Add first

            head = new Node<E>(o, null);

        } else if (i == count) { // Add last
            Node<E> current = head;

            while (current.next != null) {
                current = current.next();
            }

            current.setNext(new Node<E>(o, null));
        } else {
            Node<E> current = head;

            for (int j = 0; j < i; j++) {
                current = current.next;
            }

            if (current == null) {
                current = new Node<E>(o, null);
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

            Node<E> current = head;
            for (int j = 0; j < (i - 1); j++) {
                // Node before the one you want to remove.
                current = current.next;
            }

            element = (E) current.next.value();
            current.next = current.next.next;
            count--;
        }

        return element;
    }

    public void set(int i, E o) {
        int count = 0;
        Node<E> current = head;

        for (int j = 0; j < i; j++) {
            current = current.next;
        }

        if (current == null) {
            current = new Node<E>(o, null);
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
        head.setNext(null);
    }
}