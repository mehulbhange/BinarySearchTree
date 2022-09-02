package com.bridgelabz;

public class BinarySearchTree {

    //Represent the root of binary tree
    public Node root;
    public BinarySearchTree(){
        root = null;
    }

    public Node insert(Node currentNode,int data){
        if ( currentNode == null){
            Node newNode = new Node(data);
            currentNode = newNode;
            return currentNode;
        }else if (data <= currentNode.data){
            currentNode.left = insert(currentNode.left, data);
           return currentNode;
        }else{
            currentNode.right = insert(currentNode.right, data);
            return currentNode;
        }
    }

    public void inOrderTraversal(Node root){
        if (root == null){
            return;
        }
        else {
            inOrderTraversal(root.left);
            System.out.print(root.data +" ");
            inOrderTraversal(root.right);
        }
    }
    public int size(Node root){
        if ( root == null){
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }
    public static void main(String[] args) {
        System.out.println("Binary search tree problem");

        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.root = binarySearchTree.insert( binarySearchTree.root,56);
        binarySearchTree.insert(binarySearchTree.root, 30);
        binarySearchTree.insert(binarySearchTree.root, 70);
        binarySearchTree.insert(binarySearchTree.root, 22);
        binarySearchTree.insert(binarySearchTree.root, 40);
        binarySearchTree.insert(binarySearchTree.root, 60);
        binarySearchTree.insert(binarySearchTree.root, 95);
        binarySearchTree.insert(binarySearchTree.root, 11);
        binarySearchTree.insert(binarySearchTree.root, 65);
        binarySearchTree.insert(binarySearchTree.root, 3);
        binarySearchTree.insert(binarySearchTree.root, 16);
        binarySearchTree.insert(binarySearchTree.root, 63);
        binarySearchTree.insert(binarySearchTree.root, 67);

        binarySearchTree.inOrderTraversal(binarySearchTree.root);

        System.out.println("\nSize : "+ binarySearchTree.size(binarySearchTree.root));
    }
}
