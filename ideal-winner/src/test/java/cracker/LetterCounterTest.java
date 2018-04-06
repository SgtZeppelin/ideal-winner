/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracker;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author Flo
 */
public class LetterCounterTest {
    
    public LetterCounterTest() {
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
     * Test of count method, of class LetterCounter.
     */
    @org.junit.Test
    public void testCount() {
        LetterCounter countDooku = new RealLetterCounter();
        LetterNumberPair[] count = countDooku.count("a");
        assertTrue(count.length == 1);
        count = countDooku.count("aa");
        assertTrue(count.length == 1);
        count = countDooku.count("ab");
        assertTrue(count.length == 2);
        
        assertTrue(count[0].getLetter() == 'a');
        assertTrue(count[0].getNumber() == 1);
        
        assertTrue(count[1].getLetter() == 'b');
        assertTrue(count[1].getNumber() == 1);
        
        count = countDooku.count("Aa");
        
        assertTrue(count[0].getLetter() == 'a');
        assertTrue(count[0].getNumber() == 2);
                
    
    }
    
}
