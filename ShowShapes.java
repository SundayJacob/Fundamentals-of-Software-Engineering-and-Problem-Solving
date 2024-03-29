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

public class ShowShapes
{

public static void main(String argv[]) throws IOException
{
    JFrame frame = new JFrame();
    HoldShapes shapes;
    shapes = new HoldShapes();
    IceCreamConePG ice = new IceCreamConePG();
    
    

    //------------ You write the code ----------------

    // Prompt for the number of scoops then prompt for each color and call
    // shapes.addScoop(). You will finish addScoop() in HoldShapes - it should take one
    // argument that is the color to use. Note: see Hold.java for more comments.
    
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    int n;
    String str;
    System.out.print("How many scoops do youn want");
    str = keyboard.readLine();
    n = Integer.parseInt(str);
    //shapes.boundingRectangle.set
    ice.setNumOfScoops(n);
    
    
    for (int i = 0; i<ice.getNumOfScoops(); i++)
    {
        System.out.println("Enter Color for scoop"+ (i+1));
        str = keyboard.readLine();
        shapes.addScoop(str);
    }
    
    System.out.println("Thanks for ordering " + n +  " scoops! Close the window when done.");
    
    





    frame.setSize(1000, 850);
    shapes.setSize(frame.getSize());
    shapes.setPreferredSize(frame.getSize());
    frame.add(shapes);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}

}
