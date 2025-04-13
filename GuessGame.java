import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {

        System.out.println("      NUMBER GUESSING GAME      ");

        Random random = new Random();
        try (Scanner scanner = new Scanner(System.in)) {

            int randomNumber = random.nextInt(0, 11);
            int guess;
            int attempts = 0;

            do {
                System.out.print("Enter a guess between 0 and 10: ");
                guess = scanner.nextInt();
                if (guess > randomNumber) {
                    System.out.println("Too high");
                } else if (guess < randomNumber) {
                    System.out.println("Too low");
                }
                attempts++;
            } while (guess != randomNumber);

            System.out.println("Congrats!");
            System.out.printf("It took you %d attempts" , attempts);
        }
    }
}
