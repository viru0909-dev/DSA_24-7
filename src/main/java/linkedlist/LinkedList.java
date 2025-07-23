package linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public LinkedList() {
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
    }

    public void getHead(){
        System.out.println("Head: "+head.value);
    }
    public void getTail(){
        System.out.println("Tail: "+tail.value);
    }
    public void getLength(){
        System.out.println("Length: "+length);
    }


    //Append the node at end of list.
    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    //removing last Node
    public Node removeLast(){
        if(length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        return temp;
    }

    //prepend the value the start
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    //remove first node

    public Node removeFirst(){
        if(length == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        if (length == 0){
            tail = null;
        }

        length--;
        return temp;
    }

    //get method to get value through it's index
    public Node get(int index){
        if (index<0||index>=length){
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public boolean set(int index, int value){
       Node temp = get(index);
       if (temp != null){
           temp.value = value;
           return true;
       }
       return false;
    }

}
