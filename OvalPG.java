/**
 * This program is a OvalPG program.
 *
 * @author Sunday Jacob Nwanyim 
 *
 * Andrew ID:  snwanyim 
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *         
 *
 */

import java.awt.*;

public class OvalPG extends PositionalGraphic
{

public OvalPG()
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
    
    g.drawOval(super.boundingRectangle.getTopLeft().x, super.boundingRectangle.getTopLeft().y, super.boundingRectangle.getWidth(), super.boundingRectangle.getHeight());
    g.setColor(getColor());
    g.fillOval(super.boundingRectangle.getTopLeft().x, super.boundingRectangle.getTopLeft().y, super.boundingRectangle.getWidth(), super.boundingRectangle.getHeight());
        
 }
      //TestOvalPG

     
        

}
