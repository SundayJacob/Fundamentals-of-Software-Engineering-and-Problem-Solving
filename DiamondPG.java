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
        
       int x[] = {super.getTopMiddle().x, super.getMiddleLeft().x, super.getBottomMiddle().x, super.getMiddleRight().x};
       
       //store all y points in an array for accessing
       int y[] = {super.getTopMiddle().y, super.getMiddleLeft().y, super.getBottomMiddle().y, super.getMiddleRight().y};
       
       
       g.drawPolygon(x, y, 4);
       g.setColor(getColor());
       g.fillPolygon(x, y, 4);
   }
   
   
   
 }
      

     
        

}
