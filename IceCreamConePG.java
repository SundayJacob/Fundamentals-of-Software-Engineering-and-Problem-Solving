/**
 * This program is a IceCreamCone program.
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
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class IceCreamConePG extends PositionalGraphic
{
    TrianglePG cone = new TrianglePG();
    OvalPG scoop;
    Point p, p1, p2;
    int h, h1,h2,w, w1,w2;
    int numOfScoops;
    
    
    
    ArrayList<OvalPG> scoops = new ArrayList<OvalPG>();

    public TrianglePG getCone()
    {
        return cone;
    }
    public void setCone(TrianglePG cone)
    {
        this.cone = cone;
    }
    public OvalPG getScoop()
    {
        return scoop;
    }
    public void setScoop(OvalPG scoop)
    {
        this.scoop = scoop;
    }
    public Point getP()
    {
        return p;
    }
    public void setP(Point p)
    {
        this.p = p;
    }
    public Point getP1()
    {
        return p1;
    }
    public void setP1(Point p1)
    {
        this.p1 = p1;
    }
    public int getH()
    {
        return h;
    }
    public void setH(int h)
    {
        this.h = h;
    }
    public int getH1()
    {
        return h1;
    }
    public void setH1(int h1)
    {
        this.h1 = h1;
    }
    public int getW()
    {
        return w;
    }
    public void setW(int w)
    {
        this.w = w;
    }
    public int getW1()
    {
        return w1;
    }
    public void setW1(int w1)
    {
        this.w1 = w1;
    }
    public int getNumOfScoops()
    {
        return numOfScoops;
    }
    public void setNumOfScoops(int numOfScoops)
    {
        this.numOfScoops = numOfScoops;
    }
    public ArrayList<OvalPG> getScoops()
    {
        return scoops;
    }
    public void setScoops(ArrayList<OvalPG> scoops)
    {
        this.scoops = scoops;
    }
    public IceCreamConePG()
    {
        numOfScoops =3;
       
    }
    public void setDebug(boolean state)
    {
        super.setDebug(state);
        cone.setDebug(state);
        scoop.setDebug(state);

    }

    
    public void addScoop(String color)
    {
        
        w1 = super.boundingRectangle.getWidth()/2;
        h1 = (super.boundingRectangle.getHeight()/2)/ numOfScoops;
        
        if (scoops.isEmpty())
        {
            p1 = new Point (super.boundingRectangle.getCenter().x,super.boundingRectangle.getCenter().y  - h1/2);
            scoop = new OvalPG();
            scoop.getboundingRectangle().setCenter(p1);
            scoop.getboundingRectangle().setHeight(h1);
            scoop.getboundingRectangle().setWidth(w1);
            scoop.getboundingRectangle().getTopLeft();
            
            //scoop.setboundingRectangle(p1, w1, h1 );
            scoop.setColor(ColorConverter.getColor(color));
            scoops.add(scoop);

            
        }
        
        
        
        else
        {
            int y = p1.y - h1;
            //int y= scoops.get(scoops.size()-1).getboundingRectangle().getCenter().y - h1;

            p1 = new Point (super.boundingRectangle.getCenter().x,y);
            scoop = new OvalPG();
            scoop.getboundingRectangle().setCenter(p1);
            scoop.getboundingRectangle().setHeight(h1);
            scoop.getboundingRectangle().setWidth(w1);
            scoop.getboundingRectangle().getTopLeft();
            //scoop.getboundingRectangle().setboundingRectangle(p1, w1, h1 );
            
            scoop.setColor(ColorConverter.getColor(color));
            scoops.add(scoop);

        }
    }
    

@Override
public void paint(Graphics g)
{
    super.paint(g);
    
    p = new Point(getboundingRectangle().getCenter().x, getboundingRectangle().getCenter().y + getboundingRectangle().getHeight()/4);
    w = getboundingRectangle().getWidth();
    h = getboundingRectangle().getHeight()/2;
    cone.setShape(TrianglePG.TriangleShape.DOWN);
    //cone.boundingRectangle.setTopLeft(p);
    cone.setboundingRectangle(p, w, h );
    cone.getboundingRectangle().setHeight(super.getboundingRectangle().getHeight()/2);
    this.cone.paint(g);
    
    
    for (int i = 0; i<scoops.size(); i++)
    {
        scoops.get(i).paint(g);
    }
    
//    p1 = new Point(super.boundingRectangle.getCenter().x , super.boundingRectangle.getCenter().y - super.boundingRectangle.getHeight()/4);
//    w1 = super.boundingRectangle.getWidth()/2;
//    h1 = super.boundingRectangle.getHeight()/2;
//    scoop.setboundingRectangle(p1, w1, h1 );
//    scoop.boundingRectangle.setHeight(super.boundingRectangle.getHeight()/2);
//    scoop.setColor(Color.green);
//
//    this.scoop.paint(g);
//   
  
   //TestHatPG
    //TestIceCreamConePG
   
 } 

}

