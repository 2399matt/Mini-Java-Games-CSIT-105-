package TICCC;

/**
 *
 * @author skate
 */
public class Toe 

{
    private String gameboard[];
    
    public Toe(String[] newGameboard)
    {
        gameboard = newGameboard;
    }
    
    public boolean winChecker()
    {
        int ROW = 9;
        boolean go = true;
        for (int i = 0; i < gameboard.length; i++) 
            {
                switch (i) 
                {
                    case 0: 
                    {
                        String Line = gameboard[0] + gameboard[1] + gameboard[2];
                        if (Line.equals("XXX") || Line.equals("OOO")) 
                        {
                            System.out.println("\nGame over!");
                            for (int j = 0; j < ROW; j++) 
                            {
                                System.out.print(gameboard[j] + " ");
                                if (j == 2) 
                                {
                                    System.out.println();
                                }
                                if (j == 5) 
                                {
                                    System.out.println();
                                }
                            }
                            go = false;
                        } 
                        else 
                        {
                            break;
                        }

                    }
                    case 1: 
                    {
                        String Line = gameboard[3] + gameboard[4] + gameboard[5];
                        if (Line.equals("XXX") || Line.equals("OOO")) 
                        {
                            System.out.println("\nGame over!");
                            for (int j = 0; j < ROW; j++) 
                            {
                                System.out.print(gameboard[j] + " ");
                                if (j == 2) 
                                {
                                    System.out.println();
                                }
                                if (j == 5) 
                                {
                                    System.out.println();
                                }
                            }
                            go = false;
                        } 
                        else 
                        {
                            break;
                        }
                    }
                    case 2: 
                    {
                        String Line = gameboard[6] + gameboard[7] + gameboard[8];
                        if (Line.equals("XXX") || Line.equals("OOO")) 
                        {
                            System.out.println("\nGame over!");
                            for (int j = 0; j < ROW; j++) 
                            {
                                System.out.print(gameboard[j] + " ");
                                if (j == 2) 
                                {
                                    System.out.println();
                                }
                                if (j == 5) 
                                {
                                    System.out.println();
                                }
                            }
                            go = false;
                        } else 
                        {
                            break;
                        }
                    }
                    case 3: 
                    {
                        String Line = gameboard[0] + gameboard[4] + gameboard[8];
                        if (Line.equals("XXX") || Line.equals("OOO")) 
                        {
                            System.out.println("\nGame over!");
                            for (int j = 0; j < ROW; j++) 
                            {
                                System.out.print(gameboard[j] + " ");
                                if (j == 2) 
                                {
                                    System.out.println();
                                }
                                if (j == 5) 
                                {
                                    System.out.println();
                                }
                            }
                            go = false;
                        } 
                        else 
                        {
                            break;
                        }
                    }
                    case 4: 
                    {
                        String Line = gameboard[2] + gameboard[4] + gameboard[6];
                        if (Line.equals("XXX") || Line.equals("OOO")) 
                        {
                            System.out.println("\nGame over!");
                            for (int j = 0; j < ROW; j++) 
                            {
                                System.out.print(gameboard[j] + " ");
                                if (j == 2) 
                                {
                                    System.out.println();
                                }
                                if (j == 5) 
                                {
                                    System.out.println();
                                }
                            }
                            go = false;
                        } 
                        else 
                        {
                            break;
                        }
                    }
                    case 5: 
                    {
                        String Line = gameboard[0] + gameboard[3] + gameboard[6];
                        if (Line.equals("XXX") || Line.equals("OOO")) 
                        {
                            System.out.println("\nGame over!");
                            for (int j = 0; j < ROW; j++) 
                            {
                                System.out.print(gameboard[j] + " ");
                                if (j == 2) {
                                    System.out.println();
                                }
                                if (j == 5) 
                                {
                                    System.out.println();
                                }
                            }
                            go = false;
                        } 
                        else 
                        {
                            break;
                        }
                    }
                    case 6: 
                    {
                        String Line = gameboard[1] + gameboard[4] + gameboard[7];
                        if (Line.equals("XXX") || Line.equals("OOO")) 
                        {
                            System.out.println("\nGame over!");
                            for (int j = 0; j < ROW; j++) 
                            {
                                System.out.print(gameboard[j] + " ");
                                if (j == 2) 
                                {
                                    System.out.println();
                                }
                                if (j == 5) 
                                {
                                    System.out.println();
                                }
                            }
                            go = false;
                        } 
                        else 
                        {
                            break;
                        }
                    }
                    case 7: 
                    {
                        String Line = gameboard[2] + gameboard[5] + gameboard[8];
                        if (Line.equals("XXX") || Line.equals("OOO")) 
                        {
                            System.out.println("\nGame over!");
                            for (int j = 0; j < ROW; j++) 
                            {
                                System.out.print(gameboard[j] + " ");
                                if (j == 2) 
                                {
                                    System.out.println();
                                }
                                if (j == 5) 
                                {
                                    System.out.println();
                                }
                            }
                            go = false;
                        } 
                        else 
                        {
                            break;
                        }
                    }
                    case 8: 
                    {
                        String Line = gameboard[0] + gameboard[1] + gameboard[2];
                        if (Line.equals("XXX") || Line.equals("OOO")) 
                        {
                            System.out.println("\nGame over!");
                            for (int j = 0; j < ROW; j++) 
                            {
                                System.out.print(gameboard[j] + " ");
                                if (j == 2) 
                                {
                                    System.out.println();
                                }
                                if (j == 5) 
                                {
                                    System.out.println();
                                }
                            }
                            go = false;
                        } 
                        else 
                        {
                            break;
                        }
                    }
                    default: 
                    {
                        go = true;
                        break;
                    }

                }

            }
        
    
        return go;
    
    }
    
    public boolean tieCheck()
    {
        int ROW = 9;
    
        boolean go = true;
        if     (!gameboard[0].equals("-") && !gameboard[1].equals("-")
             && !gameboard[2].equals("-") && !gameboard[3].equals("-")
             && !gameboard[4].equals("-") && !gameboard[5].equals("-")
             && !gameboard[6].equals("-") && !gameboard[7].equals("-")
             && !gameboard[8].equals("-")) 
            {
                System.out.print("\nDRAW!!!\n");
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
                go = false;
    
    
            }
        return go;
    }
    













}
