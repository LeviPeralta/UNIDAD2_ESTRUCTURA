public class SinglyLinkedList<T> {
    private static class Node<T> {
        T value;
        Node<T> next;
        Node(T v) { value = v; next = null; }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public SinglyLinkedList() {
        head = tail = null;
        size = 0;
    }

    public void addLast(T value) {
        Node<T> n = new Node<>(value);
        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        size++;
    }

    public T removeLast() {
        if (head == null) return null;
        if (head == tail) {
            T v = head.value;
            head = tail = null;
            size = 0;
            return v;
        }
        Node<T> cur = head;
        while (cur.next != tail) {
            cur = cur.next;
        }
        T v = tail.value;
        tail = cur;
        tail.next = null;
        size--;
        return v;
    }

    public int size() { return size; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> cur = head;
        while (cur != null) {
            sb.append(cur.value);
            if (cur.next != null) sb.append(" -> ");
            cur = cur.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
