/**
 * @author Jack Finlay - 1399273
 */
public abstract class AbstractList<E> implements List<E> {
    @Override
    public boolean contains(E value) {
        return (indexOf(value) != -1);
    }

    @Override
    public E remove(E o) {
        int i = indexOf(o);

        if (i != -1) {
            return remove(i);
        } else {
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        return (size() == 0);
    }


}
