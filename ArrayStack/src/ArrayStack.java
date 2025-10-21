import java.util.Arrays;

public class ArrayStack<T> implements myStack<T> {

    private Object[] data;
    private int top;

    public ArrayStack(){
        this(10);

    }

    public ArrayStack(int initialCapacity){
        this.data = new Object[initialCapacity];
    }


    @Override
    public void push(T value) {
        addCapacity(); //es para verificar si aumentamos la capacidad del arreglo
        //top vale 0
        this.data[top++] = value; 
        //top vale top+1 
    }

    @Override
    public T pop() {
        if(isEmpty()){
            System.out.println("No hay elementos en la Stack");
            return null;
        }
        T value = (T) data[--top];//obteniendo el ultimo elemento de la stack
        data[top] = null;
        return value;
        
    }

    @Override
    public T peek() {
        if(isEmpty()){
            System.out.println("La pila esta vacia, no puedes obtener ningun elemento");
            return null;
        }
        return (T)data[top];
    }

    @Override
    public boolean isEmpty() {
        return top==0;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }


    public void addCapacity(){
        if(top==data.length){//si el arreglo esta lleno, vamos a aumentar la capacidad
            int newCap = data.length+2;
            //vamos a crear un nuevo arreglo y pasarle los datos que estan actualmente l nuevo
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