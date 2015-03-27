import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author Jack Finlay - 1399273
 */
public interface Structure {
    public int size();

    public boolean isEmpty();

    public void clear();

    public Enumeration elements();

    public Iterator iterator();

    public Collection values();

}
