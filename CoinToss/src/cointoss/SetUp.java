package cointoss;
import java.util.Random;
public class SetUp 

{
    Random number = new Random();
    private String SideUp;
    
    public void setSide()
    {
        int value = number.nextInt(2);
        if(value == 0)
            SideUp = "HEADS";
        else if(value == 1)
            SideUp = "TAILS";
    }
    
    public String toString()
    {
        return SideUp; 
    }










}
