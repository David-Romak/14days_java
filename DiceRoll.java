import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("     DICE ROLL      ");

        int numberOfDie = getUserInput();
        int score = 0;

        for (int roll = numberOfDie; roll > 0; roll--) {
            score += rollDie();
        }

        System.out.printf("Total: %d", score);

    }

    private static int getUserInput() {
        while (true) {
            System.out.print("Enter the number of die to roll: ");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                scanner.nextLine();

                if (num > 0)
                    return num;
                System.out.println("Error: Number can't be 0 or -ve");
            } else {
                scanner.nextLine();
                System.out.println("Invalid input: Numbers only please");
            }

        }

    }

    private static int rollDie() {

        int rolledScore = random.nextInt(1, 7);
        printDie(rolledScore);
        System.out.println("Rolled " + rolledScore);
        return rolledScore;
    }

    private static void printDie(int rolledScore) {
        switch (rolledScore) {
            case 1 -> System.out.println("""
                    |---------|
                    |         |
                    |   .     |
                    |         |
                    |_________|
                    """);

            case 2 -> System.out.println("""
                    |---------|
                    |         |
                    |   .  .  |
                    |         |
                    |_________|
                    """);
            case 3 -> System.out.println("""
                    |---------|
                    |      .  |
                    |    .    |
                    |  .      |
                    |_________|
                    """);
            case 4 -> System.out.println("""
                    |---------|
                    |  .   .  |
                    |         |
                    |  .   .  |
                    |_________|
                    """);
            case 5 -> System.out.println("""
                    |---------|
                    | .    .  |
                    |   .     |
                    | .   .   |
                    |_________|
                    """);
            case 6 -> System.out.println("""
                    |---------|
                    | .    .  |
                    | .    .  |
                    | .    .  |
                    |_________|
                    """);
        }
    }
}



/*
 * 
 */