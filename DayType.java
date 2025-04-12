import java.util.Scanner;

public class DayType {
    public static void main(String[] args) {
        /*
         * 
         * Scanner scanner = new Scanner(System.in);
         * 
         * System.out.print("Enter your full name "); String firstName = scanner.next(); String
         * lastName = scanner.next();
         * 
         * System.out.printf("%s %s" , firstName, lastName);
         * 
         * scanner.close();
         */

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Write the day of the week: ");
            String userInput = sc.nextLine().trim();
            if (userInput.isEmpty()) {
                System.out.println("No input provided!");
                return;
            }
            String day =
                    userInput.substring(0, 1).toUpperCase() + userInput.substring(1).toLowerCase();

            switch (day) {
                case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out
                        .println("Its a week day baby!😢");
                case "Saturday", "Sunday" -> System.out.println("Its a weekend whoo hoo 😀😀");
                default -> System.out.printf("%s is not a day...", day);
            }

        }
    }
}
