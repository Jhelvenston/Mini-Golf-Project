/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minigolftests;

/**
 *
 * @author James
 */
public class MiniGolfTests {
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Round {
    int strokes = 0;
    int[] par = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
    int[] scoreForEachHole = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int currentHole = 1;
    int playerScore = 0;

    public int currentScore(){
        System.out.println("Current score is currently: " + playerScore);
        return 0;
    }
    
    public int holesPlayed(){
        return 0;
    }
    
    public void enterScore( int strokes ){
        
    }
    
    public int[] scoreDetail(){
        int i[] = {0};
        return i;
    }
}