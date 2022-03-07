

import java.util.*;
import java.awt.*;  // import the AWT graphic classes
import javax.swing.*;   // import the Swing classes
/**
 * This is PlayGame Class program.
 *
 * @author Sunday Jacob Nwanyim
 *
 * Andrew ID: snwanyim
 * 
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */

public class PlayGame
{

public static void main(String args[]) 
{
    final LayoutGUI gui;
    String filename = "";
    if (args.length != 0)
    {
        filename = args[0];
       // wordsList.readInPhrases(filename);
    }
    else if (args.length == 0)
    {
        //filename = args[0];
      System.out.println("Please Enter phrase");
    }
//    HangmanGUI gui;
    gui = new HangmanGUI(filename);

    // Note: this is an anonymous inner-class that extends the Runnable class
    //       and overrides the run() method.

    javax.swing.SwingUtilities.invokeLater(new Runnable()
    {
        public void run()
        {
            createAndShowGUI(gui);
        }
    });
}
private static void createAndShowGUI(LayoutGUI gui)
{
    // Create a JFrame and get its content pane

    JFrame      theFrame = new JFrame(gui.getClass().getName() + " Application");
    Container   c = theFrame.getContentPane();
    

    // Tell the GUI to add its components to the frame

    gui.addComponents(theFrame);

    // Set the size of the frame and exit behavior

    theFrame.setPreferredSize(new Dimension(500, 400));
    theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // show the frame

    theFrame.pack();
    theFrame.setVisible(true);
}
}