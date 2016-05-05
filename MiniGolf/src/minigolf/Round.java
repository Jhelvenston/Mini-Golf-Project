/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minigolf;

/**
 *
 * @author Dan
 */
public class Round {
    static int score=0;
    static int scoreInput=0;
    short numOfPlayers=1;
    int[] player=null;
    int[] strokesPerHole = null;
    static  short holeNumber=0;
    final short NUM_OF_HOLES_ON_COURSE=18;
    /**
     * @param args the command line arguments
     */
    
    static public int currentScore(){
        score+=scoreInput;
        return score;
    }
    
    static public int numberOfHolesPlayed(){
        int holesPlayed=0;
        holesPlayed=holeNumber;
        return holesPlayed;
    }
    
    static public void enterScore(int strokes){
        holeNumber+=1; 
    }
    int[] scoreDetail(){
        
        strokesPerHole[holeNumber]=scoreInput;
        return strokesPerHole;
    }
}
