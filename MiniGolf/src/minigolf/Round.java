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
    int score=0;
    int scoreInput=0;
    short numOfPlayers=1;
    int[] player=null;
    int[] strokesPerHole = null;
    static  short holeNumber=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    holeNumber+=1;   
        
        
    }
    //This will keep track of the scores
    
    public int currentScore(){
        score+=scoreInput;
        return score;
    }
    
    public int numberOfHolesPlayed(){
        int holesPlayed=0;
        holesPlayed=holeNumber;
        return holesPlayed;
    }
    
    public void enterScore(int strokes){
        
        
          
    }
    
    int[] scoreDetail(){
        
        strokesPerHole[holeNumber]=scoreInput;
        return strokesPerHole;
    }
}
