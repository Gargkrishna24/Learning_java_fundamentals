package day7.doublylinkedlist.practice;

public class Node {
    int data ;
    Node next;
    Node(int data){
        this.data = data;
    }
    Node(int data , Node next){
        this.data = data;
        this.next = next;
    }
}
