import java.util.Stack;

class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{id=" + id + ", name='" + name + "'}";
    }
}

class ArrayQueue<T> {
    private Object[] data;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(T item) {
        if (size == capacity) {
            throw new IllegalStateException("Queue llena");
        }
        rear = (rear + 1) % capacity;
        data[rear] = item;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue vacía");
        }
        T item = (T) data[front];
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

    // Método para invertir usando un Stack auxiliar
    public void reverse() {
        Stack<T> stack = new Stack<>();

        // Mover elementos al stack
        while (!isEmpty()) {
            stack.push(dequeue());
        }

        // Moverlos de nuevo en orden invertido
        while (!stack.isEmpty()) {
            enqueue(stack.pop());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            sb.append(data[index]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}