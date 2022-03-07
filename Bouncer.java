/**
 * This  is a Bouncer interface.
 *
 * @author Cathy 
 *
 * Andrew ID:  snwanyim 
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *         
 *
 */


import java.awt.*;

public interface Bouncer
{
    void move();
    void paint(Graphics g);
    void setShapeX(int x);
    void setShapeY(int y);
    void setXAndY(int x, int y);
    void setColor(Color c);
    void setColor(String c);
    Point getBottomRightPoint();
}