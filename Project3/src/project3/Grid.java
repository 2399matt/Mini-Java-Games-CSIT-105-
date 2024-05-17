package project3;

import java.util.Random;

public class Grid {

    private int[][] gameBoard;
    private int currentRow;
    private int currentCol;

    Random randomNumbers = new Random();

    private final int MAX_ELEMENT_VALUE = 1000;
    /**
        no-arg constructor - creates a 10x10 grid and sets random location
    */
    public Grid() 
    {
        gameBoard = new int[10][10];
        jump();
        populateBoard();
    }
    /**
        constructor  - creates a grid (newGridSize x newGridSize) and sets random location
        @param newGridSize is value to set for dimensions of grid
    */
    public Grid(int newGridSize) 
    {
        gameBoard = new int[newGridSize][newGridSize];
        populateBoard();
        jump();
    }
    /** 
         * private method populateBoard to set locations to random value
     */
    private void populateBoard() 
    {
        int row, col;
        row = gameBoard.length;
        col = gameBoard.length;

        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < col; j++) 
            {
                gameBoard[i][j] = randomNumbers.nextInt(MAX_ELEMENT_VALUE);
            }
        }
    }
    /**
        jump method sets random location
    */
    public void jump() 
    {
        currentRow = randomNumbers.nextInt(9);
        currentCol = randomNumbers.nextInt(9);
    }
    /**
        getCurrentRow method returns value in currentRow field
        @return value in currentRow field
    */
    public int getCurrentRow() 
    {
        return currentRow;
    }
    /**
        getCurrentCol method returns value in currentCol field
        @return value in currentCol field
    */
    public int getCurrentCol() 
    {
        return currentCol;
    }
    /**
        getCurrentValue method returns value in gameBoard
        at the currentRow/currentCol field
        @return value in gameBoard[currentRow][currentCol]
    */
    public int getCurrentValue() 
    {
        return gameBoard[currentRow][currentCol];
    }
    /**
        goNorth method decreases value in currentRow
    */
    public void goNorth() 
    {

        if (currentRow == 0) 
        {
            currentRow = currentRow;
        } else 
        {
            currentRow = currentRow - 1;
        }
    }
    /**
        goSouth method increases value in currentRow
    */
    public void goSouth() 
    {

        if (currentRow == 9) 
        {
            currentRow = currentRow;
        } else 
        {
            currentRow = currentRow + 1;
        }
    }
    /**
        goWest method decreases value in currentCol
    */
    public void goWest() {

        if (currentCol == 0) 
        {
            currentCol = currentCol;
        } else 
        {
            currentCol = currentCol - 1;
        }
    }
    /**
        gatherDaisies method decreases current location in grid by
        80% and returns the value decremented
        @return value of 80% decrease in cell
    */
    public int gatherDaisies() 
    {
        int daisiesGathered = 0;

        daisiesGathered += .8 * getCurrentValue();
        gameBoard[currentRow][currentCol] = gameBoard[currentRow][currentCol] - daisiesGathered;

        return daisiesGathered;
    }
    /**
        goEast method increases value in currentCol
    */
    public void goEast() 
    {

        if (currentCol == 9) 
        {
            currentCol = currentCol;
        } else 
        {
            currentCol = currentCol + 1;
        }
    }
    /**
        getGridSize method returns size of grid
        @return value of gameBoard.length
    */
    public int getGridSize() 
    {
        return gameBoard.length;
    }
    /**
        toString method used to return a String representing this Grid
        @return a String representing this grid
    */
    public String toString() 
    {
        String stringToReturn = "";
        int row, col;

        for (row = 0; row < gameBoard.length; row++) 
        {
            for (col = 0; col < gameBoard.length; col++) 
            {
                if (gameBoard[row][col] < 100) 
                {
                    stringToReturn = stringToReturn + " ";
                }
                if (gameBoard[row][col] < 10) 
                {
                    stringToReturn = stringToReturn + " ";
                }
                stringToReturn = stringToReturn + gameBoard[row][col] + " ";
            }
            stringToReturn = stringToReturn + "\n";
        }

        return stringToReturn;
    }
}
