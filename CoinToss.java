/**
 * This program is a program.
 *
 * @author Sunday Jacob Nwanyim
 *
 * Andrew ID: snwanyim
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *         
 *
 */

public class CoinToss
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int heads = 0;
        int tails = 0;

        Coin myCoin = new Coin();
        int N = Integer.parseInt(args[0]);

        for (int i = 1; i <= N; i++)
        {
            myCoin.flip();

            if (myCoin.isHeads())
            {
                heads++;
            } 
            else
            {
                tails++;
            }
        }

        System.out.println("java CoinToss " + args[0]);
        System.out.println("Tossed a Coin " + N + " times.");
        System.out.println("Heads " + heads + " tails: " + tails);
        System.out.println("Heads " + formatPercent(heads, N) + " tails: " + formatPercent(tails, N));

    }

    public static String formatPercent(double headTailValue, double N)
    {

        double percentage;
        percentage = (headTailValue / N) * 100;

        return percentage + "%";

    }

}
