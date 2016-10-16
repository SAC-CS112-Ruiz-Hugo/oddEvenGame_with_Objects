/**
 * Created by Culebra on 10/9/2016.
 */

import java.util.Scanner;
import java.util.Random;

public class oddEvenGame_with_Objects
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int n = rand.nextInt(2);

        int userInput;
        int computerGuess;
        computerGuess = n;

        Game();
        userInput = in.nextInt();

        if (userInput == 0 && computerGuess == 0)
        {
            System.out.println("User Wins!");
        }
        else if (computerGuess == 1 && computerGuess == 1)
        {
            System.out.println("User Wins!");
        }

        if (userInput == 1 && computerGuess == 0)
        {
            System.out.println("Sorry, you lose.");
        }
        else if (userInput == 0 && computerGuess == 1)
        {
            System.out.println("Sorry, you lose.");
        }
    }

    public static void Game()
    {
        System.out.println("Please choose Even(0) or Odd (1)");
    }
}