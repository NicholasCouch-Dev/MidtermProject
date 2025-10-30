/**
 * CSC 1060 IN2
 * Instructor: Jim Eberle
 * Homework# : Midterm Project
 * Date: 10/05/2025
 * Class: Midterm
 * @author: Nicholas Couch
 * Description: Midterm Programming Project
 */

import java.util.Scanner;
import java.util.Random;

public class Main {
   public static void main(String[] args) {
      //First we set up our Scanner and gather our initial user input//

      Scanner input = new Scanner(System.in);
      Random rand = new Random();

      System.out.print("Please enter your name: ");
      String playerName = input.nextLine();
      // Next we set our variables for wins and losses
      int wins = 0;
      int losses = 0;
      int doubleWins = 0;
      boolean playAgain = true;

      System.out.println("Welcome to A Game of Craps " + playerName + "!");
      // Here we set up our logic for hour our craps game works//
      while (playAgain) {
         int dice1 = diceRoll(rand);
         int dice2 = diceRoll(rand);
         int sum = dice1 + dice2;

         System.out.println("You rolled: ");
         dicePrint(dice1);
         dicePrint(dice2);
         System.out.println("Total: " + sum);

         if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("Craps! Sorry, you lose.");
            losses++;
         } else if (sum == 7 || sum == 11) {
            System.out.println("Natural! You win!");
            wins++;
         } else {
            int point = sum;
            System.out.println("Point is established at " + point + ".");
            boolean rollAgain = true;

            while (rollAgain) {
               dice1 = diceRoll(rand);
               dice2 = diceRoll(rand);
               sum = dice1 + dice2;

               System.out.println("You rolled: ");
               dicePrint(dice1);
               dicePrint(dice2);
               System.out.println("Total: " + sum);

               if (sum == point) {
                  System.out.println("You made your point, you win!");

                  if (point % 2 == 0 && dice1 == dice2 && dice1 + dice2 == point) {
                     System.out.println("That's doubles matching the point! Nice BIG WIN!");
                     doubleWins++;
                  } else {
                     wins++;
                  }
                  rollAgain = false;

               } else if (sum == 7) {
                  System.out.println("You rolled A 7. You lose.");
                  losses++;
                  rollAgain = false;
               }
            }
         }
         // Here we set up our sentinel value so the player can continue if they would like to or quit.//
         System.out.print("Would you like to play again? (y/n): ");
         String playerAnswer = input.nextLine();
         if (playerAnswer.equalsIgnoreCase("y")) {
            playAgain = true;
         } else {
            playAgain = false;
         }
      }
      //This is our logic for the stats screen at the end of the game
      System.out.println("Game over! Here is your stats: ");
      System.out.println("Wins: " + wins);
      System.out.println("Double Wins: " + doubleWins);
      System.out.println("Losses: " + losses);
   }

      // Here is our methods for the dice roll and our dice print out//
   public static int diceRoll(Random rand) {
      return rand.nextInt(6) + 1;
   }

   public static void dicePrint(int value) {
      System.out.println("+-------+");
      if (value == 1) {
         System.out.println("|       |");
         System.out.println("|   *   |");
         System.out.println("|       |");
      } else if (value == 2) {
         System.out.println("|*      |");
         System.out.println("|       |");
         System.out.println("|      *|");
      } else if (value == 3) {
         System.out.println("| *     |");
         System.out.println("|   *   |");
         System.out.println("|     * |");
      } else if (value == 4) {
         System.out.println("|*     *|");
         System.out.println("|       |");
         System.out.println("|*     *|");
      } else if (value == 5) {
         System.out.println("|*     *|");
         System.out.println("|   *   |");
         System.out.println("|*     *|");
      } else if (value == 6) {
         System.out.println("|*     *|");
         System.out.println("|*     *|");
         System.out.println("|*     *|");
      }
      System.out.println("+-------+");
   }
}