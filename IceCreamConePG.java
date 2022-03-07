/**
 * This program is a IceCreamCone program. 
 *
 * @author Sunday Jacob Nwanyim 
 *
 * Andrew ID:  snwanyim 
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *         
 *
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class IceCreamConePG extends PositionalGraphic
{
    TrianglePG cone; 
    OvalPG scoop;
    
    ArrayList<OvalPG> scoops;

    
    public IceCreamConePG()
    {
       cone = new TrianglePG();
        scoop = new OvalPG();
        scoops = new ArrayList<OvalPG>();
              
    }
    public void setDebug(boolean state)
    {
        super.setDebug(state);
        cone.setDebug(state);
        scoop.setDebug(state);

    }

    
    public void addScoop(String color)
    {
        scoop.setColor(color);
        scoops.add(scoop);
        
    }
    

@Override
public void paint(Graphics g)
{
    
    if (isDebugOn() == true)
    {
    super.paint(g);
    }
    
    cone.setXAndY(boundingRectangle.x , boundingRectangle.y + boundingRectangle.height/2);
    cone.setHeight(boundingRectangle.height/2);
    cone.setWidth(boundingRectangle.width);
    cone.setShape(TrianglePG.TriangleShape.DOWN);
    cone.setColor(Color.blue);    
    cone.paint(g);
   
    
    
    for (int i = 0; i<scoops.size(); i++)
    {
        //scoops.get(i).setXAndY(boundingRectangle.x + boundingRectangle.width/2 - boundingRectangle.width/8, boundingRectangle.y + i*(boundingRectangle.height/2)/ scoops.size());

        scoops.get(i).setXAndY(boundingRectangle.x + boundingRectangle.width * 2/8, boundingRectangle.y + i*(boundingRectangle.height/2)/ scoops.size());
        scoops.get(i).setHeight((boundingRectangle.height/2)/scoops.size());
        scoops.get(i).setWidth(boundingRectangle.width/2);
        scoops.get(i).setColor(getColor());   
        
       
        
        scoops.get(i).paint(g);
        
        
        
    }
    

   
 } 

}

