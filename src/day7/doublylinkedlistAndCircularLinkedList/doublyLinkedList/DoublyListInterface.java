package day7.doublylinkedlistAndCircularLinkedList.doublyLinkedList;

public interface DoublyListInterface {
    void addAtFirst(int data);

    void display();

    void displayReverse();

    void addAtLast(int data);

    int size();

    void addAtIndex(int data , int index);
    void delete(int index);
}
