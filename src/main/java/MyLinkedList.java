public class MyLinkedList<E>{

    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size;

    public MyLinkedList(){
        size = 0;
        lastNode = new Node<>(null, firstNode, null);
        firstNode = new Node<>(null, null, lastNode);
    }


    public void add(E e) {
        Node<E> prev = lastNode;
        prev.setCurrentElement(e);
        lastNode = new Node<E>(null, prev, null);
        prev.setNextElement(lastNode);
        size++;
    }

    public int size() {
        return size;
    }

    public E getElementByIndex(int counter) {
        Node<E> target = firstNode.getNextElement();
        for (int i = 0; i < counter; i++){
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

    private Node<E> getNextElement(Node<E> current){
        return current.getNextElement();
    }

    public int getIndexByElement(E e) {
        var temp = firstNode;
        for (int i = 0; i < size; i++){
            temp = temp.nextElement;
            if (temp.currentElement.equals(e))
                return i;
        }
        return -1;
    }

    public void set (int index, E e){
        var target = firstNode.getNextElement();
        for (int i = 0; i < index; i++)
            target = target.getNextElement();
        target.currentElement = e;
    }
    private class Node<E>{
        private E currentElement;
        private int index;
        private Node<E> previousElement;
        private Node<E> nextElement;

        private Node(E currentElement, Node<E> previousElement, Node<E> nextElement){
            this.currentElement = currentElement;

            if (previousElement == null)
                index = 0;
            else
                index = previousElement.index + 1;
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
