/**
 * @author Jack Finlay - 1399273
 */
public class Stack<E> implements Structure {

    protected SinglyLinkedList<E> data;

    public Stack() {
        data = new SinglyLinkedList<E>();

    }

    public void push(E o) {
        data.add(0, o);
    }

    public E pop() {
        return data.remove(0);
    }

    public E peek() {
        return data.get(0);
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public void clear() {
        data = new SinglyLinkedList<E>();
    }
}
