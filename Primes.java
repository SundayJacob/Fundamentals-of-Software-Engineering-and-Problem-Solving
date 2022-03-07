
/**
 * This program is prints the prime numbers using Seive of Eratosthenes
 * algorithms.
 *
 * @author Sunday Jacob Nwanyim
 *
 * Andrew ID: snwanyim
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *         
 *
 */

public class Primes
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        boolean prime[] = new boolean[1001];
        System.out.println("The prime numbers between 1 and 1000 are: ");
        System.out.println("1");

        for (int i = 2; i <= 1000; i++)
        {
            prime[i] = true; // true
        }

        for (int primeNum = 2; primeNum <= Math.sqrt(1000); primeNum++)
        {
            if (prime[primeNum])
                for (int j = primeNum; j * primeNum <= 1000; j++)
                {
                    prime[j * primeNum] = false;
                }

        }

        for (int i = 2; i <= 1000; i++)
        {
            if (prime[i])
            {
                System.out.println(i + "");
            }
        }

    }

}
