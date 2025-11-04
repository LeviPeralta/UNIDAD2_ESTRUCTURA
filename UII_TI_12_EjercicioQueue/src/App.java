public class App {
    public static void main(String[] args) throws Exception {
        ArrayQueue<Customer> queue = new ArrayQueue<>(10);

        queue.enqueue(new Customer(1, "Dani"));
        queue.enqueue(new Customer(2, "Josseph"));
        queue.enqueue(new Customer(3, "Ian"));
        queue.enqueue(new Customer(4, "Jenni"));
        queue.enqueue(new Customer(5, "Levi"));

        System.out.println("Antes de invertir:");
        System.out.println(queue);

        int elementosAntes = queue.size();

        queue.reverse();

        System.out.println("Después de invertir:");
        System.out.println(queue);

        int elementosDespues = queue.size();

        System.out.println("Elementos antes = " + elementosAntes + ", elementos después = " + elementosDespues);
    }
}
