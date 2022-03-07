
/**
 * This program is a Guess The Number game.
 *
 * @author Sunday Jacob Nwanyim
 *
 * Andrew ID: snwanyim
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */

import java.io.*; 
import java.util.*;

public class GuessTheNumber
{
    static Random r = new Random();

    public static void main(String[] argv) throws IOException
    {
        // TODO Auto-generated method stub
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String name;
        String str;
        int number;
        // String name;

        int maxRange;
        name = promptForName(keyboard);
        maxRange = 1 + r.nextInt(1000);
        number = guess(maxRange);

        System.out.println("Thanks for playing the Guess-The-Number Game " + name + " !");

//                How many times should you prompt for their name?
//                Where should you prompt for their name?
//                Where should the random maxRange be generated?
//                How often should the random maxRange be generated?
//                Where should the random number to guess be generated?
//                Where do you prompt to play again?
//                Where do you print the message about knowing or not knowing the secret?

        System.out.println("Congratulations you guessed the number " + number);

        System.out.println("Thanks for playing the Guess-The-Number Game " + name + " !");

        if (number < log2(maxRange))
        {
            System.out.println("You Know the Secret!");

        } 
        else
        {
            System.out.println("You should be able to do better!");

        }
        
        
        
        System.out.println("Hello " + name + " Would you want to play again? yes/no");

        str = keyboard.readLine();
        if (isYes(str) == true)
        {
            guess(maxRange);
        }

    }

    public static int guess(int maxRange) throws IOException
    {
        int numGuesses = 0;
        // int maxRange;
        int number;
        String str;

        int guess;
        // str = keyboard.readLine();
        // guess = Integer.parseInt(str);

        number = 1 + r.nextInt(maxRange);
        System.out.println("maxRange is: " + maxRange);
        //System.out.println("number is: " + number);

        while (true)
        {
            System.out.print("Hi , I am thinking of a number from 1-" + maxRange + "Guess the number.");

            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

            str = keyboard.readLine();
            guess = Integer.parseInt(str);
            numGuesses++;

            if (guess == number)
                break;
            if (guess < number)
                System.out.print("Too low.");
            else
                System.out.print("Too high.");
            System.out.println("Try again");

        }
        return numGuesses;

    }

    public static String promptForName(BufferedReader Keyboard) throws IOException
    {
        String name;
        System.out.print("Please Enter your name: ");
        name = Keyboard.readLine();

        return name;
    }

    public static int log2(int n)
    {
        int logBase2 = (int) Math.round(Math.log10(n) / Math.log10(2));

        return logBase2;

    }

    public static boolean isBlank(String s)
    {
        String blankString = s.replaceAll("s/.*[    ]//", "");

        if (blankString.equals(""))
        {
            return true;
        }

        return false;

        // return "";
    }

    public static boolean isYes(String str)

    {
        str = str.toLowerCase();

        if (isBlank(str) == true)
        {
            return true;
        }

        if (str.equals("y"))
        {
            return true;
        }

        // return false;
        if (str.equals("yes"))
        {
            return true;
        }

        if (str.equals("yep"))
        {
            return true;
        }

        return false;

    }

}
