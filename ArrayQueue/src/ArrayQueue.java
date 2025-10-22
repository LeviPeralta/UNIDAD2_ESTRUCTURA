public class ArrayQueue<T> implements IQueue<T> {

    private Object[] data;
    private int front; //quien va primero en la fila
    private int rear; //posicion donde va el siguiente dato
    private int size; //Tamaño de la queue

    //Constructores
    public ArrayQueue(){
        this(10);
    }
    public ArrayQueue(int tam){
        this.data = new Object[tam];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    @SuppressWarnings ("unchecked")
    @Override
    public T poll() {
        if(isEmpty()){
            System.out.println("La queque esta vacia");
            return null;
        }
        T result =(T) data[front]; //elemento a retirar
        data[front] = null; //limpiamos elemento en la posicion front
        front = (front + 1)%data.length; //calculamos nuevo frente
        size--; //reducimos el tamaño
        return result; //devolver el elemento eliminado
        
    }

    @Override
    public void offer(T element) {
        //Validar si el arreglo esta lleno, lo vamos a incrementar
        this.data[rear] = element; //Agrega un elemento nuevo en rear (Posicion)
        this.rear = (rear + 1)%data.length; // calculo de rear, si llega al final se reinicia
        size++;
    }

    @SuppressWarnings ("unchecked")
    @Override
    public T peek() {
        if (isEmpty()){
            System.out.println("La queue esta vacia");
            return null;
        }
        return (T) data[front];
    }

    @Override
    public void printQ() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < size; i++){
            sb.append(data[(front + i)%data.length]);
            sb.append(" ");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

}
