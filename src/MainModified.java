import java.util.Scanner;

public class MainModified //game modified for Lab 3. No objects in this class
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a dice game, please guess a number between 1 & 6: ");
        int userGuess = input.nextInt();
        int computerGuess = Dice.OneThrow(); //calls the static method
        
        System.out.println("You guessed " + userGuess + "!");
        System.out.println("The computer rolled " + computerGuess + "!");
        
        if ((userGuess < 1 || userGuess > 6))
        {
            System.out.println("You have to gues a number from 1 to 6.");
        }
        
        else if (userGuess == computerGuess)
        {
            System.out.println("You guessed it correct!");
        }
        
        else
        {
            System.out.println("You guessed incorrect.");
        }
    }
}