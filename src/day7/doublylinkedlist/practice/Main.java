package day7.doublylinkedlist.practice;
import day7.doublylinkedlist.practice.SinglyLinkedList;
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addAtFirst(5);
        list.addAtFirst(9);
        list.addAtFirst(8);
        list.addAtFirst(7);
        list.addAtFirst(6);
        list.display();
    }
}
