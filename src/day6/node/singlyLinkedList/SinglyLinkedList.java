package day6.node.singlyLinkedList;

public class SinglyLinkedList {
    private Node header;
    private int size;
    private Node tail;

    public SinglyLinkedList() {
        this.header = null;
        this.tail = null;
        this.size = 0;
    }

    public void displayEveryNodesOfLinkedList(Node header) {
        while (header != null) {
            System.out.println(header.data);
            header = header.next;
        }
    }

    public void displayEveryNodesOfLinkedListUSingRecursion(Node header) {
        if (header == null) return;
        displayEveryNodesOfLinkedListUSingRecursion(header.next);
        System.out.println(header.data);
    }

    public int sizeOfArray() {
        int count = 0;
        Node temp = header; // use temp instead of modifying header
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void insertAtEnd(int data) {
        Node temp = new Node(data);

        if (header == null) {
            header = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public void display() {
        Node temp = header;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void insertAtBeginning(int data){
        Node node = new Node(data);
        if(header == null ){
            header = node;
            tail = node;
        }else{
            node.next = header;
            header = node;
        }
        size++;
    }

    public void insertAt(int data , int index){
        Node newNode = new Node(data);
        Node temp = header;
        if(index==sizeOfArray()){
            insertAtEnd(data);
            return;
        }
        else if(index==0){
            insertAtBeginning(data);
        }
        else if(index< 0 && index > sizeOfArray()) System.out.println("invalid index !!");
        for (int i = 0; i <= index-1; i++) {
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void  getElement(int index){
        if(index < 0  && index > sizeOfArray() ) System.out.println("invalid Index !! ");
        Node temp = header;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        System.out.println(temp.data);
    }


    public void deleteNode(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }

        if (index == 0) {
            header = header.next;
            if (header == null) {
                tail = null; // list became empty
            }
        } else {
            Node temp = header;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;

            // If the deleted node was the tail
            if (temp.next == null) {
                tail = temp;
            }
        }

        size--;
    }

}
