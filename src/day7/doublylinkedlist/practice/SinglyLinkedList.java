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

    public int getSize() {
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

    }

    @Override
    public void addAtFirst(int data) {
        Node temp = new Node(data);
        if (size() == 0) {
            header = temp;
            tail = temp;
        } else {
            temp.next = header;
            header = temp;

        }
        size++;
    }

    @Override
    public void addAtLast(int data) {
        Node temp = new Node(data);
        if (size() == 0) {

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
    public void deleteNode(int data) {

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
