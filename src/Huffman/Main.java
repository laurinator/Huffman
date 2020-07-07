package Huffman;

import java.util.Objects;

public class Main {

    public static void main(String[] args){

        String inputText = "Sees saas";

        for (int i = 0; i < inputText.length(); i++){
            System.out.print((int) inputText.charAt(i) + " ");
        }
        System.out.println();

        PairHandler pairHandler = new PairHandler();
        pairHandler.addText(inputText);
        System.out.println("FINAL TABLE");
        pairHandler.printTable();

    }

}