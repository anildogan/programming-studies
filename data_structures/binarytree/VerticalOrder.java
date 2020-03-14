package binarytree;

import binarytree.BinaryTree;

class VerticalOrder{
    public static void main(String[] args) {
        BinaryTree b = new BinaryTree(1);
        b.root.left = new Node(2) ;
        b.root.left.right = new Node(2) ;
        b.root.left.left = new Node(4) ;
        b.root.right = new Node(3);
        b.root.right.left = new Node(6);
        b.root.right.right = new Node(7);
        b.root.right.right.right = new Node(9);
        b.root.right.left.right = new Node(8);
    
        

    }
    
}