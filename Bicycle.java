/**
 * This program is a Bicycle program.
 *
 * @author Sunday Jacob Nwanyim 
 *
 * Andrew ID:  snwanyim 
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *         
 *
 */

public class Bicycle implements CarbonFootprint
{
    private double avgMilesCoveredPerYear;
    private double avgCaloriesPerMile;
    
    public Bicycle()
    {
        avgMilesCoveredPerYear = 2000.0;
        avgCaloriesPerMile = 34;
    }
    
    


    public double getAvgCaloriesPerMile()
    {
        return avgCaloriesPerMile;
    }




    public void setAvgCaloriesPerMile(double avgCaloriesPerMile)
    {
        this.avgCaloriesPerMile = avgCaloriesPerMile;
    }




    public double getAvgMilesCoveredPerYear()
    {
        return avgMilesCoveredPerYear;
    }




    public void setAvgMilesCoveredPerYear(double avgMilesCoveredPerYear)
    {
        this.avgMilesCoveredPerYear = avgMilesCoveredPerYear;
    }




    @Override
    public void getCarbonFootprint()
    {
        // TODO Auto-generated method stub
        double carCarbonFootprint;
        carCarbonFootprint = avgMilesCoveredPerYear * avgCaloriesPerMile;
        System.out.println("The Average Annual Carbon Emmisiion for a Bicycle is: " + carCarbonFootprint + " kg of CO2");        
       
        
    }





    @Override
    public String toString()
    {
        return "Bicycle [avgMilesCoveredPerYear=" + avgMilesCoveredPerYear + ", avgCaloriesPerMile="
                + avgCaloriesPerMile + "]";
    }
    
    

}
