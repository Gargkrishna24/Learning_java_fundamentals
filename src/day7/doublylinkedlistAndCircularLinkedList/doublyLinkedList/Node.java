package day7.doublylinkedlistAndCircularLinkedList.doublyLinkedList;

public class Node {
    int data;
    Node next;
    Node previous;


    Node(int data){
        this.data=data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                ", previous=" + previous +
                '}';
    }


}
