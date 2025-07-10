package day7.doublylinkedlist.practice;

public interface List {
    int size();

    void displayUsingRecursion(Node header);

    void add(int data, int index);

    void addAtFirst(int data);


    void addAtLast(int data);

    void getElement(int index);

    void deleteNode(int index);

    void display();




}
