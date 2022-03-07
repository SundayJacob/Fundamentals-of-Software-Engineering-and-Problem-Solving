/**
 * This program is a RectanglePG program. 
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


public class RectanglePG extends PositionalGraphic
{
    
public RectanglePG()
{
    super();
}

public void paint(Graphics g)
{ 
      super.paint(g);
      g.drawRect(getTopLeft().x, getTopLeft().y, boundingRectangle.width, boundingRectangle.height);
      g.setColor(getColor());
      
      g.fillRect(getTopLeft().x, getTopLeft().y, boundingRectangle.width, boundingRectangle.height);
    
}

public String toString()
{
    return "";
}
//TestRectanglePG
}
