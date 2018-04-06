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
public class DecryptorTest {
    
    public DecryptorTest() {
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

    @Test
    public void testSomeMethod() {
        Decryptor decor = new Decryptor();
        List<KeyLetter> keyList = new ArrayList();
        keyList.add(new KeyLetter('S','h'));
        keyList.add(new KeyLetter('X','a'));
        keyList.add(new KeyLetter('Z','l'));
        keyList.add(new KeyLetter('T','o'));                
        assertTrue(decor.decrypt( "SXZZT", new Key(keyList)).equals("hallo" ));
    }
    
}
