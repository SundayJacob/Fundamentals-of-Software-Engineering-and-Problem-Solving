/**
 * This program is a HeartPG program.
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

public class HeartPG extends PositionalGraphic
{
    TrianglePG cone = new TrianglePG();
    HalfCirclePG heart1 = new HalfCirclePG();
    HalfCirclePG heart2 = new HalfCirclePG();

    Point p, p1, p2;
    int w, w1, w2;
    int h, h1,h2;
    public HeartPG()
    {
        
       
    }
    
    public void setDebug(boolean state)
    {
        super.setDebug(state);
        cone.setDebug(state);
        heart1.setDebug(state);
        heart2.setDebug(state);

    }


@Override
public void paint(Graphics g)
{
    super.paint(g);
    
    p = new Point(super.boundingRectangle.getCenter().x, super.boundingRectangle.getCenter().y + super.boundingRectangle.getHeight()/4);
    w = super.boundingRectangle.getWidth();
    h = super.boundingRectangle.getHeight()/2;
    cone.setShape(TrianglePG.TriangleShape.DOWN);
    //cone.boundingRectangle.setTopLeft(p);
    cone.setboundingRectangle(p, w, h );
    cone.boundingRectangle.setHeight(super.boundingRectangle.getHeight()/2);
    this.cone.paint(g);
    
    
    p1 = new Point(super.boundingRectangle.getCenter().x - super.boundingRectangle.getWidth()/4, super.boundingRectangle.getCenter().y - super.boundingRectangle.getHeight()/4);
    w1 = super.boundingRectangle.getWidth()/2;
    h1 = super.boundingRectangle.getHeight()/2;
    heart1.setboundingRectangle(p1, w1, h1 );
    heart1.boundingRectangle.setHeight(super.boundingRectangle.getHeight()/2);
    heart1.setColor(Color.green);

    this.heart1.paint(g);
    
    
    p2 = new Point(super.boundingRectangle.getCenter().x + super.boundingRectangle.getWidth()/4 , super.boundingRectangle.getCenter().y - super.boundingRectangle.getHeight()/4);
    w2 = super.boundingRectangle.getWidth()/2;
    h2 = super.boundingRectangle.getHeight()/2;
    heart2.setboundingRectangle(p2, w2, h2 );
    heart2.boundingRectangle.setHeight(super.boundingRectangle.getHeight()/2);
    heart2.setColor(Color.red);

    this.heart2.paint(g);


    



   
  
   //TestHatPG
    //TestIceCreamConePG
    //TestHeartPG
   
 } 

}

