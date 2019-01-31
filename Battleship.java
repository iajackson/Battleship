/*
first draft
assume 1 player
assume 3x3 gameboard
assume 1 ship
*/
import java.util.Scanner;
import java.util.Random;

public class Battleship
{
    public Battleship()
    {
        //Scanner keyboard = new Scanner(System.in);
        Random randomGenerator = new Random();
        final int GAMEBOARD_SIZE = 15;
        
        // Generate gameboard
        //String gameBoard[][] = {{"1", "2", "3"},
        //                        {"4", "5", "6"},
        //                        {"7", "8", "9"}};
        String gameBoard[][] = new String[GAMEBOARD_SIZE][GAMEBOARD_SIZE];
        for (int row = 0; row < GAMEBOARD_SIZE; row++)
        {
            for (int col = 0; col < GAMEBOARD_SIZE; col++)
            {
                gameBoard[row][col] = " ";
            }
        }

        // Print gameboard
        // Print top border
        for (int i = 0; i < (2 * gameBoard.length + 1); i++)
        {
            System.out.print("#");
        }
        System.out.print("\n");
        for (int row = 0; row < gameBoard.length; row++)
        {
            System.out.print("#"); // Print left border
            for (int col = 0; col < (2 * gameBoard[row].length - 1); col++)
            {
                int colCount = 0;
                if (col % 2 == 0) // Alternate space and border
                {
                    System.out.print(gameBoard[row][colCount]);
                }
                else
                    System.out.print("|");
                colCount++;
            }
            System.out.print("#"); // Print right border
            System.out.print("\n");
        }
        // Print bottom border
        for (int i = 0; i < (2 * gameBoard.length + 1); i++)
        {
            System.out.print("#");
        }
        System.out.print("\n");
        
        // Place ship on board
        // Prompt for guess
        // Repeat until guess count reached or ship sunk 
    }
    
    public static void main(String[] args)
    {
        new Battleship();
    }
}
