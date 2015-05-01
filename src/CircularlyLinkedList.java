/**
 * @author Jack Finlay - 1399273
 * @author Warrick Wills - 13831575
 */
public class CircularlyLinkedList<E> extends AbstractList<E> {
    int count;
    protected CircularNode<E> tail;

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

            CircularNode<E> current = tail.next;
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

        if (i == 0) {
            return (E) tail.value();
        } else {
            CircularNode<E> current = tail.next;


            for (int j = 1; j < i; j++) {
                current = current.next();
            }
            return (E) current.value();
        }
    }

    public CircularNode<E> getNode(int i) {
        if (i < 0 || i >= count) {
            return null;
        }
        CircularNode<E> pointer = tail.next();
        if (i == 0) {
            return pointer;
        }
        for (int j = 0; j < i; j++) {
            pointer = pointer.next();
        }
        return pointer;
    }

    @Override
    public void add(int i, E o) {
        if (i < 0 || i > count) {
            return;
        }

        if (count == 0) {
            CircularNode<E> firstNode = new CircularNode<E>(o, null, null);
            tail = firstNode;
        } else {

            if (i == 0) {
                CircularNode<E> nodeToAdd = new CircularNode<E>(o, null, tail.next().next());
                tail.next().setNext(nodeToAdd);
            } else if (count == 1) {

                CircularNode<E> node = new CircularNode<E>(o, tail, tail);
                tail.setNext(node);
                tail.setPrevious(node);
            } else {
                CircularNode<E> previousNode = getNode(i - 1);
                CircularNode<E> nodeToAdd = new CircularNode<E>(o, previousNode, previousNode.next());
                previousNode.next().setPrevious(nodeToAdd);
                previousNode.setNext(nodeToAdd);
            }
        }
        count++;

    }

    @Override
    public E remove(int i) {
        if (i < 0 || i >= count) {
            return null;
        }
        E element;
        if (i == 0) { // Remove first
            element = tail.next().value();
            tail.setNext(getNode(i + 1));
            tail.next().setPrevious(null);
        } else if (count - 1 == i) { // Remove last
            CircularNode<E> current = tail;
            element = (E) current.value();
            current.previous().setNext(current.next());
            current.next().setPrevious(current.previous());
            tail = current.previous();
        } else {
            CircularNode<E> current = getNode(i);
            element = (E) current.value();
            current.previous().setNext(current.next());
            current.next().setPrevious(current.previous());
        }
        count--;
        return element;
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
