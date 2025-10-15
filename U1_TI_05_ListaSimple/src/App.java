public class App {
    public static void main(String[] args) throws Exception {
        Single list = new Single();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);

        System.out.println("Lista simplemente ligada:");
        list.printList();

        int numero = 2;
        int ocurrencias = list.countOccurrences(numero);
        System.out.println("El número " + numero + " aparece " + ocurrencias + " veces en la lista.");
    }
}