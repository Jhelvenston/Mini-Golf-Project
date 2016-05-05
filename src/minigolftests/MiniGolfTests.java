package minigolftests;

/**
 *
 * @author James Helvenston, Mark Helvenston, Daniel Matheny
 */
public class MiniGolfTests {
    public static void main(String[] args) {
        Round r = new Round();
        CardStation cs = new CardStation();
        
        int score = r.currentScore();
        cs.displayScore( score );
    }
    
}

class Round {
    int strokes = 0;
    int[] par = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
    int[] scoreForEachHole = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int currentHole = 0;
    int playerScore = 0;
    
    public int currentScore(){
        int hole = holesPlayed();
        int score = scoreForEachHole[hole] - par[hole];
        return score;
    }
    
    public int holesPlayed(){
        return currentHole;
    }
    
    public void enterScore( String strokesInput ){
        int strokes = Integer.valueOf( strokesInput );
        
        if( strokes > 999 || strokes < 1 )
        {
            System.out.println( "Yep, that's an illegal argument (from within the method)" );
        }
        else
        {
            currentHole++;
        }
    }
    
    public int[] scoreDetail(){
        int i[] = {0};
        return i;
    }
    
    public String getPlayerName(){
        String name = "Name";
        return name;
    }
    
    public String getCourseName(){
        String name = "Name";
        return name;
    }
}

class CardStation{
    public void displayScore( int score ){
        System.out.println( "The current score is " + score );
    }
}