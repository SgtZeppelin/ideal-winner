/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracker;

/**
 *
 * @author gersc
 */
public class LetterNumberPair implements Comparable<LetterNumberPair> {
    private char letter;
    private int number;

    public LetterNumberPair(char letter, int number) {
        this.letter = letter;
        this.number = number;
    }

    public char getLetter() {
        return letter;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "LetterNumberPair{" + "letter=" + letter + ", number=" + number + '}';
    }

    @Override
    public int compareTo(LetterNumberPair o) {
        if(this.getNumber()>o.getNumber())
            return 1;
        else if(this.getNumber()<o.getNumber())
            return -1;
        else
            return 0;
    }
    
    
    
}
