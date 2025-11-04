public class CustomLinkedList {
    private Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Node getHead() {
        return head;
    }

    // Método para mostrar la lista
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Método para dividir en pares e impares
    public void dividirParesImpares(CustomLinkedList pares, CustomLinkedList impares) {
        Node current = head;
        while (current != null) {
            if (current.data % 2 == 0) {
                pares.add(current.data);
            } else {
                impares.add(current.data);
            }
            current = current.next;
        }
    }
}
