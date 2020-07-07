package Huffman;

public class LetterCountPair {

    private char letter;
    private int count;

    public  LetterCountPair(char letter, int count){
        this.letter = letter;
        this.count = count;
    }

    public int getNumber() {
        return count;
    }

    public char getLetter() {
        return letter;
    }

    public void addToCount(){
        count++;
    }

    @Override
    public String toString(){
        return letter + "(" + (int)letter + ")" + " : " + count;
    }
}
