package linked_list;


public class linked_list{

    Node head;
 
    static class Node{
        Node(int d){
            data=d;
        } 

        int data;
        Node next;
    }

    public static void main(String[] args) {
        linked_list list = new linked_list();

        list.head = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
      
        list.head.next = secondNode;
        secondNode.next=thirdNode;
        travelsal(addfront(list, new Node(8)));
        pushGivenNode(new Node(17),list.head.next);
        travelsal(list);

    }
    public static void travelsal(linked_list list) {
        Node x = list.head;
        while(x.next != null){
            System.out.print(x.data + ",");
            x = x.next;
        }
        System.out.println();
    }

    public static linked_list addfront(linked_list list, Node node) {
            Node temp = list.head;
            list.head = node;
            node.next = temp;
            return list;
    }

    public static void pushGivenNode(Node node, Node previousNode) {
        
        Node temp = previousNode.next;
        previousNode.next = node;
        node.next = temp;  
    }

}
