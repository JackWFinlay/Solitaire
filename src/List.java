/**
 * @author Jack Finlay - 1399273
 */
public interface List<E> extends Structure {

    public int indexOf(E value);

    public E get(int i);

    public void add(int i, E o);

    public E remove(E o);

    public E remove(int i);

}
