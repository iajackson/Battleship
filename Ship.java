/*
Ship type
size
position
status
*/

public class Ship
{
    private int[] position = new int[2];     // [row,col]
    final private char type;    // C carrier B battleship c cruiser S submarine D destroyer
    private boolean status;
    final private int size;   // 5 4 3 3 2
    private char orientation;   // n northsouth e eastwest

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

    public int[] getPosition()
    {
        int[] pos = new int[2];
        for (int i=0; i<2; i++)
        {
            pos[i] = position[i];
        }
        return pos;
    }

    public char getType()
    {
        return type;
    }

    public boolean getStatus()
    {
        return status;
    }

    public int getSize()
    {
        return size;
    }

    public char getOrientation()
    {
        return orientation;
    }

    public void setStatus(boolean newStatus)
    {
        status = newStatus;
    }   
}
