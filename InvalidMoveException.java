/**
    Exception thrown when a player makes an invalid move
*/
public class InvalidMoveException extends Exception
{
    /**
        Default constructor
    */
    public InvalidMoveException()
    {
        super("Invalid move");
    }
}
