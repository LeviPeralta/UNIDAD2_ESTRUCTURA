public class App {
    public static void main(String[] args) throws Exception {
        ArrayQueue<Character> lista = new ArrayQueue<>();
     lista.printQ();
     lista.offer('J');
     lista.offer('O');
     lista.offer('S');
     lista.offer('S');
     lista.offer('E');
     lista.offer('P');
     lista.offer('H');
     lista.printQ();
     lista.poll();
     lista.printQ();
     lista.offer('L');
     lista.offer('E');
     lista.offer('V');
     lista.offer('I');
     lista.printQ();

    }
}
