package day7.doublylinkedlistAndCircularLinkedList.doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addAtFirst(5);
        list.addAtFirst(10);
        list.addAtFirst(1);
        list.addAtFirst(2);
        list.addAtFirst(9);
        list.addAtFirst(6);
        list.addAtLast(11);
        list.addAtIndex(33,4);
        list.delete(3);
        list.display();
        list.size();

    }
}
