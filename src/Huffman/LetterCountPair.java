package Huffman;

public class LetterCountPair {

    private String letter;
    private int count;

    public  LetterCountPair(String letter, int count){
        this.letter = letter;
        this.count = count;
    }

    public int getNumber() {
        return count;
    }

    public String getLetter() {
        return letter;
    }

    public void addToCount(){
        count++;
    }
}
