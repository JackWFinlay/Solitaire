/**
 * @author Jack Finlay - 1399273
 */
public class Node<E> {
    protected E data;
    protected Node<E> next;

    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }

    public Node<E> next() {

        return next;
    }

    public void setNext(Node<E> next) {

        this.next = next;
    }

    public E value() {

        return data;
    }

    public void setValue(E value) {
        data = value;

    }
}
