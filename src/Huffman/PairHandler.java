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

    public void addLetter(char letter){

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("NEW TABLE, active letter: " + letter);
        printTable();

        if(list.size() == 0){
            list.add(new LetterCountPair(letter, 1));
            return;
        }

        if(letter < list.get(0).getLetter()){
            System.out.println("Catch, letter is \"" + letter + "\"");
            System.out.println((int)list.get(0).getLetter() + " " + (int)letter);

            list.add(0, new LetterCountPair(letter, 1));
            return;
        }

        for(int i = 0; i < list.size(); i++){
            System.out.println("Next comparison: " + (int)list.get(i).getLetter() + " < " + (int)letter);
            if(list.get(i).getLetter() == letter){
                System.out.println("success453tz45b065496bunß425b6790ubb67n");
                list.get(i).addToCount();
                return;
            } else {
                if (list.get(i).getLetter() > letter) {
                    System.out.println("New letter not at the beginning found");
                    //letter not in list, create new entry
                    LetterCountPair newEntry = new LetterCountPair(letter, 1);
                    list.add(i, newEntry);
                    return;
                } else {
                    System.out.println("Not new, but also not added------------------------------");
                }
            }
        }
        System.out.println("should be unreachable");

    }

    public void printTable(){

        for(LetterCountPair pair : list){
            System.out.println(pair);
        }

    }

}
