
/**
 * This program is a HatPG program. 
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

public class HatPG extends PositionalGraphic
{
    HalfCirclePG crown;
    RectanglePG brim;
    
    
    public HatPG()
    {
        crown = new HalfCirclePG();
        brim = new RectanglePG();
       
    }
    
    public void setDebug(boolean state)
    {
        super.setDebug(state);
        crown.setDebug(state);
        brim.setDebug(state);
    }

@Override
public void paint(Graphics g)
{
    super.paint(g);
    
   crown.setXAndY(boundingRectangle.x + boundingRectangle.width/4, boundingRectangle.y);
   crown.setHeight(boundingRectangle.height * 6/8);
   crown.setWidth(boundingRectangle.width/ 2);
   crown.setColor(getColor());    
   crown.paint(g);
   
   
   brim.setXAndY(boundingRectangle.x , boundingRectangle.y + boundingRectangle.height * 6/8);
   brim.setHeight(boundingRectangle.height * 2/8);
   brim.setWidth(boundingRectangle.width);
   brim.setColor(getColor());
   brim.paint(g);
   
 } 

}
