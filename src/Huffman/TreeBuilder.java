package Huffman;

import java.util.ArrayList;

public class TreeBuilder {

    private TreeNode tree;
    private EncodingTable table;

    public void buildTable(){
        table = new EncodingTable();
        table.buildFromTree(tree);
    }

    public void buildHuffmanTree(String text){
        PairHandler pairHandler = new PairHandler();
        pairHandler.addText(text);
        buildHuffmanTree(pairHandler.toTreeNodes());
    }

    public void buildHuffmanTree(ArrayList<TreeNode> list){

        while(list.size() > 2){
            int indexSmallest = findIndexOfSmallestValue(list);
            TreeNode smallest = list.get(indexSmallest);
            list.remove(indexSmallest);

            int indexSecondSmallest = findIndexOfSmallestValue(list);
            TreeNode secondSmallest = list.get(indexSecondSmallest);
            list.remove(indexSecondSmallest);

            TreeNode newNode = new TreeNode((smallest.value + secondSmallest.value), secondSmallest, smallest);
            newNode.character = (char) 45;
            list.add(newNode);
        }

        if(list.get(0).value > list.get(1).value){
            tree = new TreeNode(list.get(0).value + list.get(1).value, list.get(0), list.get(1));
        } else {
            tree = new TreeNode(list.get(0).value + list.get(1).value, list.get(1), list.get(0));
        }
        tree.character = (char) 45;

    }

    public TreeNode getTree() {
        return tree;
    }

    public int findIndexOfSmallestValue(ArrayList<TreeNode> list){

        int lowest = Integer.MAX_VALUE;
        int indexOfLowest = -1;

        for(int i = 0; i < list.size(); i++){
            TreeNode node = list.get(i);
            if(node.getValue() < lowest){
                lowest = node.getValue();
                indexOfLowest = i;
            }
        }

        ArrayList<TreeNode> draws = new ArrayList<TreeNode>();
        ArrayList<Integer> depths = new ArrayList<Integer>();
        ArrayList<Integer> indexes = new ArrayList<Integer>();

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).value == lowest){
                draws.add(list.get(i));
                depths.add(list.get(i).maxDepth());
                indexes.add(i);
            }
        }

        if(draws.size() > 1) {

            int highestDepth = Integer.MIN_VALUE;
            int indexOfHighestDepth = 0;

            for(int i = 0; i < draws.size(); i++){
                if(depths.get(i) > highestDepth){
                    highestDepth = depths.get(i);
                    indexOfHighestDepth = i;
                }
            }

            return indexes.get(indexOfHighestDepth);
        }


        return indexOfLowest;

    }

}
