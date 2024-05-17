package TICCC;

import java.util.*;

public class TICCC 
{

    public static void main(String[] args) 
    {
        
        Scanner keyboard = new Scanner(System.in);
        char player1 = 'X';
        char player2 = 'O';
        final int ROW = 9;
        int currentSpot;

        String[] gameboard = new String[ROW];
        
        for (int i = 0; i < ROW; i++) 
        {
            gameboard[i] = "-";
        }
        Toe Game = new Toe(gameboard);

        do 
        {
            
            for (int i = 0; i < ROW; i++) 
            {

                System.out.print(gameboard[i] + " ");
                if (i == 2) 
                {
                    System.out.println();
                }
                if (i == 5) 
                {
                    System.out.println();
                }
                
            }
            System.out.println("\tX or O: \n");
            String str = keyboard.nextLine();

            if (str.equalsIgnoreCase("X")) 
            {
                System.out.printf("\n%c turn, choose your spot(0-9): ", player1);
                currentSpot = keyboard.nextInt();
                if (gameboard[currentSpot].equals("-")) 
                {
                    gameboard[currentSpot] = "X";
                } 
                else 
                {
                    System.out.printf("\nAlready taken. %c turn, choose your spot(0-9): ", player2);
                    currentSpot = keyboard.nextInt();
                    gameboard[currentSpot] = "O";
                }
            } 
            else if (str.equalsIgnoreCase("O")) 
            {
                System.out.printf("\n%c turn, choose your spot(0-9): ", player2);
                currentSpot = keyboard.nextInt();
                if (gameboard[currentSpot].equals("-")) 
                {
                    gameboard[currentSpot] = "O";
                } 
                else 
                {
                    System.out.printf("\nAlready taken. %c turn, choose your spot(0-9): ", player2);
                    currentSpot = keyboard.nextInt();
                    gameboard[currentSpot] = "O";
                }
            }
            Game.winChecker();
            Game.tieCheck();

        } while (Game.winChecker()&&Game.tieCheck());

    }
}
