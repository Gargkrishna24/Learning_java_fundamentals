package day7.doublylinkedlist;

public class Node {
    int data ;
    Node next;
    Node previousNode;

    public Node(int data, Node next, Node previousNode) {

        this.data = data;
        this.next = next;
        this.previousNode = previousNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                ", previousNode=" + previousNode +
                '}';
    }

    public Node(int data) {
        this.data = data;
    }
}
