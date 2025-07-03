package day6.node;

public class NodeUnderstanding {
    int data;
    NodeUnderstanding next;

    @Override
    public String toString() {
        return "NodeUnderstanding{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    NodeUnderstanding(int data){
        this.data=data;
    }

    public static void main(String[] args) {
        NodeUnderstanding nodeOne = new NodeUnderstanding(5);
        NodeUnderstanding nodeTwo = new NodeUnderstanding(10);
        NodeUnderstanding nodeThree = new NodeUnderstanding(15);
        NodeUnderstanding nodeFour = new NodeUnderstanding(25);
        nodeOne.next=nodeTwo;
        nodeTwo.next=nodeThree;
        nodeThree.next=nodeFour;
        NodeUnderstanding header = nodeOne;
        System.out.println(header);
        System.out.println(nodeOne);
        while(header.next!=null) {
            System.out.println(header.data);
            header = header.next;
        }

    }
}
