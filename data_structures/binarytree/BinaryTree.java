package binarytree;
 class Node{
    int data ;
    Node left;
    Node right;
    Node(int d){
        data = d ;
        left = right = null ; 
    }
}
public class BinaryTree {
    Node root ; 
    
    BinaryTree(int data){
        root = new Node(data);
    }
    BinaryTree(){
        root = null;
    }
    public static void main(String[] args) {
        BinaryTree b = new BinaryTree();
        b.root = new Node(1);
        b.root.left = new Node(3);
        b.root.left.right = new Node(9);
    }
    
 

    }