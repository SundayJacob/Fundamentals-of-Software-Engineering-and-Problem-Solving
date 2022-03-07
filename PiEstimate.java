/**
 * This is a PiEstimate program.
 *
 * @author Sunday Jacob Nwanyim
 *
 * Andrew ID: snwanyim
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PiEstimate
{
    private static int m = 0;

    public static void main(String[] args) throws IOException
    {
        // TODO Auto-generated method stub
        String str;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of terms: ");
        str = keyboard.readLine();
        int n = Integer.parseInt(str);
        double returnValue = returnPiValue(n);
        if (Math.round(returnValue * 100000.0) / 100000.0 < 3.14159)
        {
            System.out.println("Searched for 3.14159, not found after " + n + " terms.");

        }

        if (Math.round(returnValue * 100000.0) / 100000.0 != 3.14159)
        {
            System.out.println("Searched for 3.14159, not found after " + n + " terms.");

        }
//        if (Math.round(returnValue * 100000.0)/100000.0 > 3.14159 && Math.round(returnValue * 100000.0)/100000.0 !=3.14159 )
//        {
//            System.out.println("Searched for 3.14159, not found after " +  m + " terms.");
//            
//        }

//        else if ( Math.round(returnValue * 100000.0)/100000.0 ==3.14159 )
//
//
//        {
//            System.out.println("Searched for 3.14159, found after " + m + " terms");
//
//        }
//        
        System.out.println("Pi for " + n + " terms is. " + Math.round(returnValue * 100000.0) / 100000.0);

    }

    public static double returnPiValue(int n)
    {
        double den = 1.0;

        boolean flag = true;
        double pi = 0;
        int count = 1;
        // int m=0;

        while (count <= n)
        {
            if (flag == true)
            {
                pi = pi + 4 / den;
                flag = false;
            } 
            else
            {
                pi = pi - 4 / den;
                flag = true;
            }
            den = den + 2.0;

            if (count <= 5 || count >= n - 4)
            {
                // System.out.println("The first 5 terms");
                System.out.println("term " + count + " : " + (Math.round(pi * 100000.0) / 100000.0));
            }
            
//            if (count < 1)
//
//            {
//                System.out.println("The first 5 values are");
//
//            }

            if (count == 6)

            {
                System.out.println("The last 5 values are");

            }

            if (Math.round(pi * 100000.0) / 100000.0 == 3.14159 && m == 0)
            {
                // System.out.println("Searched for 3.14159, not found after " + m + " terms.");
                // && m==0
                m = count;
                // System.out.println("Searched for 3.14159, found after " + m + " terms");

                // System.out.println("Searched for 3.14159, found after " + m + " terms");

                // return 0;
            }
            // System.out.println("term " + count + " : " + pi);
            count++;
        }
        System.out.println("Searched for 3.14159, found after " + m + " terms");

        return Math.round(pi * 100000.0) / 100000.0;

    }

}
