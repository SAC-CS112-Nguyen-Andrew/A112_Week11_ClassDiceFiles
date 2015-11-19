import java.util.Scanner;

public class Main //Lab 1 and Lab 2 's Main
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        Dice randomDice = new Dice(); //if you want put an arguement of type Int in the parameters to implement Throw() or leave blank
        System.out.println("This is a dice game, please guess a number between 1 & 6: ");
        int userGuess = input.nextInt();
        randomDice.Throw(2);
        randomDice.Value();
        
        System.out.println("You guessed " + userGuess + "!");
        System.out.println("The computer rolled " + randomDice.Value() + "!");
        
        if ((userGuess < 1 || userGuess > 6))
        {
            System.out.println("You have to gues a number from 1 to 6.");
        }
        
        else if (userGuess == randomDice.Value())
        {
            System.out.println("You guessed it correct!");
        }
        
        else
        {
            System.out.println("You guessed incorrect.");
        }
    }
}