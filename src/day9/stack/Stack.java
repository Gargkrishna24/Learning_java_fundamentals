package day9.stack;

public class Stack implements StackInterface {
    Node header;
    int size;

    public Stack() {
        this.header = null;
        this.size = 0;
    }

    @Override
    public void peek() {
        System.out.println(header.data);
    }

    @Override
    public void isEmpty() {
        if(size==0) System.out.println("Stack is Empty");
    }

    @Override
    public void push(int data) {
        Node temp = new Node(data);
        temp.next = header;
        header= temp;
        size++;
    }

    @Override
    public void getSize() {
        System.out.println(size);
    }

    @Override
    public void pop() {
        Node temp = header;

    }
}
