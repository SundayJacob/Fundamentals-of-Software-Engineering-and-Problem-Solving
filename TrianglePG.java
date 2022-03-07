
/**
 * This program is a TrianglePG program. 
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

public class TrianglePG extends PositionalGraphic
{
    private TriangleShape shape;

    public enum TriangleShape
    {
        UP, DOWN;
    }

    public TrianglePG()
    {
        super();
        shape = TriangleShape.UP;

    }

    public TriangleShape getShape()
    {
        return shape;
    }

    public void setShape(TriangleShape shape)
    {
        this.shape = shape;
    }

    public void paint(Graphics g)
    {
        super.paint(g);

        if (shape == TriangleShape.UP)
        {
            int x[] ={ super.getTopMiddle().x, super.getBottomLeft().x, super.getBottomRight().x };

            // store all y points in an array for accessing
            int y[] ={ super.getTopMiddle().y, super.getBottomLeft().y,super.getBottomRight().y };

            g.drawPolygon(x, y, 3);
            g.setColor(getColor());
            g.fillPolygon(x, y, 3);

        } 
        else
        {
            int x[] = { super.getBottomMiddle().x, super.getTopLeft().x,super.getTopRight().x  };

            // store all y points in an array for accessing
            int y[] ={ super.getBottomMiddle().y, super.getTopLeft().y,super.getTopRight().y };

            g.drawPolygon(x, y, 3);
            g.setColor(getColor());
            g.fillPolygon(x, y, 3);
        }

        // TestTriangleUpPG

    }

}
