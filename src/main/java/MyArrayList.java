import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<E> implements MyArrayLIstInterface<E> {

    private E[] values;

    MyArrayList(){
        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try {
            var temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete(int index) {

    }

    public E get(int Index) {
        return values[Index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    public int indexOf (E e){
        for (int i = 0; i < values.length; i++) {
            if (values[i] == e)
                return i;
        }
        return -1;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyArrayListIterator<>(values);
    }
}