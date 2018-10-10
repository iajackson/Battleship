/**
    Class description of a battleship game board
*/

public class GameBoard
{
    private final int size; // Board size
    private char[][] squares;   // The actual board
    
    /**
        Default constructor
        @param s The board size
    */
    public GameBoard(int s)
    {
        size = s;
        squares = new char[size][size];
        for (int row=0; row<size; row++)
        {
            for(int col=0; col<size; col++)
            {
                squares[row][col] = ' ';
            }
        } 
    }

    /**
        toString method for printing board
        @return The formatted board
    */
    public String toString()
    {
        String formattedBoard = "";
        int border = size + 2;
        for (int i=0; i<border; i++)
        {
            formattedBoard += "#";
        }
        formattedBoard += "\n";
        for (int row=0; row<size; row++)
        {
            formattedBoard += "#";
            for(int col=0; col<size; col++)
            {
                formattedBoard += squares[row][col];
            }
            formattedBoard += "#\n";
        }
        for (int i=0; i<border; i++)
        {
            formattedBoard += "#";
        }
        return formattedBoard;
    }

    /**
        Prints the board to the console
    */
    public void displayBoard()
    {
        System.out.println(toString());
    }
}
