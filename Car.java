/**
 * This is a Car Class that implements interface.
 *
 * @author Sunday Jacob Nwanyim 
 *
 * Andrew ID:  snwanyim 
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *         
 *
 */


public class Car implements CarbonFootprint
{
    private double avgMilesCoveredPerYear;
    private int milesPerGallon;
    private double emissionPerLitter;
    private double oneGallonToLiter;

    

    public Car()
    {
        avgMilesCoveredPerYear = 18000;
        milesPerGallon = 25;
        emissionPerLitter = 2.68;
        oneGallonToLiter = 3.785;
    }
    
    

    public double getAvgMilesCoveredPerYear()
    {
        return avgMilesCoveredPerYear;
    }



    public void setAvgMilesCoveredPerYear(double avgMilesCoveredPerYear)
    {
        this.avgMilesCoveredPerYear = avgMilesCoveredPerYear;
    }
    
    



    public double getOneGallonToLiter()
    {
        return oneGallonToLiter;
    }



    public void setOneGallonToLiter(double oneGallonToLiter)
    {
        this.oneGallonToLiter = oneGallonToLiter;
    }



    public int getMilesPerGallon()
    {
        return milesPerGallon;
    }



    public void setMilesPerGallon(int milesPerGallon)
    {
        this.milesPerGallon = milesPerGallon;
    }



    public double getEmissionPerLitter()
    {
        return emissionPerLitter;
    }



    public void setEmissionPerLitter(double emissionPerLitter)
    {
        this.emissionPerLitter = emissionPerLitter;
    }



    @Override
    public void getCarbonFootprint()
    {
        double carCarbonFootprint;
        carCarbonFootprint =  ((avgMilesCoveredPerYear/milesPerGallon) * oneGallonToLiter) * emissionPerLitter;
        System.out.println("The Average Annual Carbon Emmisiion for a car is: " + carCarbonFootprint + " kg of CO2");        
        // TODO Auto-generated method stub

    }



    @Override
    public String toString()
    {
        return "Car [avgMilesCoveredPerYear=" + avgMilesCoveredPerYear + ", milesPerGallon=" + milesPerGallon
                + ", emissionPerLitter=" + emissionPerLitter + "]";
    }
    
    

}
