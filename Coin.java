
/**
 * This program is a coin helper class for the coin toss program. 
 *
 * @author Sunday Jacob Nwanyim
 *
 * Andrew ID: snwanyim
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */

import java.util.*;

public class Coin
{
    private static Random r = new Random();

    private static enum CoinSide
    {
        HEADS, TAILS

    }

    private CoinSide sideUp;

    public Coin()
    {
        sideUp = CoinSide.HEADS;
    }

    public boolean isHeads()
    {
        if (sideUp == CoinSide.HEADS)
        {
            return true;

        }
        return false;

    }

    public boolean isTails()
    {
        if (sideUp == CoinSide.TAILS)
        {
            return true;

        }
        return false;

    }

    public void flip()
    {
        // Generate a random number, either 0 or 1, and use it to set sideUp to HEADS or
        // TAILS
        int flipNum = r.nextInt(2);

        if (flipNum == 1)
        {
            sideUp = CoinSide.HEADS;
        } 
        else
        {
            sideUp = CoinSide.TAILS;
        }

    }

    public String toString()
    {
        return ("Coins side up is: " + sideUp);
    }
}