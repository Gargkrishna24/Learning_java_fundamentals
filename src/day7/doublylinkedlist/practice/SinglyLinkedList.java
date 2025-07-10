package day7.doublylinkedlist.practice;

public class SinglyLinkedList implements List {
    private Node header;
    private Node tail;
    private int size;

    SinglyLinkedList() {
        this.size = 0;
        this.header = null;
        this.tail = null;
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public void displayUsingRecursion(Node header) {
        if (header == null) return;
        System.out.println(header.data);
        displayUsingRecursion(header.next);
    }

    @Override
    public void add(int data, int index) {
        if(index==size){
            addAtLast(data);
            return;
        }
        if(index==0){
            addAtFirst(data);
            return;
        }
        Node temp = header;
        Node newNode = new Node(data);
        for (int i = 0; i < index-1 ; i++) {
            temp=temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    @Override
    public void addAtFirst(int data) {
        Node temp = new Node(data);
        if (size == 0) {
            header=temp ;
             tail=temp;
        } else {
            temp.next = header;
            header = temp;

        }
        size++;
    }

    @Override
    public void addAtLast(int data) {
        Node temp = new Node(data);
        if (size == 0) {
            header=temp;
            tail=temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;

    }

    @Override
    public void getElement(int index) {
        Node temp = this.header;
//        System.out.println(header.hashCode());
        if (index >= size() || index < 0) {
            System.out.println("Invalid index !!");
            return;
        } else {
            System.out.println("head "+ header);
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        }
        if (temp != null) {
            System.out.println("Searched Element: " + temp.data);
        } else {
            System.out.println("Element not found!");
        }
    }

    @Override
    public void deleteNode(int index) {
        if(index==0){
            header = header.next;
        }
        else if(index==size-1){
            Node temp = header;
            for (int i = 0; i < size - 1; i++) {
                temp=temp.next;
            }
            temp.next = null;
            tail = temp;
        }else {
            Node temp = header;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
       size--;


    }


    @Override
    public void display() {
        Node temp = header;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}
