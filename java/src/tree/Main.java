package tree;

public class Main {

    public static void main(String[] args) {
        int[] array = {8, 11, 3, 50, 9, 22, 13, 14, 20, 22, 12, 44, 90};
        BinarySearchTree bst = new BinarySearchTree(array);
        Trees.preTraverse(bst.getRoot());
        Trees.middleTraverse(bst.getRoot());
        Trees.backTraverse(bst.getRoot());
    }
}
