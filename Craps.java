/**
 *  Name: <Jalena Austin>
 * <Craps>.java
 * 
 * Problem: <Creating a program to play the classical game of craps by using the program to associate the 
 * general rules for the game into code. This is done by use of if-else statments and relational between variables
 * to verify the workings of the game.>
 * 
 * Certification of Authenticity:
 * I certify that this lab/homework is entirely my own work.
 * 
 */
public class Craps
{
    private Die die1 = new Die();
    private Die die2 = new Die();
        
     public int playCraps()
    {
       int valDie1 = die1.roll();
       int valDie2 = die2.roll();
       int pointRoll = valDie1 + valDie2;
       int newRoll = 0;
       System.out.println("You rolled " + valDie1 + " and " + valDie2 + ".");
       
        if (pointRoll == 7 || pointRoll == 11) {
           return 1;
       }
       
       else if ((pointRoll == 2) || (pointRoll == 3) || (pointRoll == 12)) {
           return 0;    
       }
       
       else {
               while (newRoll != 7) {
                   if (pointRoll == newRoll){
                       return 1;
                }
                   valDie1 = die1.roll();
                   valDie2 = die2.roll();
                   newRoll = valDie1 + valDie2;
                   System.out.println("You rolled " + valDie1 + " and " + valDie2 + ".");
                
                    if (newRoll == 7) {
                        return 0;
                }
        }  
    } return 1;
}
}