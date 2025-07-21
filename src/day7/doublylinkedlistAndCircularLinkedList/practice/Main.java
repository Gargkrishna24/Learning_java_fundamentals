package day7.doublylinkedlistAndCircularLinkedList.practice;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addAtFirst(5);
        list.addAtFirst(9);
        list.addAtFirst(8);
        list.addAtFirst(7);

        list.deleteNode(2);
        list.display();
    }
}
