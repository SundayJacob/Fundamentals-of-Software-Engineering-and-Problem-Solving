/**
 * This program is a RunElavator program.
 *
 * @author Sunday Jacob Nwanyim & Aanuoluwapo Orioke
 *
 * Andrew ID: snwanyim and aorioke
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *         
 *
 */


import java.io.*;

public class RunElevator
{

    public static void main(String[] args) throws IOException
    {
        // TODO Auto-generated method stub
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String floor;
        Elevator elevator = new Elevator();
        Door door = new Door();

        System.out.println("The elevetor is on floor " +elevator.getCurrentFloor());

        System.out.println("Please enter the new floor (Enter to quit): ");
        floor = keyboard.readLine();  
        int currentFloor = elevator.getCurrentFloor();
        int desiredFloor;
        
        while(!floor.equals(""))
        {
            desiredFloor = Integer.parseInt(floor);
            if (desiredFloor > elevator.getMaxFloor() || desiredFloor< elevator.getCurrentFloor())
            {
                System.out.println("Invalid Floor number Entered, The maximum floor in this building is 20");
            }
            
            else
            {
                if (desiredFloor > currentFloor)
                {

                    System.out.println("Closing door.");
                    for (int i=1+1; i<=desiredFloor; i++)
                    {

                        System.out.println("Going up to floor "+i);
                        if (i == desiredFloor)
                        {

                            System.out.println("Opening door at floor "+desiredFloor);
                            currentFloor =desiredFloor;
                        }
                    }
                }
                else if (desiredFloor < currentFloor)
                {
                    System.out.println("Closing door.");
                    for (int i=currentFloor-1; i>=desiredFloor; i--)
                    {

                        System.out.println("Going dow to floor "+i);
                        if (i == desiredFloor)
                        {

                            System.out.println("Opening door at floor "+desiredFloor);
                            currentFloor =desiredFloor;
                        }
                        
                    
                    }
                    

                
                
                 }
                
                else
                {
                    
                    System.out.println("Closing door.");

                    System.out.println("Opening door at floor "+desiredFloor);
                    currentFloor =desiredFloor;
                    
                }
                    
                }
 

            System.out.println("\nThe elevetor is at floor "+currentFloor);
            System.out.println("Enter the new floor (Enter to quit): ");
            floor = keyboard.readLine();
            
            
            
        }
        

        System.out.println("Bye!");
        
    }
    
    

}
