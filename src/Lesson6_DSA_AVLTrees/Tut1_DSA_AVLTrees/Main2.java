package Lesson6_DSA_AVLTrees.Tut1_DSA_AVLTrees;
/*
@Author: Monei Bakang
@Date: 27 January 2025
@Time: 0404 hours
*/

/* AVL Delete Node Implementation
    - When deleting a node that is not a leaf node, the AVL Tree requires the minValueNode() function to find a node's next node in the in-order traversal. This is the same as when deleting a node in a Binary Search Tree, as explained on the previous page.
    - To delete a node in an AVL Tree, the same code to restore balance is needed as for the code to insert a node.
*/


public class Main2 {
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

        private int height(TreeNode N) {
            if (N == null) return 0;
            return N.height;
        }

        private int getBalance(TreeNode N) {
            if (N == null) return 0;
            return height(N.left) - height(N.right);
        }

        private TreeNode rightRotate(TreeNode y) {
            TreeNode x = y.left;
            TreeNode T2 = x.right;

            x.right = y;
            y.left = T2;

            y.height = Math.max(height(y.left), height(y.right)) + 1;
            x.height = Math.max(height(x.left), height(x.right)) + 1;

            return x;
        }

        private TreeNode leftRotate(TreeNode x) {
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

        private TreeNode minValueNode(TreeNode node) {
            TreeNode current = node;
            while (current.left != null) {
                current = current.left;
            }
            return current;
        }

        TreeNode delete(TreeNode root, char data) {
            if (root == null) {
                return root;
            }

            if (data < root.data) {
                root.left = delete(root.left, data);
            } else if (data > root.data) {
                root.right = delete(root.right, data);
            } else {
                if ((root.left == null) || (root.right == null)) {
                    TreeNode temp = root.left != null ? root.left : root.right;

                    if (temp == null) {
                        root = null;
                    } else {
                        root = temp;
                    }
                } else {
                    TreeNode temp = minValueNode(root.right);
                    root.data = temp.data;
                    root.right = delete(root.right, temp.data);
                }
            }

            if (root == null) {
                return root;
            }

            root.height = Math.max(height(root.left), height(root.right)) + 1;

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

        public static void main(String[] args) {
            AVLTree tree = new AVLTree();
            char[] letters = {'C', 'B', 'E', 'A', 'D', 'H', 'G', 'F'};
            for (char letter : letters) {
                tree.root = tree.insert(tree.root, letter);
            }

            tree.inOrderTraversal(tree.root);

            System.out.println("\nDeleting A");
            tree.root = tree.delete(tree.root, 'A');
            tree.inOrderTraversal(tree.root);
        }
    }
}

// Java

