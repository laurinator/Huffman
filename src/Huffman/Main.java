package Huffman;

import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args){

        String inputText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse dignissim eros mi, quis blandit lectus vulputate eu. Nunc varius diam rhoncus maximus ultrices. In tincidunt nisl ut felis posuere, eu porttitor diam ullamcorper. In hac habitasse platea dictumst. Fusce id tellus auctor, accumsan massa quis, aliquam lectus. Nam varius turpis sit amet dictum sodales. Nam et magna vel elit fringilla laoreet at ut lorem. Maecenas libero ipsum, rhoncus at ultricies sed, elementum et ante. Nullam diam libero, luctus sed imperdiet in, convallis sed nunc. Nam tristique, mi fringilla suscipit bibendum, libero nunc scelerisque diam, vel egestas elit erat sit amet.";

        /*
        for (int i = 0; i < inputText.length(); i++){
            System.out.print((int) inputText.charAt(i) + " ");
        }
        System.out.println();
         */

        TreeBuilder treeBuilder = new TreeBuilder();
        treeBuilder.buildHuffmanTree(inputText);
        System.out.println(treeBuilder.getTree());

    }

}