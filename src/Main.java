//import day4.oop.encapsulaton.Student;
//import day4.oop.encapsulaton.constructor.Constructor;
//import day5.singlylinkedlist.SinglyLinkedList;
//
//public class Main {
//    public static void main(String[] args) {
//        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
//    }
//}
///*
//
//import day4.oop.encapsulaton.Bank;
//
//public class Main {
//    public static void main(String[] args) {
//        Bank bank = new Bank();
//        bank.setAccountNumber(334576);
//        bank.deposite(100);
//        bank.withdraw(10);
//        System.out.println("bank = " + bank);
//
//    }
//}
// */

import day6.node.singlyLinkedList.Node;
import day6.node.singlyLinkedList.SinglyLinkedList;

class Main{
    public static void main(String[] args) {
//        Node node1 = new Node(6);
//        Node node2 = new Node(7);
//        Node node3 = new Node(8);
//        Node node4 = new Node(7);
//        node1.next = node2;
//        node2.next=node3;
//        node3.next = node4;
//        node4.next=null;
//        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
//        singlyLinkedList.displayEveryNodesOfLinkedListUSingRecursion(node1);
////        int result = singlyLinkedList.sizeOfArray(node1);
////        System.out.println(result);
////        singlyLinkedList.insertAtEnd(110);
////        singlyLinkedList.display();
//        singlyLinkedList.insertAtBeginning(455);
//        singlyLinkedList.display();
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtBeginning(7);
        list.insertAtBeginning(8);
        list.insertAtBeginning(7);
        list.insertAtBeginning(6);
//        list.display();
        list.insertAt(55,2);
        list.display();
        list.getElement(8);
    }
}