public interface IQueue<T> {
    T poll();
    void offer(T data);
    T peek();
    void printQ();
    boolean isEmpty(); //Para recorrer el ciclo
    int size();
}
