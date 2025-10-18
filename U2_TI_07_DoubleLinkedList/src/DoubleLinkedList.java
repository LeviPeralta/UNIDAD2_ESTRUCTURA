class DoubleLinkedList {
    Node head;
    Node tail;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("La lista está vacía");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void remove(int value) {
        if (head == null) {
            System.out.println("La lista está vacía");
            return;
        }

        Node current = head;

        while (current != null && current.data != value) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Valor no encontrado");
            return;
        }

        // Caso 1: El nodo a eliminar es el head
        if (current == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null; 
            }
        }
        // Caso 2: El nodo a eliminar es el tail
        else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        }
        // Caso 3: Nodo en medio
        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        System.out.println("Elemento " + value + " eliminado.");
    }
}