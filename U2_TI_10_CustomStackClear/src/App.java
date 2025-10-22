public class App {
    public static void main(String[] args) throws Exception {
        ArrayStack<Integer> myStack = new ArrayStack<>();
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        // imprimir antes
        myStack.imprimir();

        myStack.pop();

        // imprimir después del pop
        myStack.imprimir();

        // limpiar la pila
        myStack.clear();

        // imprimir después del clear
        myStack.imprimir();
    }
}
