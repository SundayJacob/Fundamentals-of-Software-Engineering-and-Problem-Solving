/**
 * This is a RightTriangle program.
 *
 * @author Sunday Jacob Nwanyim
 *
 * Andrew ID: snwanyim
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */



public class RightTriangle
{
    private int width;
    private String art;
    private String location;
    
    
    public RightTriangle()
    {
        width = 0;
        art = "";
        location = "";
    }
    public RightTriangle(int tWidth, String tArt, String tLocation)
    {
        width = tWidth;
        art = tArt;
        location = tLocation;
    }
    
    
    public int getWidth()
    {
        return width;
    }
    public void setWidth(int tWidth)
    {
       width = tWidth;
    }
    public String getArt()
    {
        return art;
    }
    public void setArt(String tArt)
    {
        art = tArt;
    }
    public String getLocation()
    {
        return location;
    }
    public void setLocation(String tLocation)
    {
        location = tLocation;
    }
    public String toString()
    {
        return "The triangle has the following attributes: %nWidth = " +width+"%nArt = "+art+"%nLocation = "+location;
    }
    
    private String buildString(String str, int num)
    {
        String built = "";
        for (int i= 0; i<num; i++)
        {
         built = built + str;   
        }
        return built;
    }
    
    public void drawAsciiArt()
    {
        if (getLocation().equals("bl"))
        {
            for (int i=0; i<getWidth();i++)
            {
                System.out.println(buildString(getArt(),i));
            }
        }
        
        if (getLocation().equals("tl"))
        {
            for (int i=getWidth(); i>0;i--)
            {
                System.out.println(buildString(getArt(),i));
            }
        }
        
        if (getLocation().equals("tr"))
        {
            for (int i=getWidth(); i>0;i--)
            {
                for (int j = (getWidth()-i); j>0;j--)
                {
                    System.out.print(" ");
                }
                System.out.println(buildString(getArt(),i));
            }
        }
        
        if (getLocation().equals("br"))
        {
            for (int i=0; i<getWidth();i++)
            {
                for (int j = (getWidth()-i); j>0;j--)
                {
                    System.out.print(" ");
                }
                System.out.println(buildString(getArt(),i));
            }
        }
        else 
        {
            System.out.println("Please input a valid location");
        }
    }
    
}
 