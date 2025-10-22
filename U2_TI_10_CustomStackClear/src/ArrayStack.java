import java.util.Arrays;

public class ArrayStack<T> implements myStack<T> {

    private Object[] data;
    private int top;

    public ArrayStack() {
        this(10);
    }

    public ArrayStack(int initialCapacity) {
        this.data = new Object[initialCapacity];
        this.top = 0;
    }

    @Override
    public void push(T value) {
        addCapacity(); 
        this.data[top++] = value; 
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("No hay elementos en la Stack");
            return null;
        }
        T value = (T) data[--top];
        data[top] = null; 
        return value;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía, no puedes obtener ningún elemento");
            return null;
        }
        return (T) data[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public void clear() {
        //  Vacía todos los elementos de la pila
        for (int i = 0; i < top; i++) {
            data[i] = null;
        }
        top = 0; // reinicia el puntero
        System.out.println("La pila ha sido vaciada correctamente.");
    }

    private void addCapacity() {
        if (top == data.length) {
            int newCap = data.length + 2;
            data = Arrays.copyOf(data, newCap);
        }
    }

    @Override
    public void imprimir() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return;
        }

        System.out.println("Contenido de la pila:");
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }
}
