
/**
 * This program is a Word count program.
 *
 * @author Sunday Jacob Nwanyim
 *
 * Andrew ID: snwanyim
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */

import java.io.*;

public class WordCount
{

    public static void main(String[] args) throws IOException
    {

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String[] user_input = new String[10];
        String[] letters;

        String str = "";
        int lineCount = 0;
        int letterCount = 0;
        System.out.println("Please enter a string, press Enter to end: ");
        str = keyboard.readLine();

//        while(true)
//        {
//            lineCount ++;
//            if (lineCount>10)
//            {
//                //break;
//                System.out.println("You cannot enter more than 10 lines of data");
//            }
//           // return false;
//        }

        while (!(str.equals("")) && lineCount != 10)
        {
            letterCount = letterCount + str.length();
            user_input[lineCount] = str;
            System.out.println("Please enter a string, press Enter to end: ");
            str = keyboard.readLine();

            // System.out.println("You cannot enter more than 10 lines of data");

            lineCount++;
        }

//        for (int i = lineCount; i<15; i++)
//        {
//            if (i >10)
//            {
//              System.out.println("You cannot enter more than 10 lines of data");
//
//            }
//            else
//                System.out.println();
//            lineCount++;
//
//            
//
//        }
        System.out.println("Thank you for entering " + lineCount + " lines of data" + " Here are your results:");

//        

        // letters = splitLetters(user_input, letterCount);

        for (int i = 0; i < user_input.length; i++)
        {
            String[] words = user_input[i].split("\\s+|,\\s*|\\.\\s*|;\\s*");
            // String[] words = user_input[i].split(",");
            String[] sentences = user_input[i].split("[.;]");

            letters = splitLetters(user_input[i], user_input[i].length());

            System.out.println("**Line " + (i + 1) + ":");
            System.out.println("Counts (letters, words, sentences): " + letters.length + " " + words.length + " "
                    + sentences.length);
            System.out.println();

            printArray("letters", letters);
            System.out.println();
            printArray("Words", words);
            System.out.println();
            printArray("Sentences", sentences);

            System.out.println();
        }

    }

    public static String[] splitLetters(String inputed, int letterSize)
    {
        String[] characters = new String[letterSize];

        for (int i = 0; i < inputed.length(); i++)
        {
            characters[i] = String.valueOf((inputed.charAt(i)));
        }

        return characters;
    }

    public static void printArray(String label, Object array[])
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.format(label + "[%d]: " + array[i], i);
            System.out.println();
        }
    }

}