package tree;

import sun.reflect.generics.tree.Tree;

public class Trees {

    /**
     * Wrapper to get enter line
     * @param root
     */
    public static void preTraverse(TreeNode root) {
        preTraverseRecursive(root);
        System.out.println();
    }

    /**
     * Wrapper to get enter line
     * @param root
     */
    public static void middleTraverse(TreeNode root) {
        middleTraverseRecursive(root);
        System.out.println();
    }

    /**
     * Wrapper to get enter line
     * @param root
     */
    public static void backTraverse(TreeNode root) {
        backTraverseRecursive(root);
        System.out.println();
    }


    /**
     * Pre-order traverse the tree
     * @param root
     */
    public static void preTraverseRecursive(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.getData() + " ");

        if (root.getLeft() != null) {
            preTraverseRecursive(root.getLeft());
        }

        if (root.getRight() != null) {
            preTraverseRecursive(root.getRight());
        }
    }

    /**
     * Middle order traverse the tree
     * @param root
     */
    public static void middleTraverseRecursive(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.getLeft() != null) {
            middleTraverseRecursive(root.getLeft());
        }

        System.out.print(root.getData() + " ");

        if (root.getRight() != null) {
            middleTraverseRecursive(root.getRight());
        }
    }

    /**
     * Back order traverse the tree
     * @param root
     */
    public static void backTraverseRecursive(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.getLeft() != null) {
            backTraverseRecursive(root.getLeft());
        }

        if (root.getRight() != null) {
            backTraverseRecursive(root.getRight());
        }

        System.out.print(root.getData() + " ");
    }
}
