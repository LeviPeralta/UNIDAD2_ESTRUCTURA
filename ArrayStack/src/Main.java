
public class Main {
    public static void main(String[] args) throws Exception{
        ArrayStack<Integer> myStack = new ArrayStack<>();
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
    
        //aquí impreimir
        myStack.imprimir();

        myStack.pop();
        
        //imprimir
        myStack.imprimir();
    }
}