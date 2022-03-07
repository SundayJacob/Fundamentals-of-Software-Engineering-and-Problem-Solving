/**
 * This program is a Elavator program.
 *
 * @author Sunday Jacob Nwanyim & Aanuoluwapo Orioke
 *
 * Andrew ID: snwanyim and aorioke
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *         
 *
 */

public class Elevator
{
    
    private int maxFloor;
    private int currentFloor;
    
    
    public Elevator()
    {
        maxFloor = 20;
        currentFloor = 1;
    }
    
    public void setMaxFloor(int mxfloor)
    {
        maxFloor = mxfloor;
    }
    
    public void setCurrentFloor(int curfloor)
    {
        currentFloor = curfloor;
    }
    
    public int getMaxFloor()
    {
        return maxFloor;
    }
    
    public int getCurrentFloor()
    {
        return currentFloor;
    }
    
    public String toString()
    {
        return "";
    }


   

}
