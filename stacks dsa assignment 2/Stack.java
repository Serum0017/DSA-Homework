import java.util.Iterator;
import java.util.ArrayList;

// linked list implementation of stack
public class Stack<T> implements Iterable<T> {
    Node first;
    private class Node {
        T data;
        Node next;

        public Node(T data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    public boolean isEmpty(){
        return first == null;
    }
    void push(T data){
        Node newFirst = new Node(data, first);
        first = newFirst;
    }
    T pop(){
        Node lastFirst = first;
        first = first.next;
        return lastFirst.data;
    }

    ArrayList<T> toArrayList(){
        ArrayList<T> list = new ArrayList<T>();
        for(T item : this){
            list.add(item);
        }
        return list;
    }

    public Iterator<T> iterator() {
        return new StackIterator();
    }
    
    private class StackIterator implements Iterator<T> {
        private Node current = first;
        
        public boolean hasNext() {
            return current != null;
        }
        
        public void remove() {}
        public T next(){
            T item = current.data;
            current = current.next;
            return item;
        }
    }
}
