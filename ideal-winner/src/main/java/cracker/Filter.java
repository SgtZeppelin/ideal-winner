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
 * @author Flo
 */
public class Filter {
    
    public List<LetterNumberPair> deleteSpecialCharacters(List<LetterNumberPair> unfilteredList){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        List<LetterNumberPair> filteredList = new ArrayList<>();
        for(LetterNumberPair pair : unfilteredList){
            if(alphabet.contains(""+pair.getLetter()))
                filteredList.add(pair);
        }
        return filteredList;
    }
}
