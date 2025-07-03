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

    static void displayNodes(NodeUnderstanding header){
        while(header!=null){
            System.out.println(header.data);
            header = header.next;
        }
    }
    static void displayNodesUsingRecursion(NodeUnderstanding header){
        if(header==null) return;
        displayNodesUsingRecursion(header.next);
        System.out.println(header.data);
    }

    static int checkLength(NodeUnderstanding header){
        int count = 0;
        while(header != null){
            count++;
            header=header.next;
        }
        return count;

    }

    public static void main(String[] args) {
        NodeUnderstanding nodeOne = new NodeUnderstanding(5);
        NodeUnderstanding nodeTwo = new NodeUnderstanding(10);
        NodeUnderstanding nodeThree = new NodeUnderstanding(15);
        NodeUnderstanding nodeFour = new NodeUnderstanding(25);
        nodeOne.next=nodeTwo;
        nodeTwo.next=nodeThree;
        nodeThree.next=nodeFour;
//        int count = 0;
//        NodeUnderstanding header = nodeOne;
//        System.out.println(header);
//        System.out.println(nodeOne);
        displayNodes(nodeOne);

        // Displaying Nodes using While Loop
//        while(header.next!=null) {
//            System.out.println(header.data);
//            header = header.next;
//        }

        displayNodesUsingRecursion(nodeOne);
        System.out.println(checkLength(nodeOne));
    }
}
