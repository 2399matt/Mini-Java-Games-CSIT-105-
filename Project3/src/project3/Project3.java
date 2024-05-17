package project3;
import java.util.*;
//Matthew Witham

public class Project3 
{

    public static void main(String[] args) 
    {
        
        Grid game = new Grid();
        Scanner kyb = new Scanner(System.in);
        String str;
        char chr;
        int daisies = 0;
        int gathered = 0;
        int jumps = 0;
        int totalDaisies = 0;

        System.out.printf("You are in spot [%d, %d] %nThere are %d daisies located here%n"
                , game.getCurrentRow(), game.getCurrentCol(), game.getCurrentValue());
        
        System.out.printf("%nYou currently have a total of %d daisies.%n", totalDaisies);

        System.out.print("What would you like to do? (G, J, N, S, E, W, M, Q): ");
        str = kyb.nextLine();
        chr = str.charAt(0);

        while (chr != 'Q' && chr != 'q') 
        {
            if (chr == 'G' || chr == 'g') 
            {
                daisies = game.gatherDaisies();
                System.out.printf("%nYou just gathered %d daisies from this spot!%n",daisies);
                totalDaisies +=daisies;
                gathered++;
                
            }
            if (chr == 'J' || chr == 'j') 
            {
                game.jump();
                jumps++;
            }
            if (chr == 'N' || chr == 'n') 
            {
                game.goNorth();
            }
            if (chr == 'S' || chr == 's') 
            {
                game.goSouth();
            }
            if (chr == 'E' || chr == 'e') 
            {
                game.goEast();
            }
            if (chr == 'W' || chr == 'w') 
            {
                game.goWest();
            }
            if (chr == 'M' || chr == 'm') 
            {
                System.out.print("\nMap of grid:\n"+game.toString());
            }

            System.out.printf("%nYou are in spot [%d, %d] %nThere are %d daisies located here%n"
                    , game.getCurrentRow(), game.getCurrentCol(), game.getCurrentValue());
            
            System.out.printf("%nYou currently have a total of %,d daisies.%n", totalDaisies);
            System.out.print("What would you like to do? (G, J, N, S, E, W, M, Q):");
            str = kyb.nextLine();
            chr = str.charAt(0);

        }

        System.out.printf("%nYou gathered %,d daises! %nYou did in %d jumps and "
         + "%d number of gatherings.", totalDaisies, jumps, gathered);
        
    }

}
