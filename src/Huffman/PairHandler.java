package Huffman;

import java.util.ArrayList;

public class PairHandler {

    private ArrayList<LetterCountPair> list = new ArrayList<LetterCountPair>();

    public PairHandler(){}

    //Adds every letter in the text to database
    public void addText(String text){

        for(int i = 0; i < text.length(); i++){

            addLetter(text.charAt(i));

        }

    }

    public void populate(){
        for (int i = 0; i < 200; i++){
            list.add(new LetterCountPair((char)i, 0));
        }
    }

    public void addLetter(char letter){

        if(list.size() == 0){
            list.add(new LetterCountPair(letter, 1));
            return;
        }

        if(letter < list.get(0).getLetter()){
            list.add(0, new LetterCountPair(letter, 1));
            return;
        }

        for (LetterCountPair letterCountPair : list) {
            if (letterCountPair.getLetter() == letter) {
                letterCountPair.addToCount();
                return;
            }
        }

        //add new entry
        int index = 0;
        for(int i = 0; i < list.size(); i++){
            if(letter > list.get(i).getLetter()){
                index = i;
            }
        }
        list.add(index, new LetterCountPair(letter, 1));

    }

    public void printTable(){

        for(LetterCountPair pair : list){
            System.out.println(pair);
        }

    }

    public ArrayList<TreeNode> toTreeNodes(){

        ArrayList<TreeNode> ans = new ArrayList<TreeNode>();

        for(LetterCountPair letterCountPair : list){
            ans.add(new TreeNode(letterCountPair.getNumber(), letterCountPair.getLetter()));
        }

        return ans;
    }

}
