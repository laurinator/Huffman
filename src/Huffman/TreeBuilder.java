package Huffman;

import java.util.ArrayList;

public class TreeBuilder {

    public static TreeNode buildHuffmanTree(ArrayList<TreeNode> list){
        //TODO: finish
        while(list.size() > 2){

        }
        return null;
    }

    public static int findIndexOfSmallestValue(ArrayList<TreeNode> list){

        int lowest = Integer.MAX_VALUE;
        int indexOfLowest = -1;

        for(int i = 0; i < list.size(); i++){
            TreeNode node = list.get(i);
            if(node.getValue() < lowest){
                lowest = node.getValue();
                indexOfLowest = i;
            }
        }
        return indexOfLowest;

    }

    public static int findIndexOfSecondSmallestValue(ArrayList<TreeNode> list){
        int index = findIndexOfSmallestValue(list);
        TreeNode temp = list.get(index);
        list.remove(index);

        int returnIndex = findIndexOfSmallestValue(list);
        list.add(temp);
        return returnIndex;
    }

}
