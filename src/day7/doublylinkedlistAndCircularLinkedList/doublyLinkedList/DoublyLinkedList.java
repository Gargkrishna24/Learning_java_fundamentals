package day7.doublylinkedlistAndCircularLinkedList.doublyLinkedList;

public class DoublyLinkedList implements DoublyListInterface {
    Node header;
    Node tail;
    int size;

    DoublyLinkedList() {
        this.header = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void addAtFirst(int data) {
        Node temp = new Node(data);
        if (size == 0) {
            header = temp;
            tail = temp;
        } else {
            temp.next = header;
            header.previous = temp;
            header = temp;
        }
        size++;
    }

    @Override
    public void display() {
        Node temp = header;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    @Override
    public void displayReverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    @Override
    public void addAtLast(int data) {
        Node temp = new Node(data);
        if (size == 0) {
            header = temp;
        } else {
            tail.next = temp;
            temp.previous = tail;
        }
        tail = temp;
        size++;
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public void addAtIndex(int data, int index) {

        if (index < 0 || index > size) {
            System.out.println("Invalid index!");
            return;
        }

        if (index == 0) {
            addAtFirst(data);
            return;
        }

        if (index == size) {
            addAtLast(data);
            return;
        }

        Node temp = new Node(data);
        Node counter = header;

        for (int i = 0; i < index - 1; i++) {
            counter = counter.next;
        }

        temp.previous = counter;
        temp.next = counter.next;

        if (counter.next != null) {
            counter.next.previous = temp;
        }

        counter.next = temp;

        size++;
    }

    @Override
    public void delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }

        // Case 1: Deleting the first node
        if (index == 0) {
            if (header.next != null) {
                header = header.next;
                header.previous = null;
            } else {
                header = null;
                tail = null;
            }
            size--;
            return;
        }

        // Case 2: Deleting the last node
        if (index == size - 1) {
            tail = tail.previous;
            tail.next = null;
            size--;
            return;
        }

        // Case 3: Deleting a middle node
        Node current = header;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.previous.next = current.next;
        current.next.previous = current.previous;

        size--;
    }


//    @Override
//    public void displayReverseFrom(Node randomNode) {
//        Node temp = randomNode;
//        while (temp != null) {
//            System.out.print(temp.data + " <-> ");
//            temp = temp.previous;
//        }
//        System.out.println("null");
//    }
}
