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
    
    g.drawOval(super.getTopLeft().x, super.getTopLeft().y, super.boundingRectangle.width, super.boundingRectangle.height);
    g.setColor(getColor());
    g.fillOval(super.getTopLeft().x, super.getTopLeft().y, super.boundingRectangle.width, super.boundingRectangle.height);
        
 }
      //TestOvalPG

     
        

}
