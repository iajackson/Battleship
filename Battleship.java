/*
Prompt for number of players
Prompt for size of gameboard
Prompt for number of ships per player
Generate gameboard
Ship placement phase
Combat phase
End game phase
*/

public class Battleship
{
    public Battleship()
    {
        GameBoard board = new GameBoard(10);
        board.displayBoard();
    }

    public static void main(String[] args)
    {
        new Battleship();
    }
}
