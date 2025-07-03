package day5.singlylinkedlist;

public class SinglyNode {
    private int data;
    private SinglyNode next;



    public SinglyNode(int data, SinglyNode next) {
        this.data = data;
        this.next = next;
    }

    public SinglyNode(int data) {
        this.data = data;
    }
}
