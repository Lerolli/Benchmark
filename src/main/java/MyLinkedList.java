public class MyLinkedList<E> implements MyLinkedListInterface<E> {

    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size;

    public MyLinkedList(){
        lastNode = new Node<>(null, firstNode, null);
        firstNode = new Node<>(null, null, lastNode);

    }


    @Override
    public void addLast(E e) {
        Node<E> prev = lastNode;
        prev.setCurrentElement(e);
        lastNode = new Node<E>(null, prev, null);
    }

    @Override
    public void addFirst(E e) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public E getElementByIndex(int counter) {
        return null;
    }

    @Override
    public E getIndexByElement(E e) {
        return null;
    }

    private class Node<E>{
        private E currentElement;
        private Node<E> previousElement;
        private Node<E> nextElement;

        private Node(E currentElement, Node<E> previousElement, Node<E> nextElement){
            this.currentElement = currentElement;
            this.previousElement = previousElement;
            this.nextElement = nextElement;
        }
        public E getCurrentElement(){
            return currentElement;
        }

        public void setCurrentElement (E currentElement){
            this.currentElement = currentElement;
        }

        public Node<E> getNextElement(){
            return nextElement;
        }

        public void setNextElement(Node<E> nextElement){
            this.nextElement = nextElement;
        }

        public Node<E> getPreviousElement(){
            return previousElement;
        }

        public void setPreviousElement(Node<E> previousElement){
            this.previousElement = previousElement;
        }

    }
}
