/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minigolftests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author James
 */
public class RoundTest {
    
    public RoundTest() {
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
     * Test of currentScore method, of class Round.
     */
    @Test
    public void testCurrentScore() {
        System.out.println("currentScore");
        Round instance = new Round();
        int expResult = 0;
        int result = instance.currentScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of holesPlayed method, of class Round.
     */
    @Test
    public void testHolesPlayed() {
        System.out.println("holesPlayed");
        Round instance = new Round();
        int expResult = 0;
        int result = instance.holesPlayed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enterScore method, of class Round.
     */
    @Test
    public void testEnterScore() {
        System.out.println("enterScore");
        Round instance = new Round();
        instance.enterScore( 0 );
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of scoreDetail method, of class Round.
     */
    @Test
    public void testScoreDetail() {
        System.out.println("scoreDetail");
        Round instance = new Round();
        int[] expResult = null;
        int[] result = instance.scoreDetail();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}