/**
 * @author Jack Finlay - 1399273
 */

public class CircularNode<E> {
    protected E data;
    protected CircularNode<E> next;
    protected CircularNode<E> previous;

    public CircularNode(E data, CircularNode<E> previous, CircularNode<E> next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }

    public CircularNode<E> next() {

        return next;
    }

    public void setNext(CircularNode<E> next) {

        this.next = next;
    }

    public CircularNode<E> previous() {

        return next;
    }

    public void setPrevious(CircularNode<E> next) {

        this.next = next;
    }

    public E value() {

        return data;
    }

    public void setValue(E value) {
        data = value;

    }
}

