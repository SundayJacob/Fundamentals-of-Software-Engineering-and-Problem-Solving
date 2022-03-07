/**
 * This is a PrintRightTriangle program.
 *
 * @author Sunday Jacob Nwanyim
 *
 * Andrew ID: snwanyim
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */


import java.io.*;

public class PrintRightTriangle
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        int width;
        String art;
        String loc;
        String wd = " ";
        while (!wd.equals(""))
        {
            System.out.print("Enter triangle width: ");
            wd = keyboard.readLine();
            if (wd.equals(""))
            {
                break;
            } 
            else
            {
                width = Integer.parseInt(wd);
            }
            System.out.println("Enter desired art to print: ");
            art = keyboard.readLine();

            System.out.println("Enter the location (bl, tl, tr or br): ");
            loc = keyboard.readLine();

            RightTriangle tR = new RightTriangle(width, art, loc);
            tR.drawAsciiArt();
        }

    }

}
