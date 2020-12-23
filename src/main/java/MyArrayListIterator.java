import java.util.Iterator;

public class MyArrayListIterator<E> implements Iterator {

    private int index;
    private E[] values;

    MyArrayListIterator(E[] values){
        this.values = values;
    }
    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public Object next() {
        return values[index++];
    }
}
