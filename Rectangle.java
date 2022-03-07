/**
 * This program is a Rectangle program.
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

public class Rectangle
{
    private int height;
    private int width;
    private Point topLeft;
    private Point topRight;
    private Point topMiddle;
    private Point middleLeft;
    private Point middleRight;
    private Point center;
    private Point bottomLeft;
    private Point bottomRight;
    private Point bottomMiddle;



    
    public Rectangle()
    {
        height = 100;
        width = 200;
        center = new Point(200,100);
        topLeft = new Point(10,10);
        
    }
    
    public Rectangle( Point c, int width, int height)
    {
        this.height = height;
        this.width = width;
        center = c;
        getTopLeft();
    }

    public int getHeight()
    {
        return height;
    }
    public void setHeight(int height)
    {
        this.height = height;
    }
    public int getWidth()
    {
        return width;
    }
    public void setWidth(int width)
    {
        this.width = width;
    }
    
    public Point getCenter()
    {
        return center;
    }

    public void setCenter(Point center)
    {
        this.center = center;
    }

    public void setTopRight(Point topRight)
    {
        this.topRight = topRight;
    }

    public void setTopMiddle(Point topMiddle)
    {
        this.topMiddle = topMiddle;
    }

    public void setMiddleLeft(Point middleLeft)
    {
        this.middleLeft = middleLeft;
    }

    public void setMiddleRight(Point middleRight)
    {
        this.middleRight = middleRight;
    }

    public void setBottomLeft(Point bottomLeft)
    {
        this.bottomLeft = bottomLeft;
    }

    public void setBottomRight(Point bottomRight)
    {
        this.bottomRight = bottomRight;
    }

    public void setBottomMiddle(Point bottomMiddle)
    {
        this.bottomMiddle = bottomMiddle;
    }

//    public void setTopLeft(int topLeftX, int topLeftY)
//    {
//        this.topLeft.x = topLeftX;
//        this.topLeft.y = topLeftY;
//
//        
//    }
    public void setTopLeft(Point newTL)
    {
        topLeft = newTL;

        
    }
    
    public Point getTopLeft()
    {
        Point p = new Point(getCenter().x - getWidth()/2, getCenter().y - getHeight()/2);
        setTopLeft(p);

        return p;

        //return topLeft;
    }
    
    public Point getTopMiddle()
    {
        Point p = new Point(getTopLeft().x + getWidth()/2, getTopLeft().y);
        return p;
    }
    public Point getTopRight()
    {
        Point p = new Point(getTopLeft().x + getWidth(), getTopLeft().y);
        return p;
    }
    public Point getMiddleLeft()
    {
        Point p = new Point(getTopLeft().x , getTopLeft().y + getHeight()/2);
        return p;
    }
    
    public Point getMiddleRight()
    {
        Point p = new Point(getTopLeft().x + getWidth() , getTopLeft().y + getHeight()/2);
        return p;
    }
    
    public Point getBottomLeft()
    {
        Point p = new Point(getTopLeft().x , getTopLeft().y + getHeight());
        return p;
    }
    
    public Point getBottomMiddle()
    {
        Point p = new Point(getTopLeft().x + getWidth() /2, getTopLeft().y + getHeight());
        return p;
    }
    
    public Point getBottomRight()
    {
        Point p = new Point(getTopLeft().x + getWidth(), getTopLeft().y + getHeight());
        return p;
    }
    
    
    public String toString()
    {
        return "";
    }

//    public void setboundingRectangle(Point point, int i, int j)
//    {
//        // TODO Auto-generated method stub
//        
//    }
//    
    
}
