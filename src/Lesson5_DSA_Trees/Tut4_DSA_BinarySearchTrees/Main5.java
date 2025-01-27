package Lesson5_DSA_Trees.Tut4_DSA_BinarySearchTrees;
/*
 @Author: Monei Bakang
 @Date: 27 January 2025
 @Time: 0357 hours
 */
/* Delete a Node in a BST
    To delete a node, our function must first search the BST to find it.
    After the node is found there are three different cases where deleting a node must be done differently.

    How it works:
    - If the node is a leaf node, remove it by removing the link to it.
    - If the node only has one child node, connect the parent node of the node you want to remove to that child node.
    - If the node has both right and left child nodes: Find the node's in-order successor, change values with that node, then delete it.
*/

public class Main5 {

    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data + ", ");
        inOrderTraversal(node.right);
    }

    public static TreeNode minValueNode(TreeNode node) {
        TreeNode current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public static TreeNode delete(TreeNode node, int data) {
        if (node == null) {
            return null;
        }

        if (data < node.data) {
            node.left = delete(node.left, data);
        } else if (data > node.data) {
            node.right = delete(node.right, data);
        } else {
            // Node with only one child or no child
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            // Node with two children: Get the inorder successor
            node.data = minValueNode(node.right).data;
            node.right = delete(node.right, node.data);
        }
        return node;
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

        // Traverse
        inOrderTraversal(root);
        System.out.println(); // Creates a new line

        // Delete node 15
        delete(root, 15);

        // Traverse
        inOrderTraversal(root);
    }
}