package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(9);
        ll.append(5);
        ll.append(7);
        ll.removeLast();
        ll.prepend(5);
        ll.removeFirst();
        ll.getHead();
        ll.getTail();
        ll.printList();
    }
}
