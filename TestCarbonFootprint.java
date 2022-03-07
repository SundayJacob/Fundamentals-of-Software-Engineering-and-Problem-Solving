
/**
 * This program is a TestCarbonFootprint program. 
 *
 * @author Sunday Jacob Nwanyim 
 *
 * Andrew ID:  snwanyim 
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *         
 *
 */


import java.util.ArrayList;

public class TestCarbonFootprint
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        ArrayList<CarbonFootprint> carbonFootprint = new ArrayList<CarbonFootprint>();
        Building building = new Building();
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        
        carbonFootprint.add(building);
        carbonFootprint.add(car);
        carbonFootprint.add(bicycle);
        
        for (CarbonFootprint i : carbonFootprint)
        {
            
            i.getCarbonFootprint();
            

        }

//        building.getCarbonFootprint();
//        car.getCarbonFootprint();
//        bicycle.getCarbonFootprint();
        //System.out.println("" + );
        
        

    }

}
