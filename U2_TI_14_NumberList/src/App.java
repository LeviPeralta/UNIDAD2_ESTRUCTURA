public class App {
    public static void main(String[] args) throws Exception {
        CustomLinkedList original = new CustomLinkedList();
        original.add(1);
        original.add(2);
        original.add(3);
        original.add(4);
        original.add(5);

        System.out.print("Original: ");
        original.printList();

        CustomLinkedList pares = new CustomLinkedList();
        CustomLinkedList impares = new CustomLinkedList();

        original.dividirParesImpares(pares, impares);

        System.out.print("Pares: ");
        pares.printList();

        System.out.print("Impares: ");
        impares.printList();
    }
}
