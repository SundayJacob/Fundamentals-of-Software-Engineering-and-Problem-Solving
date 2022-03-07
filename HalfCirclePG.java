/**
 * This program is a HalfCirlPG program.
 *
 * @author Sunday Jacob Nwanyim 
 *
 * Andrew ID:  snwanyim 
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *         
 *
 */


import java.awt.Graphics;
import java.awt.*;

public class HalfCirclePG extends PositionalGraphic
{

public HalfCirclePG()
{
    
    
}

public void setDebug(boolean state)
{
    super.setDebug(state);
}


@Override
public void paint(Graphics g)
{
    super.paint(g);
    
        
    int startAngle = 0;
    int angleExtent = 180;
    
    
    
    g.drawArc(super.boundingRectangle.getTopLeft().x, super.boundingRectangle.getTopLeft().y, super.boundingRectangle.getWidth(), super.boundingRectangle.getHeight()*2, startAngle, angleExtent);
    g.setColor(getColor());
    
    g.fillArc(super.boundingRectangle.getTopLeft().x, super.boundingRectangle.getTopLeft().y, super.boundingRectangle.getWidth(), super.boundingRectangle.getHeight()*2, startAngle, angleExtent);
 }
      

     //TestHalfCirclePG
        

}
