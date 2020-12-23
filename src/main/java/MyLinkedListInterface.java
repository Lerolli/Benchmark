public interface MyLinkedListInterface<E> {
    void addLast(E e);
    void addFirst(E e);
    int size();
    E getElementByIndex(int counter);
    E getIndexByElement(E e);
}
