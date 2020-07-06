package Huffman;

public class TreeNode {

    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int value){

        this.value = value;
        left = null;
        right = null;

    }

    public TreeNode(int value, TreeNode left, TreeNode right){

        this.value = value;
        this.left = left;
        this.right = right;

    }

    public boolean isLeaf(){
        return (left == null && right == null);
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

    public int maxDepth(){
        return maxDepth(this);
    }

    private int maxDepth(TreeNode node)
    {
        if (node == null)
            return 0;
        else
        {
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }


    @Override
    public String toString(){
        StringBuilder answer = new StringBuilder();

        //TODO: Implement method to print binary tree

        return answer.toString();
    }
}