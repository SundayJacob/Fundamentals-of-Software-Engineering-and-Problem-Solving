/**
 * This program is a TestRectanglePG program.
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
import java.io.*;

import javax.swing.*;

public class TestRectanglePG
{
public static void main(String[] args) throws IOException
{
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    
    // Declare and instantiate the variables you need to prompt for the centerX and centerY,
    // the width and height, and the color.
    // ---------- You write the code here:
    
    int centerX;
    centerX = 200;
    int centerY;
    centerY = 200;
    int width;
    width = 200;
    int height;
    height = 100;
    Color color;
    color = Color.black;
    Point p = new Point(centerX, centerY);

    // Create your shape and call the constructor. Call your variable shape.
    // ---------- You write the code here:
    

    RectanglePG shape = new RectanglePG();
   


    panel.add(shape);   // add your shape to the displayed screen

    // Do not change these. We will talk about the code as time permits.

    panel.setBackground(Color.white);
    frame.add(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(700, 700);
    frame.setVisible(true);
    shape.setSize(frame.getSize());
    shape.setPreferredSize(frame.getSize());
    
    /*
     * Use your setters to setup the initial attributes for your shape.
     * Don't forget to set debug on.
     */

    // ---------- You write the code here:
    shape.setDebug(true);
    shape.setboundingRectangle(p, width, height);
    shape.setColor(color);

    /*
     * Prompt the user for the attributes, starting with the x and y coordinates of the center.
     *      Then prompt for width,height
     *      Then prompt for the color.
     *      Use your setters to re-set the attributes.
     *      Right before re-prompting, call shape.repaint() to update the picture.
     * Continue prompting until they press enter when asked for x,y.
     *
     */

    // ---------- You write the code here:

    // This is printed when the user exits your input loop.
    System.out.println("Finished testing. Close the window when finished.");
}

}