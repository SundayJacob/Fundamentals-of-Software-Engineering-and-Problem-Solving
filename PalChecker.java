/**
 * This program checks whether or not a given word is a palindrome.
 *
 * @author Sunday Jacob Nwanyim
 *
 * Andrew ID: snwanyim
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */



import java.io.*;

public class PalChecker
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter words to check for palindrome: ");
        String pal_1;
        pal_1 = keyboard.readLine();
        String pal = pal_1.trim();
        String pal2 = strippedString(pal);
        String str2 = reverse(pal2);
        if (pal2.equals(str2))
        {
            System.out.println(pal_1 + " IS a palindrome");
        } 
        else
        {
            System.out.println(pal_1 + " is NOT a palindrome");
        }
    }

    // Method to strip string
    public static String strippedString(String pal)
    {
        // String stripString = pal.replaceAll("[^a-zA-Z_0-9]", "");
        String stripString = pal.replaceAll("[,.!?;:-]", "");
        // String stripString = pal.replaceAll("[p{punct}]", "");

        stripString = stripString.toLowerCase();
        return stripString; // \s\t.,!\\@#\"$%^&*:?;'
    }

    // Method to reverse string
    public static String reverse(String s)
    {
        String revString = "";
        int N = s.length();
        // int a=N;
        for (int i = N; i > 0; i--)
        {
            String sub = s.substring(i - 1, i);
            revString = revString + sub;
        }

        return revString;
    }

}
