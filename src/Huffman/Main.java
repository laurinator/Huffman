package Huffman;

import java.util.Objects;

public class Main {

    public static void main(String[] args){

        String inputText = "Sees saas soos meem scheesch";

        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode big = new TreeNode(5, left, right);
        big.right.setRight(new TreeNode(6));
        big.right.right.setRight(new TreeNode(10));

        System.out.println(big.maxDepth());

    }

}