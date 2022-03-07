
/**
 * This program is a HatPG program.
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

public class HatPG extends PositionalGraphic
{
    HalfCirclePG crown = new HalfCirclePG();
    RectanglePG brim = new RectanglePG();
    
    Point p, p1;
    int w, w1;
    int h, h1;
    public HatPG()
    {
        
       
    }
    
    public void setDebug(boolean state)
    {
        super.setDebug(state);
        crown.setDebug(state);
        brim.setDebug(state);
    }

@Override
public void paint(Graphics g)
{
    super.paint(g);
    
    p = new Point(super.boundingRectangle.getCenter().x, super.boundingRectangle.getCenter().y + super.boundingRectangle.getHeight() * 3/8);
    w = super.boundingRectangle.getWidth();
    h = super.boundingRectangle.getHeight()/4;
    //cone.setShape(TrianglePG.TriangleShape.DOWN);
    //cone.boundingRectangle.setTopLeft(p);
    brim.setboundingRectangle(p, w, h );
    brim.boundingRectangle.setHeight(super.boundingRectangle.getHeight()/4);
    
    this.brim.paint(g);
    
    
    p1 = new Point(super.boundingRectangle.getCenter().x , super.boundingRectangle.getCenter().y - super.boundingRectangle.getHeight()/8);
    w1 = super.boundingRectangle.getWidth()/2;
    h1 = super.boundingRectangle.getHeight() * 6/8;
    crown.setboundingRectangle(p1, w1, h1 );
    crown.boundingRectangle.setHeight(super.boundingRectangle.getHeight() * 6/8);
    crown.setColor(Color.green);

    this.crown.paint(g);
    
   

//    int startAngle = 0;
//    int angleExtent = 180;
//
//    int topLeftHCX = super.boundingRectangle.getTopLeft().x +super.boundingRectangle.getWidth()/4;
//    int topLeftHCY = super.boundingRectangle.getTopLeft().y;
//    
//    int topLeftHatX = super.boundingRectangle.getTopLeft().x;
//    int topLeftHatY = super.boundingRectangle.getMiddleLeft().y + super.boundingRectangle.getHeight()/4 ; 
//    //int yleft = this.getHeight() + this.getHeight()/4; 
//    
    
   
//    g.drawArc(topLeftHCX, topLeftHCY, super.boundingRectangle.getWidth()/2, super.boundingRectangle.getHeight()*2, startAngle, angleExtent);
//    g.setColor(Color.green);
//    
//    g.fillArc(topLeftHCX, topLeftHCY, super.boundingRectangle.getWidth()/2, super.boundingRectangle.getHeight()*2, startAngle, angleExtent); 
//    
//    
//   g.drawRect(topLeftHatX, topLeftHatY, super.boundingRectangle.getWidth(), super.boundingRectangle.getHeight()/4);
//   g.setColor(Color.red);
//   g.fillRect(topLeftHatX, topLeftHatY, super.boundingRectangle.getWidth(), super.boundingRectangle.getHeight()/4);
    
   
   
  
   //TestHatPG
   
 } 

}
