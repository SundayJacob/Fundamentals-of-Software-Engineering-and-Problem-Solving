
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
            int x[] ={ super.boundingRectangle.getTopMiddle().x, super.boundingRectangle.getBottomLeft().x, super.boundingRectangle.getBottomRight().x };

            // store all y points in an array for accessing
            int y[] ={ super.boundingRectangle.getTopMiddle().y, super.boundingRectangle.getBottomLeft().y,super.boundingRectangle.getBottomRight().y };

            g.drawPolygon(x, y, 3);
            g.setColor(getColor());
            g.fillPolygon(x, y, 3);

        } 
        else
        {
            int x[] = { super.boundingRectangle.getBottomMiddle().x, super.boundingRectangle.getTopLeft().x,super.boundingRectangle.getTopRight().x  };

            // store all y points in an array for accessing
            int y[] ={ super.boundingRectangle.getBottomMiddle().y, super.boundingRectangle.getTopLeft().y,super.boundingRectangle.getTopRight().y };

            g.drawPolygon(x, y, 3);
            g.setColor(getColor());
            g.fillPolygon(x, y, 3);
        }

        // TestTriangleUpPG

    }

}
