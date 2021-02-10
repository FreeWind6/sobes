package secondLesson;

/**
 * @author Dmitry Kubyshkin
 * @dateOfCreation 02.02.2021
 */

public class LinkedList<T> {

    private Node first;
    private int size;

    public LinkedList() {
        first = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void add(T data) {
        Node current = first;

        if (current == null) {
            first = new Node(data);
            size++;
            return;
        }

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(new Node(data));
        size++;
    }

    public void add(T[] array) {
        for (T data : array) {
            add(data);
        }
    }

    private class Node<T> {

        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            next = null;
        }

        public void setData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return next;
        }
    }
}
