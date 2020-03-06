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
public class BinarySearchTree {
    Node root ; 
    
    BinarySearchTree(int data){
        root = new Node(data);
    }
    BinarySearchTree(){
        root = null;
    }
     void insert(int key){
        
        root = insertRec(this.root, key);
        //  else{
        //      if(key < root.data){
        //        Node temp = new Node(key);


        //      }
        //  }
        
     }
     Node n(int key) {
         return new Node(key);
     }
     Node insertRec(Node node,int key){
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
        if(node.data>key){
            if(node.left == null) node.left = n(key);
            else insertRec(node.left, key);
        }
        else {
            if(node.right == null) node.right = n(key);
            else insertRec(node.right, key);
        }
        return root ; 
     }

    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();
        b.insert(8);
        b.insert(3);
        b.insert(9);
        b.insert(5);
        b.insert(1);
        b.insert(2);
        System.out.println(b);
    }

    public static void preorder(BinarySearchTree tree, int key) {

        if(tree.root.data == key) {
            System.out.println("Root");
            return;
        }
        else {
            Node temp = tree.root.left;
            
            while(temp != null){

                if(temp.data == key){
                    System.out.println("Found on" + temp.data);
                    break;
                }
                else {
                    if(temp.left == null && temp.right!= null) {
                        temp = temp.right;
                    }
                    if(temp.left == null && temp.right== null) {
                        temp = tree.root.right;
                    }
                    if(temp.left != null && temp.right!= null || temp.left != null && temp.right == null) {
                        temp = temp.left;
                    }
                }
            }
            System.out.println("bulamadım");
        }
        
    }
 

    }