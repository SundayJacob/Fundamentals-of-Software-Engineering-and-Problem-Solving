/**
 * This program convert a very large binary number to hex.
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

public class HexFun
{

    public static void main(String[] args) throws IOException
    {
        // TODO Auto-generated method stub

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a binary number: ");
        String binaryNumber = keyboard.readLine();
        System.out.println("The binary number " + binaryNumber + " is: 0x" + convertToHex(binaryNumber) + " in hex");

    }

    public static String convertToHex(String binaryNumber)
    {
        String sub = ""; // chunk of 4 binary digits
        String hexNum = ""; // The converted binary to Hex.
        int N = binaryNumber.length(); // The length of the inputed binary
        int a = N; // used for the substring
        for (int j = N; j >= 0; j -= 4)
        {
            if (a > 3)
            {
                sub = binaryNumber.substring(a - 4, a);
                hexNum = convertHexDigit(sub) + hexNum;
            } 
            else
            {
            }
            a = j - 4;
            if (j < 4 && j > 0)
            {
                sub = binaryNumber.substring(0, j);
                hexNum = convertHexDigit(sub) + hexNum;
                break;
            }
        }

        return hexNum;
    }

    public static String convertHexDigit(String binaryNumber)
    {
        int decimalInt = Integer.parseInt(binaryNumber, 2);
        String hex = Integer.toHexString(decimalInt);
        String hexadecimal;
        hexadecimal = hex.toUpperCase();

        return hexadecimal;

    }

}
