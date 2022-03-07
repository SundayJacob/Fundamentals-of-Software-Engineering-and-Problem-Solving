/**
 * This program is a Positional Graphic program.
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
import java.awt.Point;
import java.awt.*;

import javax.swing.*;

public class PositionalGraphic extends Canvas
{

    private Color color;
    public Rectangle boundingRectangle;
    private boolean debug;
    
    public PositionalGraphic()
    {
        boundingRectangle = new Rectangle();
        color = Color.blue;
        debug = true;  
    }
    
//    public PositionalGraphic(Rectangle r)
//    {
//        boundingRectangle = new Rectangle(r);
//        color = Color.blue; 
//    }

//    public void setWidth(int w)
//    {
//        boundingRectangle.setSize(width, boundingRectangle.height);
//    }

//    public int getWidth()
//    {
//        return boundingRectangle.getWidth();
//    }

//    public void setWidth(int width)
//    {
//        boundingRectangle.setSize(width, boundingRectangle.height);
//    }

//    public int getWidth()
//    {
//        return boundingRectangle.getWidth();
//    }
    
    public void setboundingRectangle(Point p, int w, int h)
    {
        boundingRectangle = new Rectangle(p,w,h);
    }
    // getters
    public Rectangle getboundingRectangle()
    {
        return boundingRectangle;
    }
   
    public void setColor(String newColor)
    {
        ColorConverter c = null;
        color = c.getColor(newColor) ;
    }
    
    public void setColor(Color newColor)
    {
       color = newColor ;
    }
    
    public Color getColor()
    {
        return color;
    }
    

   

   public void setDebug(boolean state)
   {
       debug = state;
   }


   public void clearDebug()
   {
       debug = false;
   }
   
   public boolean isDebugOn()
   {
       if (debug == true)
       {
           return true;
       }
       else
       {
           return false;
       }
   }
   
   public void setCenter(int centerX, int centerY) 
   {
       int topX, width;
       width  = getWidth();
       topX = centerX - (int)(width/2.0);
       
       
       int topY, height;
       height  = getHeight();
       topY = centerY - (int)(height/2.0);
       boundingRectangle.setTopLeft(new Point(topX, topY));  
   }
//   public void setCenterY(int centerY) 
//   {
//       int topY, height;
//       height  = getHeight();
//       topY = centerY - (int)(height/2.0);
//       boundingRectangle.setTopLeft().y = topY;  
//   }
   
   @Override
   public void paint(Graphics g)
   { 
       if (isDebugOn()==true)
       {
         g.setColor(color);
         g.drawRect(boundingRectangle.getTopLeft().x, boundingRectangle.getTopLeft().y, boundingRectangle.getWidth(), boundingRectangle.getHeight());     
       }
       
       
   }
   
   public String toString()
   {
       String str = " ";
       
       str += " Width " + getWidth();
       str += "Height " + getHeight();
       str += " Color" + color;
       
       return str;
   }

}
