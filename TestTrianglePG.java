/**
 * This program is a TestTrianglePG program. 
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

public class TestTrianglePG
{
public static void main(String[] args) throws IOException
{
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    
    // Declare and instantiate the variables you need to prompt for the centerX and centerY,
    // the width and height, and the color.
    // ---------- You write the code here:
    
    
    int centerX=200;
    //centerX = 50;
    int centerY=100;
    //centerY = 40;
    int width;
    //width = 200;
    int height;
    //height = 100;
    Color color;
    color = Color.black;
    Point p = new Point(centerX, centerY);

    // Create your shape and call the constructor. Call your variable shape.
    // ---------- You write the code here:
    

    TrianglePG shape = new TrianglePG();
    shape.setShape(TrianglePG.TriangleShape.DOWN);
    shape.setCenter(new Point(centerX, centerY));
    shape.getTopLeft();
   


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
    
    

    shape.setBoundingRectangle(p, 200, 200);
    shape.setColor(Color.black);
    shape.setDebug(false);

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
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    String str;
    System.out.print("Please Enter Center X and Center Y: [eg. 10,10] ");
    str = keyboard.readLine();
    //int center;
    String [] center = new String[2];
    String [] dimension = new String[2];
    while(!str.equals(""))
    {
        center = str.split("[,]");
        centerX = Integer.parseInt(center[0]);
        centerY = Integer.parseInt(center[1]);
        p = new Point(centerX, centerY);

        System.out.print("Please Enter Width  and Height : [eg. 10,10] ");
        str = keyboard.readLine();
        dimension = str.split("[,]");
        width = Integer.parseInt(dimension[0]);
        height = Integer.parseInt(dimension[1]);
        //shape.getboundingRectangle().setTopLeft(p);
        

        System.out.print(" Please enter color ");
        str = keyboard.readLine();
        color = ColorConverter.getColor(str);
        shape.setColor(Color.red);
        
        shape.setBoundingRectangle(p, width, height);
        shape.setColor(color);
        shape.repaint();
        
        System.out.print("Please Enter Center X and Center Y: [eg. 10,10] ");
        str = keyboard.readLine();
        
        
        
        
    }
    System.out.println("Please enter a valid center. e.g 10,10");
 
    
    System.out.println("Finished testing. Close the window when finished.");
}

}
