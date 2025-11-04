public class ArrayStack<T> {
    private Object[] data;
    private int top;
    private int capacity;

    public ArrayStack(int capacity) {
        this.capacity = Math.max(4, capacity);
        data = new Object[this.capacity];
        top = -1;
    }

    public ArrayStack() {
        this(10);
    }

    public void push(T item) {
        if (top + 1 == capacity) expand();
        data[++top] = item;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) return null;
        T item = (T) data[top];
        data[top--] = null;
        return item;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) return null;
        return (T) data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    private void expand() {
        capacity *= 2;
        Object[] nd = new Object[capacity];
        for (int i = 0; i <= top; i++) nd[i] = data[i];
        data = nd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= top; i++) {
            sb.append(data[i]);
            if (i < top) sb.append(" -> ");
        }
        sb.append("]");
        return sb.toString();
    }
}
