package Lesson6_DSA_AVLTrees.Tut1_DSA_AVLTrees;
/*
@Author: Monei Bakang
@Date: 27 January 2025
@Time: 0402 hours
*/

/* AVL Trees
    The only difference between a regular Binary Search Tree and an AVL Tree is that AVL Trees do rotation operations in addition, to keep the tree balance.
    A Binary Search Tree is in balance when the difference in height between left and right subtrees is less than 2.
    By keeping balance, the AVL Tree ensures a minimum tree height, which means that search, insert, and delete operations can be done really fast.
*/


/* AVL Insert Node Implementation
    This code is based on the BST implementation on the previous page, for inserting nodes.

    There is only one new attribute for each node in the AVL tree compared to the BST, and that is the height, but there are many new functions and extra code lines needed for the AVL Tree implementation because of how the AVL Tree rebalances itself.
*/


public class Main {
    static class AVLTree {
        class TreeNode {
            char data;
            TreeNode left, right;
            int height;

            TreeNode(char d) {
                data = d;
                height = 1;
            }
        }

        TreeNode root;

        int height(TreeNode N) {
            if (N == null) return 0;
            return N.height;
        }

        int getBalance(TreeNode N) {
            if (N == null) return 0;
            return height(N.left) - height(N.right);
        }

        TreeNode rightRotate(TreeNode y) {
            System.out.println("Rotate right on node " + y.data);
            TreeNode x = y.left;
            TreeNode T2 = x.right;

            x.right = y;
            y.left = T2;

            y.height = Math.max(height(y.left), height(y.right)) + 1;
            x.height = Math.max(height(x.left), height(x.right)) + 1;

            return x;
        }

        TreeNode leftRotate(TreeNode x) {
            System.out.println("Rotate left on node " + x.data);
            TreeNode y = x.right;
            TreeNode T2 = y.left;

            y.left = x;
            x.right = T2;

            x.height = Math.max(height(x.left), height(x.right)) + 1;
            y.height = Math.max(height(y.left), height(y.right)) + 1;

            return y;
        }

        TreeNode insert(TreeNode root, char data) {
            if (root == null) return new TreeNode(data);

            if (data < root.data) {
                root.left = insert(root.left, data);
            } else if (data > root.data) {
                root.right = insert(root.right, data);
            } else {
                return root; // Duplicate data is not allowed
            }

            root.height = 1 + Math.max(height(root.left), height(root.right));

            int balance = getBalance(root);

            // Left Left Case
            if (balance > 1 && getBalance(root.left) >= 0) {
                return rightRotate(root);
            }

            // Left Right Case
            if (balance > 1 && getBalance(root.left) < 0) {
                root.left = leftRotate(root.left);
                return rightRotate(root);
            }

            // Right Right Case
            if (balance < -1 && getBalance(root.right) <= 0) {
                return leftRotate(root);
            }

            // Right Left Case
            if (balance < -1 && getBalance(root.right) > 0) {
                root.right = rightRotate(root.right);
                return leftRotate(root);
            }

            return root;
        }

        void inOrderTraversal(TreeNode node) {
            if (node != null) {
                inOrderTraversal(node.left);
                System.out.print(node.data + ", ");
                inOrderTraversal(node.right);
            }
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        char[] letters = {'C', 'B', 'E', 'A', 'D', 'H', 'G', 'F'};
        for (char letter : letters) {
            tree.root = tree.insert(tree.root, letter);
        }
        tree.inOrderTraversal(tree.root);
    }
}