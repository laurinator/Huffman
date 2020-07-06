package Huffman;

public class Main {

    public static void main(String[] args){

        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode big = new TreeNode(5, left, right);

        System.out.println(big.getRight().value);

    }

}