/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minigolf;

import java.util.ArrayList;

/**
 *
 * @author Dan
 */
public class Round {
    int[] score=null;
    int scoreInput=0;
    int[] player=null;
    short numOfPlayers=1;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    //This will keep track of the scores
    
    public int currentScore(){
        int score=0;
        
        return score;
    }
    
    public int numberOfHolesPlayed(){
        int holesPlayed=0;
        
        return holesPlayed;
    }
    
    public void enterScore(int strokes){
        int scoreInput=0;
        score[player[numOfPlayers-1]]+=scoreInput;
          
    }
    
    int[] scoreDetail(){
        int[] strokesPerHole = null;
        
        return strokesPerHole;
    }
}
