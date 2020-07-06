package Huffman;

public class TreeNode {

    public int value;
    public  boolean isLeaf;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int value){

        this.value = value;
        left = null;
        right = null;
        isLeaf = true;

    }

    public TreeNode(int value, TreeNode left, TreeNode right){

        this.value = value;
        this.left = left;
        this.right = right;
        isLeaf = false;

    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
}