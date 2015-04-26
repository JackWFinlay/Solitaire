/**
 * @author Jack Finlay - 1399273
 */
public class Node<E> {
    protected E data;
    protected Node<E> next;
    protected Node<E> previous;

    public Node(E data, Node<E> previous, Node<E> next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }

    public Node<E> next() {

        return next;
    }

    public void setNext(Node<E> next) {

        this.next = next;
    }

    public Node<E> previous() {

        return next;
    }

    public void setPrevious(Node<E> next) {

        this.next = next;
    }

    public E value() {

        return data;
    }

    public void setValue(E value) {
        data = value;

    }
}
