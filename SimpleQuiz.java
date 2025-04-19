import java.util.Scanner;

public class SimpleQuiz {
    public static void main(String[] args) {
        // pause a question to the user
        // pick his answer
        // check the answer , if correct -> add a point
        // display his score
        System.out.println("Java Quiz Game");
        pauseQuestions();

    }

    private static void pauseQuestions() {
        try (Scanner scanner = new Scanner(System.in)) {

            int score = 0;

            String[] questions = {
                    "What's the capital city of Uganda? ",
                    "Can Java be used on the backend? "
            };

            String[][] options = {
                    { "A. Kampala", "B. Nigeria", "C. Dibuti" },
                    { "A. No", "B. Yes" },
            };

            char[] answers = { 'A', 'B' };

            for (int i = 0; i < questions.length; i++) {
                System.out.printf("Question %d%n", i + 1);
                System.out.println(questions[i]);

                for (String option : options[i]) {
                    System.out.println(option);
                }
                System.out.print("Enter your answer: ");
                char userGuess = scanner.next().toUpperCase().charAt(0);
                if (userGuess == answers[i])
                    score++;
            }
            System.out.printf("Score: %d out of %d", score, questions.length);
        }
    }
}

/*
 * Add difficulty levels
 * Implement Categories
 * Group questions by topics like Geography, Programming, etc.
 * 
 * Add Timer
 * Give users limited time to answer each question
 * 
 * Store Questions in File
 * Read questions from a text file or CSV
 */