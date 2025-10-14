public class App {
    public static void main(String[] args) throws Exception {
        SynglyLinkedList list = new SynglyLinkedList();

        list.printList();

        list.add(1);
        list.add(2);
        list.add(3);

        list.printList(); 

        list.remove(2);
        list.printList();
    }
}
