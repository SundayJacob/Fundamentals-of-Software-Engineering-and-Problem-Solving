import java.io.*;
import java.util.*;
public class GuessTheNumber
{
    static Random r = new Random();

    public static void main(String[] argv) throws IOException
    {
        // TODO Auto-generated method stub
        String name;
        String str;
        int numGuesses = 0;
        int maxRange;
        int number;
        int guess;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        maxRange = 1 + r.nextInt(1000);
        number = 1 + r.nextInt(maxRange);
        System.out.println("maxRange is: " + maxRange);
        System.out.println("number is: " + number);

        name = promptForName(keyboard);
        System.out.println("Thanks for playing the Guess-The-Number Game " + name + " !");
        
        while(true)
        {
            System.out.print("Hi "+ name + ", I am thinking of a number from 1- " + maxRange + " Guess the number.");
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
        
        System.out.println("Congratulations you guessed the number " + numGuesses);

        System.out.println("Thanks for playing the Guess-The-Number Game " + name + " !");


    }
    
    public static String promptForName(BufferedReader Keyboard) throws IOException
    {
        String name;
        System.out.print("Please Enter your name: ");
        name = Keyboard.readLine();

        return name;
    }

}
