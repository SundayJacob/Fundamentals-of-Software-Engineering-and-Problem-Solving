
/**
 * This program is a DiamondPG Bouncer program named after my AndrewID.
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

public class SnwanyimBouncer extends DiamondPG implements Bouncer 
{
    //OvalPG oval = new OvalPG();

    @Override
    public void move()
    {
        // TODO Auto-generated method stub
//        setShapeX(super.getBoundingR().x +10);
//        setShapeY(super.getBoundingR().y +10);
        super.setTopLeftX(getTopLeft().x + 10);
        super.setTopLeftY(getTopLeft().y + 10);



    }

    @Override
    public void paint(Graphics g)
    {
        // TODO Auto-generated method stub
        super.paint(g);
        //oval.paint(g);


    }

    @Override
    public void setShapeX(int x)
    {
        // TODO Auto-generated method stub
        //super.getTopLeft().x = x;
        super.getBoundingR().x =x;
        

        

    }

    @Override
    public void setShapeY(int y)
    {
        // TODO Auto-generated method stub
        //super.getTopLeft().y = y;
       // super.setTopLeftY(y);
        super.getBoundingR().y =y;



    }

    @Override
    public void setXAndY(int x, int y)
    {
        // TODO Auto-generated method stub
        //Point p = new Point( super.getTopLeft().x, super.getTopLeft().y );
        
        //super.setXY(x, y);
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
        //return null;
        return super.getBottomRight();

    }

    @Override
    public String toString()
    {
        return "SnwanyimBouncer []";
    }
    
    

}
