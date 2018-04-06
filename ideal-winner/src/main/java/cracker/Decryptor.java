/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracker;

import java.util.List;

/**
 *
 * @author gersc
 */
public class Decryptor {
    
    public String decrypt( String text, Key key ) {
        
        List<KeyLetter> keyList = key.getKeyList();
        for(KeyLetter tempKey : keyList){
            text = text.replace((""+tempKey.getA()).toUpperCase() , ""+tempKey.getB());
        }
            
        
        return text;
    }
    
}
