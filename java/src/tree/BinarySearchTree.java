package tree;

public class BinarySearchTree {

    private TreeNode root;

    /**
     * Constructor to build tree
     * @param array
     */
    public BinarySearchTree(int[] array) {
        for (int number:array) {
            TreeNode node = new TreeNode(number);
            insert(node);
        }
    }

    /**
     * Get tree root
     * @return
     */
    public TreeNode getRoot() {
        return root;
    }

    /**
     * Insert one node to the tree
     * @param node
     */
    public void insert(TreeNode node) {
        if (root == null) {
            root = node;
            return;
        }
        TreeNode current = root;
        while (current != null) {
            if (node.getData() < current.getData()) {
                if (current.getLeft() == null) {
                    current.setLeft(node);
                    return;
                }
                current = current.getLeft();
            } else if (node.getData() > current.getData()) {
                if (current.getRight() == null) {
                    current.setRight(node);
                    return;
                }
                current = current.getRight();
            } else {
                return;
            }
        }
    }

    /**
     * Here for mark cumulated sum.
     */
    private Integer cumulatedSum = 0;

    /**
     * Calculate nodes's sum greater than current node
     */
    public void rightCumulationSum() {
        this.rightCumulationSum(root);
    }

    /**
     * Calculate right cumulative sum
     * @param node
     */
    public void rightCumulationSum(TreeNode node) {
        if (node != null) {
            rightCumulationSum(node.getRight());
            cumulatedSum += node.getData();
            node.setData(cumulatedSum - node.getData());
            rightCumulationSum(node.getLeft());
        }
    }
}
