public class App {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        // Agregar elementos
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Lista antes de eliminar:");
        list.printList();

        // Eliminar elementos
        list.remove(20); // eliminar en medio
        list.remove(10); // eliminar head
        list.remove(40); // eliminar tail
        list.remove(50); // valor no existente

        System.out.println("Lista después de eliminar:");
        list.printList();
    }
}