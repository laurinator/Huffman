package Huffman;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TreeNode {

    public int value;
    public char character;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int value){

        this.value = value;
        character = 0;
        left = null;
        right = null;

    }

    public TreeNode(int value, char character){
        this.character = character;
        this.value = value;
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

    private int maxDepth(TreeNode node) {
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

    public StringBuilder toString(StringBuilder prefix, boolean isTail, StringBuilder sb) {
        if(right!=null) {
            right.toString(new StringBuilder().append(prefix).append(isTail ? "│   " : "    "), false, sb);
        }
        sb.append(prefix).append(isTail ? "└── " : "┌── ").append(value).append(" : ").append(character).append("\n");
        if(left!=null) {
            left.toString(new StringBuilder().append(prefix).append(isTail ? "    " : "│   "), true, sb);
        }
        return sb;
    }

    @Override
    public String toString() {
        return this.toString(new StringBuilder(), true, new StringBuilder()).toString();
    }
}