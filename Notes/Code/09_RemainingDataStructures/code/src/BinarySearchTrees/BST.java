package BinarySearchTrees;

import java.util.ArrayList;

public class BST {
    public static void main(String[] args) {
        int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
//        System.out.println(search(root, 6));
//        delete(root, 4);
//        inorder(root);
//        System.out.println();
//        delete(root, 10);
//        inorder(root);
//        System.out.println();
//        delete(root, 5);
//        inorder(root);
//        System.out.println();
        printInRange(root, 6, 10);
        System.out.println();
        RootToLeafPath(root, new ArrayList<>());
    }

    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.val > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.val == key) {
            return true;
        } else if (root.val > key) {
            // Left SubTree
            return search(root.left, key);
        } else {
            // Right SubTree
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val) {
        if (root.val > val) {
            root.left = delete(root.left, val);
        } else if (root.val < val) {
            root.right = delete(root.right, val);
        } else {
            // root.val == val
            // case 1 -> leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 -> has 1 child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3 -> has 2 children
            Node IS = inorderSuccessor(root.right);
            root.val = IS.val;
            root.right = delete(root.right, IS.val);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null){
            root = root.left;
        }
        return root;
    }


    // Q1: Print in range
     public static void printInRange(Node root, int X, int Y){
        if (root == null){
            return;
        }
        if (root.val >= X && root.val <= Y){
            printInRange(root.left, X, Y);
            System.out.print(root.val + " ");
            printInRange(root.right, X, Y);
        } else if (root.val > Y) {
            printInRange(root.left, X, Y);
        } else{
            printInRange(root.right, X, Y);
        }
     }

     public static void RootToLeafPath(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.val);
        // Leaf Node
         if (root.left == null && root.right == null){
             printPath(path);
         } else { // non-leaf nodes
             RootToLeafPath(root.left, path);
             RootToLeafPath(root.right, path);
         }
        path.remove(path.size() - 1);

     }

     public static void printPath(ArrayList<Integer> path){
         for (int i = 0; i < path.size(); i++) {
             System.out.print(path.get(i) + " -> ");
         }
         System.out.println("END");
     }
}