package cointoss;
import java.util.Scanner;
public class CoinToss 

{

    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        String guess;
        String guess2;
        int playerOne = 0;
        int playerTwo = 0;
        SetUp game = new SetUp();
        Player oof = new Player(playerOne,playerTwo);
        
        while(oof.getScoreOne()<5 && oof.getScoreTwo()<5)
        {
            System.out.print("Player one guess (heads/tails): ");
            guess = keyboard.nextLine();
            System.out.print("Player two guess (heads/tails): ");
            guess2 = keyboard.nextLine();
            
            game.setSide();
            
            if(game.toString().equalsIgnoreCase("HEADS"))
            {
                if(guess.equalsIgnoreCase("heads"))
                {
                    oof.setScoreOne();
                    System.out.print("Player 1 scores! ");
                }
                    else if(guess.equalsIgnoreCase("tails"))
                    {
                        oof.badGuessOne();
                        System.out.print("Bad guess player 1! \n");
                    }
                
                if(guess2.equalsIgnoreCase("heads"))
                {
                    oof.setScoreTwo();  
                    System.out.print("Player 2 scores! ");
                }
                    else if(guess2.equalsIgnoreCase("tails"))
                    {
                        oof.badGuessTwo();
                        System.out.print("Bad guess Player 2! \n");
                    }
            }
            
            if(game.toString().equalsIgnoreCase("tails"))
            {
                if(guess.equalsIgnoreCase("tails"))
                {
                    oof.setScoreOne();
                    System.out.print("Player 1 scores! ");
                }
                    else if(guess.equalsIgnoreCase("heads"))
                    {
                        oof.badGuessOne();
                        System.out.print("Bad guess Player 1! \n");
                    }
                if(guess2.equalsIgnoreCase("tails"))
                {
                    oof.setScoreTwo();  
                    System.out.print("Player 2 scores! ");
                }
                    else if(guess2.equalsIgnoreCase("heads"))
                    {
                        oof.badGuessTwo();
                        System.out.print("Bad guess Player 2! \n");
                    }
            }
            System.out.print("\nIt was: "+game.toString()+"\n");
            System.out.print("Current scores:\nplayer one: "+oof.getScoreOne()+"\nplayer two: "+oof.getScoreTwo()+"\n\n");
        
        }
        
        if(oof.getScoreOne() == 5 && oof.getScoreTwo()<5)
            System.out.print("\n Game over! Player 1 wins!");
        else if (oof.getScoreTwo()==5&&oof.getScoreOne()<5)
            System.out.print("\n Game over! Player 2 wins!");
        else if(oof.getScoreOne()==5&&oof.getScoreTwo()==5)
            System.out.print("\n Game over! Tie! \n");
            
        
            
    }
    
}
