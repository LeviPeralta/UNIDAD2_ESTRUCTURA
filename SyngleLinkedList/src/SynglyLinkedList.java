public class SynglyLinkedList {
    private Node head;

    public void add(int data){

        //creacion de un nuevo nodo
        Node newNode = new Node(data);

        //verificando si la lista esta vacia, entonces el nuevo nodo es el head
        if(head==null){
            head = newNode;
            return;
        }
        
        //En caso de que no este vacia la lista
        //Vamos a recorrer todos los nodos hasta encontrar el que tenga la referencia(next) en null
        
        Node current=head; //comenzamos desde el primero
        while(current.next!=null){
            current=current.next;
        }
        //se agrega el nuevo nodo en la referencia del utlimo nodo
        current.next=newNode;
    }

    public boolean contains(int data){
        Node current=head;
        while(current!=null){
            if(current.data==data) {
                return true;
            }
                current=current.next;
        }
        return false;
    }

    public void remove(int data){
        if(head==null) return;

        if(head.data==data){
            head=head.next;
        }
        Node current=head;
        while(current.next!=null && current.next.data!=data){
            current=current.next;
        }
        if(current.next != null){
            current.next=current.next.next;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null"); 
    }
}