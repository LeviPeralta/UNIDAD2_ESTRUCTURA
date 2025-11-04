
public class ArrayQueue<T> {
    private Object[] data;
    private int front; 
    private int size;
    private int capacity;

    public ArrayQueue(int capacity) {
        this.capacity = Math.max(4, capacity);
        data = new Object[this.capacity];
        front = 0;
        size = 0;
    }

    public ArrayQueue() {
        this(10);
    }

    public void enqueue(T item) {
        ensureCapacity();
        int idx = (front + size) % capacity;
        data[idx] = item;
        size++;
    }

    public void enqueueFront(T item) {
        ensureCapacity();
        front = (front - 1 + capacity) % capacity;
        data[front] = item;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (isEmpty()) return null;
        T item = (T) data[front];
        data[front] = null;
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size < capacity) return;
        int newCap = capacity * 2;
        Object[] newData = new Object[newCap];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(front + i) % capacity];
        }
        data = newData;
        front = 0;
        capacity = newCap;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[(front + i) % capacity]);
            if (i < size - 1) sb.append(" -> ");
        }
        sb.append("]");
        return sb.toString();
    }
}
