package Lesson5_DSA_Trees.Tut4_DSA_BinarySearchTrees;
/*
 @Author: Monei Bakang
 @Date: 27 January 2025
 @Time: 0357 hours
 */
/* Insert a Node in a BST
    Inserting a node in a BST is similar to searching for a value.

    How it works:
    - Start at the root node.
    - Compare each node:
        - Is the value lower? Go left.
        - Is the value higher? Go right.
    - Continue to compare nodes with the new value until there is no right or left to compare with. That is where the new node is inserted.

    Inserting nodes as described above means that an inserted node will always become a new leaf node.
*/

public class Main3 {

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

    public static TreeNode insert(TreeNode node, int data) {
        if (node == null) {
            return new TreeNode(data);
        } else {
            if (data < node.data) {
                node.left = insert(node.left, data);
            } else if (data > node.data) {
                node.right = insert(node.right, data);
            }
        }
        return node;
    }

    public static void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data + ", ");
        inOrderTraversal(node.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(13);
        TreeNode node7 = new TreeNode(7);
        TreeNode node15 = new TreeNode(15);
        TreeNode node3 = new TreeNode(3);
        TreeNode node8 = new TreeNode(8);
        TreeNode node14 = new TreeNode(14);
        TreeNode node19 = new TreeNode(19);
        TreeNode node18 = new TreeNode(18);

        root.left = node7;
        root.right = node15;

        node7.left = node3;
        node7.right = node8;

        node15.left = node14;
        node15.right = node19;

        node19.left = node18;

        // Inserting new value into the BST
        insert(root, 10);

        // Traverse
        inOrderTraversal(root);
    }
}
