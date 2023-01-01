
/**
 * Name: <Jalena Austin>
 * <HW2>.java
 * 
 * Problem: <Create a program to run a 10000 games of craps and keeps a continuous count of wins and losses
 * alongside the probability from the amount of wins and losses to be put into a fractional form.>
 *
 * Certification of Authenticity:
 * I certify that this lab/homework is entirely my own work.  
 * 
 */
public class HW2
{
    public static void main (String [] args)
    {
        Craps game = new Craps();
        game.playCraps();
        
        int winsPoint = 0;
        int lossPoint = 0;
        double probabilityCount;
        
        for (int gameCount = 0; gameCount < 10000; ++gameCount) {
            if (game.playCraps() == 1) {
                winsPoint = winsPoint + 1;
                System.out.println("Wins: " + winsPoint);
            }
            else {
                lossPoint = lossPoint + 1;
                System.out.println("Losses: " + lossPoint);
            }
            
            probabilityCount = ((double)winsPoint / (double)(winsPoint + lossPoint)) * 100.0;
            System.out.print("Probability percentage of winning: ");
            System.out.printf("%.2f\n", probabilityCount);
            
            System.out.println("");

        }
    }
}
