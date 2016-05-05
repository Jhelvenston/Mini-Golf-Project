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
    
    //enterScore: test legal values
    @Test
    public void enterScoreValidTest(){
        String testVals[] = { "2","3","4","5" };
        
        Round r = new Round();
        
        for( int i = 0; i < testVals.length; ++i )
        {
            try{
                r.enterScore( testVals[i] );
            } catch ( Exception e )
            {
                fail( "Caught exception" + e );
            }
        }
    }
    
    //enterScore: test boundary values
    @Test
    public void enterScoreBoundaryTest(){
        String testVals[] = { "1","999" };
        
        Round r = new Round();
        
        for( int i = 0; i < testVals.length; ++i )
        {
            try{
                r.enterScore( testVals[i] );
            } catch ( Exception e )
            {
                fail( "Caught exception" + e );
            }
        }
    }
    
    //enterScore: test illegal values
    @Test
    public void enterScoreInvalidTest(){
        String bigInt = "" + (1L + Integer.MAX_VALUE);
        String testVals[] = { "-1","0","100000","2.5","Hello",bigInt };
        
        Round r = new Round();
        
        for( int i = 0; i < testVals.length; ++i )
        {
            try{
                r.enterScore( testVals[i] );
            } catch ( IllegalArgumentException e ) {
                System.out.println( "Yep, that's an illegal argument" );
            } catch ( Exception e ) {
                fail( "Should have thrown IllegalArgumentExcept, not " + e );
            }
        }
    }
    
    //displayScore: test illegal values
    @Test
    public void displayScoreInvalidTest(){
        String bigInt = "" + (1L + Integer.MAX_VALUE);
        String testVals[] = { "2.5","Hello",bigInt };
        
        CardStation cs = new CardStation();
        
        for( int i = 0; i < testVals.length; ++i )
        {
            try{
                int testScore = Integer.valueOf( testVals[i] );
                cs.displayScore( testScore );
            } catch ( IllegalArgumentException e ) {
                System.out.println( "Yep, that's an illegal argument" );
            } catch ( Exception e ) {
                fail( "Should have thrown IllegalArgumentExcept, not " + e );
            }
        }
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
    }

    /**
     * Test of enterScore method, of class Round.
     */
    @Test
    public void testEnterScore() {
        System.out.println("enterScore");
        Round instance = new Round();
        instance.enterScore( "0" );
    }

    /**
     * Test of scoreDetail method, of class Round.
     */
    @Test
    public void testScoreDetail() {
        System.out.println("scoreDetail");
        Round instance = new Round();
        int[] expResult = {0};
        int[] result = instance.scoreDetail();
        assertNotNull( result );
        assertArrayEquals(expResult, result);
    }
    
}