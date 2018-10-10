/**
    Class description of a ship
*/

public class Ship
{
    private int[] position = new int[2];     // [row,col]
    final private char type;    // C carrier B battleship c cruiser S submarine D destroyer
    private boolean status;
    final private int size;   // 5 4 3 3 2
    private char orientation;   // n northsouth e eastwest

    /**
        Constructor method
        @param t The type of the ship
        @param pos The position of the ship
        @param o The orientation of the ship
    */
    public Ship(char t, int[] pos, char o)
    {
        status = true;
        type = t;
        for (int i=0; i<2; i++)
        {
            position[i] = pos[i];
        } 
        switch (type)
        {
            case 'C':
                size = 5;
                break;
            case 'B':
                size = 4;
                break;
            case 'c':
            case 'S':
                size = 3;
                break;
            case 'D':
                size = 2;
                break;
            default:
                size = 0;
        }
        orientation = o;
    }

    /**
        Accessor method for position field
        @return The position of the ship
    */
    public int[] getPosition()
    {
        int[] pos = new int[2];
        for (int i=0; i<2; i++)
        {
            pos[i] = position[i];
        }
        return pos;
    }

    /**
        Accessor method for the type field
        @return The type of the ship
    */
    public char getType()
    {
        return type;
    }

    /**
        Accessor method for the status field
        @return The status of the ship
    */
    public boolean getStatus()
    {
        return status;
    }

    /**
        Accessor method for the size field
        @return The size of the ship
    */
    public int getSize()
    {
        return size;
    }

    /**
        Accessor method for the orientation field
        @return The orientation of the ship
    */
    public char getOrientation()
    {
        return orientation;
    }

    /**
        Mutator method for the status field
        @param newStatus The new ship status
    */
    public void setStatus(boolean newStatus)
    {
        status = newStatus;
    }   
}
