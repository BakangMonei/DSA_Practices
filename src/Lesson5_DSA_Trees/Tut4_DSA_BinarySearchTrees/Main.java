package Lesson5_DSA_Trees.Tut4_DSA_BinarySearchTrees;
/*
 @Author: Monei Bakang
 @Date: 27 January 2025
 @Time: 0357 hours
 */
/* A Binary Search Tree is a Binary Tree where every node's left child has a lower value, and every node's right child has a higher value.
    A clear advantage with Binary Search Trees is that operations like search, delete, and insert are fast and done without having to shift values in memory.
*/

/* Binary Search Trees
    A Binary Search Tree (BST) is a type of Binary Tree data structure, where the following properties must be true for any node "X" in the tree:
        - The X node's left child and all of its descendants (children, children's children, and so on) have lower values than X's value.
        - The right child, and all its descendants have higher values than X's value.
        - Left and right subtrees must also be Binary Search Trees.
    These properties makes it faster to search, add and delete values than a regular binary tree.

    To make this as easy to understand and implement as possible, let's also assume that all values in a Binary Search Tree are unique.
*/


/* Traversal of a Binary Search Tree
    - Just to confirm that we actually have a Binary Search Tree data structure in front of us, we can check if the properties at the top of this page are true. So for every node in the figure above, check if all the values to the left of the node are lower, and that all values to the right are higher.
    - Another way to check if a Binary Tree is BST, is to do an in-order traversal (like we did on the previous page) and check if the resulting list of values are in an increasing order.
    - The code below is an implementation of the Binary Search Tree in the figure above, with traversal.
*/

public class Main {

    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void inOrderTraversal(TreeNode node) {
        if (node == null)
            return;
        inOrderTraversal(node.left);
        System.out.print(node.data + ", ");
        inOrderTraversal(node.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(13);
        root.left = new TreeNode(7);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(8);

        root.right.left = new TreeNode(14);
        root.right.right = new TreeNode(19);

        root.right.right.left = new TreeNode(18);

        inOrderTraversal(root);
    }
}