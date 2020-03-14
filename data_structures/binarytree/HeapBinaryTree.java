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
public class HeapBinaryTree {
    Node root ; 
    
    HeapBinaryTree(int data){
        root = new Node(data);
    }
    HeapBinaryTree(){
        root = null;
    }
    public static void main(String[] args) {
        HeapBinaryTree b = new HeapBinaryTree();
        b.root = new Node(1);
        b.root.left = new Node(3);
        b.root.left.right = new Node(9);
    }
 

    }