/**
 * This program is a DiamondPG program.
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



public class DiamondPG extends PositionalGraphic
{



public DiamondPG()
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
    
    
   
  
   {    
        
       int x[] = {super.boundingRectangle.getTopMiddle().x, super.boundingRectangle.getMiddleLeft().x, super.boundingRectangle.getBottomMiddle().x, super.boundingRectangle.getMiddleRight().x};
       
       //store all y points in an array for accessing
       int y[] = {super.boundingRectangle.getTopMiddle().y, super.boundingRectangle.getMiddleLeft().y, super.boundingRectangle.getBottomMiddle().y, super.boundingRectangle.getMiddleRight().y};
       
       
       g.drawPolygon(x, y, 4);
       g.setColor(getColor());
       g.fillPolygon(x, y, 4);
   }
   
   
   
 }
      

     
        

}
