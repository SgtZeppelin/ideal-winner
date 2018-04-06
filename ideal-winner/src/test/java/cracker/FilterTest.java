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
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gersc
 */
public class FilterTest {
    
    public FilterTest() {
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
     * Test of deleteSpecialCharacters method, of class Filter.
     */
    @Test
    public void testDeleteSpecialCharacters() {
        Filter filter = new Filter();
        List<LetterNumberPair> letterNumberPairsList = new ArrayList<>();
        letterNumberPairsList.add( new LetterNumberPair( 'a', 10 ));
        letterNumberPairsList.add( new LetterNumberPair( ' ', 10 ));
        letterNumberPairsList.add( new LetterNumberPair( 'c', 10 ));
        letterNumberPairsList.add( new LetterNumberPair( '#', 10 ));
        letterNumberPairsList.add( new LetterNumberPair( 'k', 10 ));
        
        assertTrue( filter.deleteSpecialCharacters( letterNumberPairsList ).size() == 3 );
    }
    
}
