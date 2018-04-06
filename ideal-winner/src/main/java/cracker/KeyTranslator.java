/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracker;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gersc
 */
public class KeyTranslator {
    
    public Key translate( List<LetterNumberPair> letterNumberPairList ) {
        
        String letterFrequencies = "enisratdhulcgmobwfkzpvjyxq";
        List<KeyLetter> keyLetterList = new ArrayList<>();
        int index = 0;
        for(LetterNumberPair pair : letterNumberPairList){
            keyLetterList.add( new KeyLetter( pair.getLetter(), letterFrequencies.charAt( index )));
            index++;
        }
        
        Key key = new Key( keyLetterList );
        return key;
    }
  
}
