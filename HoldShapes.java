
/**
 * This program is a HoldShapes program.
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
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class HoldShapes extends PositionalGraphic
{

// The ArrayList shapes holds a list of all your shapes. Look at what paint() does.

ArrayList<PositionalGraphic> shapes = new ArrayList<PositionalGraphic>();

// Note: this is an instance variable so addScoop() can access it. Make sure you instantiate it.

IceCreamConePG iceCreamCone;


public HoldShapes()
{
    
    // Instantiate each of your PG objects. Use your setters to set each one up. Then add each
    // of them to your shapes ArrayList.

    //------------ You write the code ----------------
    
    DiamondPG diamond = new DiamondPG();
    HalfCirclePG halfCircle = new HalfCirclePG();
    HatPG hat = new HatPG();
    HeartPG heart = new HeartPG();
    iceCreamCone = new IceCreamConePG();
    OvalPG oval = new OvalPG();
    RectanglePG rectangle = new RectanglePG();
    TrianglePG triangle = new TrianglePG();
    
    
    //diamond.boundingRectangle.setWidth(200);
    //iceCreamCone.setDebug(false);
    iceCreamCone.boundingRectangle.setWidth(200);
    iceCreamCone.boundingRectangle.setHeight(100);
    iceCreamCone.boundingRectangle.setCenter(new Point(200,100));
    iceCreamCone.setColor(Color.black);
    
    
    //diamond
   // diamond.setDebug(false);
    // diamond.setDebug(false);
    diamond.setDebug(false);
    diamond.boundingRectangle.setWidth(200);
    diamond.boundingRectangle.setHeight(100);
    diamond.boundingRectangle.setCenter(new Point(410,100));
    diamond.setColor(Color.blue);
    
    halfCircle.setDebug(false);
    halfCircle.boundingRectangle.setWidth(200);
    halfCircle.boundingRectangle.setHeight(100);
    halfCircle.boundingRectangle.setCenter(new Point(620,100));
    halfCircle.setColor(Color.blue);
    
    heart.setDebug(false);
    heart.boundingRectangle.setWidth(200);
    heart.boundingRectangle.setHeight(100);
    heart.boundingRectangle.setCenter(new Point(850,100));
    heart.setColor(Color.blue);
    
    hat.setDebug(false);
    hat.boundingRectangle.setWidth(200);
    hat.boundingRectangle.setHeight(100);
    hat.boundingRectangle.setCenter(new Point(200,300));
    hat.setColor(Color.blue);
    
    
    oval.setDebug(false);
    oval.boundingRectangle.setWidth(200);
    oval.boundingRectangle.setHeight(100);
    oval.boundingRectangle.setCenter(new Point(410,300));
    oval.setColor(Color.blue);
    
    rectangle.setDebug(false);
    rectangle.boundingRectangle.setWidth(200);
    rectangle.boundingRectangle.setHeight(100);
    rectangle.boundingRectangle.setCenter(new Point(620,300));
    rectangle.setColor(Color.blue);
    
    
    triangle.setDebug(false);
    triangle.boundingRectangle.setWidth(200);
    triangle.boundingRectangle.setHeight(100);
    triangle.boundingRectangle.setCenter(new Point(850,300));
    triangle.setColor(Color.blue);
    
    
    shapes.add(iceCreamCone);
    shapes.add(diamond);
    shapes.add(halfCircle);
    shapes.add(hat);
    shapes.add(heart);
    shapes.add(oval);
    shapes.add(rectangle);
    shapes.add(triangle);






    
    
    
    
    
}

public void addScoop(String color)
{
    
    //------------ You write the code ----------------

    // Call addScoop() in your IceCreamConePG class that takes the color for the new scoop.
    iceCreamCone.addScoop(color);
    
}

@Override
public void paint(Graphics g)
{
    // This code loops through and paints all of the shapes.
    for (PositionalGraphic shape:shapes)
    {
        shape.paint(g);
    }
}

}
