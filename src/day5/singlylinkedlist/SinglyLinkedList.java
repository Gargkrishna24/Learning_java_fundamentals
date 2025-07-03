package day5.singlylinkedlist;

//import  day5.singlylinkedlist.SinglyNode;
public class SinglyLinkedList  {
     SinglyNode head;
    SinglyNode tail;
     int size;

     public SinglyLinkedList() {
        this.size = 0;
    }
    public void addFirstNode(int data){
         SinglyNode node = new SinglyNode(data);
         SinglyNode.next = head;
//         head = SinglyNode;
    }

}
