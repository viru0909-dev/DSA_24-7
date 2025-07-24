package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(9);
        ll.append(5);
        ll.append(7);


        ll.reverse();

        ll.printList();
    }
}
