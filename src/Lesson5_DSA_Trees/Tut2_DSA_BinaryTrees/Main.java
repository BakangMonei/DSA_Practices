package Lesson5_DSA_Trees.Tut2_DSA_BinaryTrees;

/*
 @Author: Monei Bakang
 @Date: 27 January 2025
 @Time: 0357 hours
 */
/* Binary Trees
    A Binary Tree is a type of tree data structure where each node can have a maximum of two child nodes, a left child node and a right child node.
    This restriction, that a node can have a maximum of two child nodes, gives us many benefits:
        - Algorithms like traversing, searching, insertion and deletion become easier to understand, to implement, and run faster.
        - Keeping data sorted in a Binary Search Tree (BST) makes searching very efficient.
        - Balancing trees is easier to do with a limited number of child nodes, using an AVL Binary Tree for example.
        - Binary Trees can be represented as arrays, making the tree more memory efficient.
*/

/* Binary Trees vs Arrays and Linked Lists
    Benefits of Binary Trees over Arrays and Linked Lists:
    - Arrays are fast when you want to access an element directly, like element number 700 in an array of 1000 elements for example. But inserting and deleting elements require other elements to shift in memory to make place for the new element, or to take the deleted elements place, and that is time consuming.
    - Linked Lists are fast when inserting or deleting nodes, no memory shifting needed, but to access an element inside the list, the list must be traversed, and that takes time.
    - Binary Trees, such as Binary Search Trees and AVL Trees, are great compared to Arrays and Linked Lists because they are BOTH fast at accessing a node, AND fast when it comes to deleting or inserting a node, with no shifts in memory needed.
    We will take a closer look at how Binary Search Trees (BSTs) and AVL Trees work on the next two pages, but first let's look at how a Binary Tree can be implemented, and how it can be traversed.
*/

/* Types of Binary Trees
    There are different variants, or types, of Binary Trees worth discussing to get a better understanding of how Binary Trees can be structured.
    The different kinds of Binary Trees are also worth mentioning now as these words and concepts will be used later in the tutorial.

    Below are short explanations of different types of Binary Tree structures, and below the explanations are drawings of these kinds of structures to make it as easy to understand as possible.

    - A balanced Binary Tree has at most 1 in difference between its left and right subtree heights, for each node in the tree.
    - A complete Binary Tree has all levels full of nodes, except the last level, which is can also be full, or filled from left to right. The properties of a complete Binary Tree means it is also balanced.
    - A full Binary Tree is a kind of tree where each node has either 0 or 2 child nodes.
    - A perfect Binary Tree has all leaf nodes on the same level, which means that all levels are full of nodes, and all internal nodes have two child nodes.The properties of a perfect Binary Tree means it is also full, balanced, and complete.

*/

public class Main {
    public static class TreeNode {
        char data;
        TreeNode left;
        TreeNode right;

        public TreeNode(char data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static TreeNode createNewNode(char data) {
        return new TreeNode(data);
    }

    public static void main(String[] args) {
        TreeNode root = createNewNode('R');
        TreeNode nodeA = createNewNode('A');
        TreeNode nodeB = createNewNode('B');
        TreeNode nodeC = createNewNode('C');
        TreeNode nodeD = createNewNode('D');
        TreeNode nodeE = createNewNode('E');
        TreeNode nodeF = createNewNode('F');
        TreeNode nodeG = createNewNode('G');

        root.left = nodeA;
        root.right = nodeB;

        nodeA.left = nodeC;
        nodeA.right = nodeD;

        nodeB.left = nodeE;
        nodeB.right = nodeF;

        nodeF.left = nodeG;

        // Test
        System.out.println("root.right.left.data: " + root.right.left.data);
    }
}

