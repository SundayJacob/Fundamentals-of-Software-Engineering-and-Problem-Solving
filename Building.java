/**
 * This is a Building Class that implements interface.
 *
 * @author Sunday Jacob Nwanyim 
 *
 * Andrew ID:  snwanyim 
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *         
 *
 */

public class Building implements CarbonFootprint
{
    private double annualAvgElectricityPerBuilding;
    private double emissionPerKW;
    
    public Building()
    {
        annualAvgElectricityPerBuilding = 11000;
        emissionPerKW = 1.5;
    }
    
    
    


    public double getAnnualAvgElectricityPerBuilding()
    {
        return annualAvgElectricityPerBuilding;
    }





    public void setAnnualAvgElectricityPerBuilding(double annualAvgElectricityPerBuilding)
    {
        this.annualAvgElectricityPerBuilding = annualAvgElectricityPerBuilding;
    }





    public double getEmissionPerKW()
    {
        return emissionPerKW;
    }





    public void setEmissionPerKW(double emissionPerKW)
    {
        this.emissionPerKW = emissionPerKW;
    }





    @Override
    public void getCarbonFootprint()
    {
        // TODO Auto-generated method stub
        double carCarbonFootprint;
        carCarbonFootprint = annualAvgElectricityPerBuilding * emissionPerKW;
        System.out.println("The Average Annual Carbon Emmisiion for a Building is: " + carCarbonFootprint + " kg of CO2");        

        
    }



    @Override
    public String toString()
    {
        return "Building [annualAvgElectricityPerBuilding=" + annualAvgElectricityPerBuilding + ", emissionPerKW="
                + emissionPerKW + "]";
    }
    
    

}
