/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author gersc
 */
public class Mutator {
    
    public Key shake( Key key ) {
        
        key = cloneKey( key );
        
        int keySize = key.getKeyList().size();
        Random random = new Random();
        int randomTarget = random.nextInt( keySize );
        int secondTarget;
        if (random.nextBoolean()) {
            secondTarget = randomTarget + getJumpSize( keySize );
        }
        else {
            secondTarget = randomTarget - getJumpSize( keySize );
        }
        
        if ( secondTarget >= keySize ) {
            secondTarget %= keySize;
        }
        if ( secondTarget < 0 ) {
            secondTarget = secondTarget * -1;
        }
        
        KeyLetter keyLetter1 = key.getKeyList().get( randomTarget );
        KeyLetter keyLetter2 = key.getKeyList().get( secondTarget );
            
        char b1 = keyLetter1.getB();
        keyLetter1.setB(keyLetter2.getB());
        keyLetter2.setB(b1);
        
        return key;
    }
    
    private int getJumpSize( int keySize ) {
        
        Random random = new Random();
        
        switch(random.nextInt(10)) {
            case 0:
            case 1:
            case 2:
            case 3: return 1;
            case 4:
            case 5: return random.nextInt(2)+2;
            case 6:
            case 7:
            case 8: return random.nextInt(5)+3;
            case 9:
            case 10: return random.nextInt( keySize );
            
            default: return 1;
        }
    }
    
    private Key cloneKey( Key key ) {
        
        List<KeyLetter> clonedKeyList = new ArrayList<>();
        
        for( KeyLetter keyletter : key.getKeyList() ) {
            clonedKeyList.add( new KeyLetter(keyletter.getA(), keyletter.getB()));
        }
        
        return new Key( clonedKeyList );
        
    }
    
}
