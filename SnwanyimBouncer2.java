/**
 * This program is a IceCreamConePG Bouncer program named after my AndrewID.
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

public class SnwanyimBouncer2 extends IceCreamConePG implements Bouncer
{
    //IceCreamConePG ice = new IceCreamConePG();

    @Override
    public void move()
    {
        // TODO Auto-generated method stub

        super.setTopLeftX(getTopLeft().x + 8);
        super.setTopLeftY(getTopLeft().y + 8);

        

    }

    @Override
    public void paint(Graphics g)
    {
        // TODO Auto-generated method stub
        super.paint(g);
        
        

    }

    @Override
    public void setShapeX(int x)
    {
        // TODO Auto-generated method stub
       // super.getTopLeft().x = x;
//        super.setTopLeftX(x);
        super.getBoundingR().x =x;


    }

    @Override
    public void setShapeY(int y)
    {
        // TODO Auto-generated method stub
       // super.getTopLeft().y = y;
//        super.setTopLeftY(y);
        super.getBoundingR().y =y;


    }

    @Override
    public void setXAndY(int x, int y)
    {
        // TODO Auto-generated method stub
        //super.setXY(x, y);
        //Point p = new Point( super.getTopLeft().x, super.getTopLeft().y );
        super.getBoundingR().x =x;
        super.getBoundingR().y =y;


    }

    @Override
    public void setColor(Color c)
    {
        // TODO Auto-generated method stub
       super.setColor(c); 

    }

    @Override
    public void setColor(String c)
    {
        // TODO Auto-generated method stub
        super.setColor(ColorConverter.getColor(c)); 

    }

    @Override
    public Point getBottomRightPoint()
    {
        // TODO Auto-generated method stub
        //return ;
        return super.getBottomRight();
        
    }

    @Override
    public String toString()
    {
        return "SnwanyimBouncer2 []";
    }
    
    

}
