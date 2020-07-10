package Huffman;

import java.util.ArrayList;

public class EncodingTable {

    private ArrayList<Entry> entries = new ArrayList<Entry>();

    public void buildFromTree(TreeNode tree) {
        //TODO: implement

    }

    public TreeNode[] traverse(TreeNode topNode){
        //TODO: implement
        return new TreeNode[0];
    }

    private class Entry{
        public char character;
        public byte[] code;

        public Entry(char character, byte[] code){
            this.character = character;
            this.code = code;
        }
    }


}
