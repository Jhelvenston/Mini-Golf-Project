/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniGolf;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dan
 */
public class JUnitTestMiniGolf {
    
    public JUnitTestMiniGolf() {
    }
    
    /*@BeforeClass
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
    }*/
    
    @Test 
    public void testPadLegalInputs(){//should pass
       final Round r = new Round();
       r.enterScore=3;
    } 
    
    @Test ()
    public void testPadIllegalInputs() {
       final Round r = new Round();
        r.enterScore=0;  
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
