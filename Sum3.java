/**
 * This program calculate the sum of all integers that are divisible by 3, from 1 to N.
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

public class Sum3
{

    public static void main(String[] args) throws IOException
    {
        // TODO Auto-generated method stub
        String str;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            System.out.print("Enter a number: ");
            str = keyboard.readLine();
            int n = Integer.parseInt(str);
            if (n < 0)
            {
                break;
            }
            System.out.println("Sum3 for the number " + n + " is " + calcResult(n));

        }

    }

    public static int calcResult(int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
        {

            if (i % 3 == 0)
            {
                sum = sum + i;

            }

        }
        return sum;
    }

}
