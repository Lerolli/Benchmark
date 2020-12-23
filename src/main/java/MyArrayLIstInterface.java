
public interface MyArrayLIstInterface<E> extends Iterable<E> {
    boolean add(E e);
    void delete(int index);
    E get(int Index);
    int size();
    void update(int index, E e);
}
