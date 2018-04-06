/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Flo
 */
public class RealLetterCounter implements LetterCounter {

    @Override
    public LetterNumberPair[] count(String text) {

        text = text.toLowerCase();

        List<LetterNumberPair> pairList = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {

            char letter = text.charAt(i);
            
            if ( this.isLetterInList( letter, pairList ) ) {
                LetterNumberPair localPair = this.getLetterNumberPair( letter, pairList );
                localPair.setNumber( localPair.getNumber() + 1 );
            }
            else {
                pairList.add( new LetterNumberPair( letter, 1 ) );
            }

        }
        
        Collections.sort(pairList);
        return (LetterNumberPair[]) pairList.toArray( new LetterNumberPair[pairList.size()] );
    }

    private boolean isLetterInList(char letter, List<LetterNumberPair> pairList) {

        for (LetterNumberPair pair : pairList) {
            if (pair.getLetter() == letter) {
                return true;
            }

        }
        return false;
    }
    
    private LetterNumberPair getLetterNumberPair(char letter, List<LetterNumberPair> pairList ) {
        
        for ( LetterNumberPair pair : pairList ) {
            if (pair.getLetter() == letter) {
                return pair;
            }
        }
        return null;
    }

}
