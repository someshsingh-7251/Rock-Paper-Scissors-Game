package src;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"Rock", "Paper", "Scissors"};
        // Instructions
        System.out.println("Welcome to Rock, Paper, Scissors Game!");
        System.out.println("Enter 0 for Rock, 1 for Paper, or 2 for Scissors.");
        // Player's turn
        System.out.print("Your choice: ");
        int playerChoice = scanner.nextInt();
        // Validate player's choice
        if (playerChoice < 0 || playerChoice > 2) {
            System.out.println("Invalid input! Please enter 0, 1, or 2.");
            return;
        }
        // Computer's turn
        int computerChoice = random.nextInt(3);
        System.out.println("Computer chose: " + options[computerChoice]);
        // Determine the result
        if (playerChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((playerChoice == 0 && computerChoice == 2) ||
                (playerChoice == 1 && computerChoice == 0) ||
                (playerChoice == 2 && computerChoice == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
        scanner.close();
    }
}
