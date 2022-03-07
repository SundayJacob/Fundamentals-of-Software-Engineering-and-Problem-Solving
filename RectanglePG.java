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
      g.drawRect(boundingRectangle.getTopLeft().x, boundingRectangle.getTopLeft().y, boundingRectangle.getWidth(), boundingRectangle.getHeight());
      g.setColor(getColor());
      
      g.fillRect(boundingRectangle.getTopLeft().x, boundingRectangle.getTopLeft().y, boundingRectangle.getWidth(), boundingRectangle.getHeight());
    
}

public String toString()
{
    return "";
}
//TestRectanglePG
}
