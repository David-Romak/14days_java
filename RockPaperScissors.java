import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static int userWins = 0;
    private static int computerWins = 0;
    private static int ties = 0;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("      ROCK PAPER SCISSORS     ");

            while (true) {
                System.out.print("\nEnter your choice (rock, paper, scissors, quit): ");
                String userChoice = scanner.nextLine().trim();
                if (userChoice.equals("quit"))
                    break;
                String computerChoice = getComputerChoice();
                displayWinner(userChoice, computerChoice);

            }
            System.out.printf("Your wins: %d%nComputer wins: %d%nTies: %d", userWins, computerWins, ties);
            System.out.println("\nWe're always ready for another game. Thanks for playing");
        }

       
    }

    private static String getComputerChoice() {
        Random random = new Random();

        String[] choices = { "rock", "paper", "scissors" };

        int index = random.nextInt(0, choices.length);
        String choice = choices[index];
        return choice;

    }

    private static void displayWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie");
            updateRecords();
            System.out.printf("You chose %s and the computer chose %s%n", userChoice, computerChoice);
            return;
        }

        String winAction = switch (userChoice) {
            case "rock" -> "paper";
            case "paper" -> "scissors";
            case "scissors" -> "rock";
            default -> {
                System.out.println("Invalid choice\nDefaulted to rock");
                yield "paper"; //coz its paper that wins rock
            }
        };

        String winner = computerChoice.equals(winAction) ? "Computer" : "You";
        updateRecords(winner);
        System.out.printf("%s won%n", winner);
        System.out.printf("You chose %s and the computer chose %s", userChoice, computerChoice);
    }

    private static void updateRecords(String winner) {
        if (winner.equals("Computer")) {
            computerWins++;
        } else if (winner.equals("You")) {
            userWins++;
        }
    }

    private static void updateRecords(){
        ties++;
    }
}

/*
 * Add different difficulty levels
 * 
 * Implement a tournament mode
 * 
 * Save high scores to a file
 * 
 * Add multiplayer functionality
 * 
 * Create a GUI version
 */
