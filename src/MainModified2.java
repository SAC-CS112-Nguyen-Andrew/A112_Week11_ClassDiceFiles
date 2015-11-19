import java.util.Scanner;

public class MainModified2 //game modified for Lab 5
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        Dice randomDice = new Dice();
        int maxSide = 6; 
        int largestNumberToGuess;
        
        System.out.println();
        System.out.println("Welcome to Dice Game.");
        System.out.println("How many dices do you want to play with?");
        int dicesToPlayWith = input.nextInt();
        
        largestNumberToGuess = maxSide * dicesToPlayWith; //calculates the highest number you can guess
        
        System.out.printf("You picked %d dice(s) to play with, please guess a number from 1 to %d: %n", dicesToPlayWith, largestNumberToGuess);
        int userGuess = input.nextInt();
        if (userGuess <1 || userGuess > largestNumberToGuess)
        {
            System.out.printf("Sorry, you have to gues a number from 1 to %d.%n", largestNumberToGuess);
            return;
        }
        
        else
        {
        System.out.println("Please pick the number of times you wish the dice to bounce. This is a simulation.: ");
        int bounce = input.nextInt();
        
        randomDice.Throw(dicesToPlayWith, bounce); //uses our object we created to look for a method with two parameters in the Dice class
        
        randomDice.Value(); //returns the value of the Throw method
        System.out.printf("You guessed %d! and the computer generated %d!%n", userGuess, randomDice.Value());
        
        if (userGuess == randomDice.Value())
        {
            System.out.println("You guessed it correct!");
        }
        
        else
        {
            System.out.println("You guessed incorrect.");
        }
        }
}
}