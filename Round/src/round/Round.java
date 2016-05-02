/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round;

/**
 *
 * @author thomas
 */
public class Round 
{
   public int currentScore()
   {
       //cuurentScore method will calculate the players score so far
       //(above or below par).
       
       //above par - anything above the maximum number of attempts on a hole
       
       //below par - anything below the minimum number of attempts on a hole
       
       //to get users current score:
       //we need to count up the number of pars for holes played: i.e. hole one
       // is a par 4, hole two is a par 3 so total is 7 pars played so far....
       
       //holesPlayed - used to get the number of holes played
       int holesPlayed;
       
       //this will be used to help calculate the users current score.
       int parTotal;
       
       //this will be used to add up all strokes a customer has done up to a hole
       //at this point if the customer has lets say 6 strokes on the first two
       //holes and the total combined par is 7 for the first two holes, then the user 
       //is -1 under par.
       int attemptsPerHole;
       
       
       
       return 0;
   }
   
   public int numberOfHolesPlayed()
   {
       //This method will need to calculate how many holes have been played
       
       return 0;
   }
   
   public void enterScore(int strokes)
   {
       //this method takes in 'int strokes' which is the number of times
       //a player took to make the ball in.
       
       //numberOfSwings is storing total attempts for 1 hole.
       int numberOfSwings = strokes;
       
       
       
   }
   
   public int[] scoreDetail()
   {
       int[] madeUp = {};
      return madeUp;
   }
}
