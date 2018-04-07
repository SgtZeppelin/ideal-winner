/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracker;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Flo
 */
public class KeyTranslatorTest {
    
    public KeyTranslatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of translate method, of class KeyTranslator.
     */
    @Test
    public void testTranslate() {
        KeyTranslator keyTranslator = new KeyTranslator();
        List<LetterNumberPair> list = new ArrayList<>();
        list.add(new LetterNumberPair('a', 98));
        list.add(new LetterNumberPair('b', 89));
        list.add(new LetterNumberPair('c', 78));
        list.add(new LetterNumberPair('d', 69));
        list.add(new LetterNumberPair('e', 45));
        Key key = keyTranslator.translate(list);
        assertTrue(key.getKeyList().get(0).getA() == 'a');
        assertTrue(key.getKeyList().get(0).getB() == 'e');
        assertTrue(key.getKeyList().get(1).getA() == 'b');
        assertTrue(key.getKeyList().get(1).getB() == 'n');
        assertTrue(key.getKeyList().get(2).getA() == 'c');
        assertTrue(key.getKeyList().get(2).getB() == 'i');
        assertTrue(key.getKeyList().get(3).getA() == 'd');
        assertTrue(key.getKeyList().get(3).getB() == 's');
        assertTrue(key.getKeyList().get(4).getA() == 'e');
        assertTrue(key.getKeyList().get(4).getB() == 'r');
        
    }
    
}
