/**
 * This program is a PositionalGraphic program. 
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
import java.awt.Rectangle;

public class PositionalGraphic extends Canvas
{
    private Color color;
    public Rectangle boundingRectangle;
    private boolean debug;
    private Point center;
    
    public PositionalGraphic()
    {
        boundingRectangle = new Rectangle();
        center = new Point(200,100);
        color = Color.blue;
        debug = false;  
        boundingRectangle.height = 200;
        boundingRectangle.width = 200;
        getTopLeft();
    }
    
    public Color getColor()
    {
        return color;
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

    public Rectangle getBoundingRectangle()
    {
        return boundingRectangle;
    }

    
    public void setBoundingRectangle( Point c, int width, int height)
    {
        boundingRectangle.height = height;
        boundingRectangle.width = width;
        center = c;
        getTopLeft();
    }
    
    public void setBoundingR(int x, int y, int width, int height)
    {
        boundingRectangle = new Rectangle(x, y, width, height);
        
    }
    
    public void setBoundingR(Rectangle r)
    {
        boundingRectangle = r;
    }
    public Rectangle getBoundingR()
    {
        return boundingRectangle;
    }
    
    public void setBoundingRectangle(Rectangle boundingRectangle)
    {
        this.boundingRectangle = boundingRectangle;
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
    
    
//    public PositionalGraphic(Point p, int w, int h)
//    {
//        
//    }
    
    
    public void setHeight(int h)
    {
        //boundingRectangle.setSize(boundingRectangle.width, h);
        boundingRectangle.height = h;
    }
    
    public void setX(int x)
    {
       // boundingRectangle.setSize(w, boundingRectangle.height);
        //boundingRectangle.x = x;
        getBoundingR().x = x;
    }
    
    public void setY(int y)
    {
       // boundingRectangle.setSize(w, boundingRectangle.height);
        //boundingRectangle.y = y;
        getBoundingR().y = y;

    }
    
    public void setXAndY(int x, int y)
    {
       // boundingRectangle.setSize(w, boundingRectangle.height);
        getBoundingR().x = x;
        getBoundingR().y = y;

        
    }
    

    public void setWidth(int w)
    {
       // boundingRectangle.setSize(w, boundingRectangle.height);
        boundingRectangle.width = w;
    }
    
    public Point getCenter()
    {
        return center;
    }

    public void setCenter(Point center)
    {
        this.center = center;
    }
    
    public Point getTopLeft()
    {
//        boundingRectangle.x = getCenter().x - boundingRectangle.width/2;
//        boundingRectangle.y = getCenter().y - boundingRectangle.height/2;
        
        Point p = new Point(boundingRectangle.x , boundingRectangle.y);
        //setTopLeft(p);
        System.out.println("Topx:"+boundingRectangle.x);
        System.out.println("TopY:"+boundingRectangle.y);


        return p;
        
    }
    
    public int getY()
    {
        return boundingRectangle.y;
    }
    
    public void setTopLeftY(int y)
    {
        boundingRectangle.y = y;
        //boundingRectangle.y = y;
        
    }
    
    public int getX()
    {
        return boundingRectangle.x;
    }
    
    
    
    public void setTopLeftX(int x)
    {
       // boundingRectangle.x = getCenter().x - boundingRectangle.width/2;
        boundingRectangle.x = x;
        
    }

    
    public Point getTopMiddle()
    {
        Point p = new Point(getTopLeft().x + boundingRectangle.width/2, getTopLeft().y);
        return p;
    }
    public Point getTopRight()
    {
        Point p = new Point(getTopLeft().x + boundingRectangle.width, getTopLeft().y);
        return p;
    }
    public Point getMiddleLeft()
    {
        Point p = new Point(getTopLeft().x , getTopLeft().y + boundingRectangle.height/2);
        return p;
    }
    
    public Point getMiddleRight()
    {
        Point p = new Point(getTopLeft().x + boundingRectangle.width , getTopLeft().y + boundingRectangle.height/2);
        return p;
    }
    
    public Point getBottomLeft()
    {
        Point p = new Point(getTopLeft().x , getTopLeft().y + boundingRectangle.height);
        return p;
    }
    
    public Point getBottomMiddle()
    {
        Point p = new Point(getTopLeft().x + boundingRectangle.width /2, getTopLeft().y + boundingRectangle.height);
        return p;
    }
    
    public Point getBottomRight()
    {
        Point p = new Point(getTopLeft().x + boundingRectangle.width, getTopLeft().y + boundingRectangle.height);
        return p;
    }
    @Override
    public void paint(Graphics g)
    { 
        if (isDebugOn()==true)
        {
          g.setColor(color);
          g.drawRect(boundingRectangle.x, boundingRectangle.y, boundingRectangle.width, boundingRectangle.height);  
        }
        
        
    }
    
    public String toString()
    {
        String str = " ";
        
        str += " Width " + boundingRectangle.width;
        str += "Height " + boundingRectangle.height;
        str += " Color" + color;
        
        return str;
    }




    
    
    
    
    
    
    
    
    

}
