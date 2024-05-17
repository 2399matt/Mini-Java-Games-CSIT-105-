package cointoss;

public class Player 
{
    private int score1;
    private int score2;
    
    public Player(int newPlayer1,int newPlayer2)
    {
        score1 = newPlayer1;
        score2 = newPlayer2;
    }
    
    public void setScoreOne()
    {
       score1 +=1; 
    }
    public void setScoreTwo()
    {
       score2 +=1; 
    }
    public void badGuessOne()
    {
       if(score1>0)
           score1 = score1-1;
    }
    public void badGuessTwo()
    {
       if(score2>0)
           score2 = score2-1;
    }
    public int getScoreOne()
    {
        return score1;
    }
    public int getScoreTwo()
    {
        return score2;
    }

}
