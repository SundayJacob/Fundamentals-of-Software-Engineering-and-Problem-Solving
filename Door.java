/**
 * This program is a Door program.
 *
 * @author Sunday Jacob Nwanyim & Aanuoluwapo Orioke
 *
 * Andrew ID: snwanyim and aorioke
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *         
 *
 */



public class Door
{
    private enum status
    {
        CLOSE,
        OPEN;
    }
    private status doorStatus;
    
    public Door()
    {
        doorStatus = status.CLOSE;
    }
    
    public void setStatus(status stats)
    {
        doorStatus = stats;
    }
    
    public boolean doorClose()
    {
        if (doorStatus == status.CLOSE)
        {
            return true;
        }
        return false;
    }
    
    public boolean doorOpen()
    {
        if (doorStatus == status.OPEN)
        {
            return true;
        }
        return false;
    }
    
    public void changeStatus()
    {
        if(doorOpen() == true)
            doorStatus = status.OPEN;
        else
            doorStatus = status.CLOSE;

    }
    
    public String toString()
    {
        return "Door is now " + doorStatus;
    }
    
    
   

}
