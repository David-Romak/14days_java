import java.util.Arrays;
import java.util.Scanner;

public class BankingSystem_v2 {
    private static int balance = 0;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
                ..................
                  BANKING SYSTEM
                ..................
                """);

        boolean isRunning = true;
        while (isRunning) {
            printMenu();

            int choice = getVerifiedChoice();

            switch (choice) {
                case 1 -> checkBalance();
                case 2 -> processDeposit();
                case 3 -> processWithdraw();
                case 4 -> isRunning = false;

            }
        }

        System.out.println("***Thank you for banking with us!***");

    }

    private static void printMenu() {
        System.out.println("ACTIONS:");

        System.out.println("1. Check balance ");
        System.out.println("2. Deposit money ");
        System.out.println("3. Withdraw cash ");
        System.out.println("4. Exit\n");

    }

    private static int getVerifiedChoice() {

        while (true) {
            System.out.print("Choose an option (1-4): ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();
                if (choice > 0 && choice <= 5)
                    return choice;
            } else {
                scanner.nextLine();
            }
            System.out.println("Invalid input, please select option 1 - 4");
        }

    }

    private static void checkBalance() {
        System.out.printf("%nCurrent balance: $%d%n%n", balance);
    }

    private static void processDeposit() {
        int amount = getVerifiedAmount("deposit");
        balance += amount;
        System.out.println("\nDeposited $" + amount);
        checkBalance();
    }

    private static void processWithdraw() {
        int amount = getVerifiedAmount("withdraw");
        balance -= amount;
        System.out.println("\nWithdrawn: $" + amount);
        checkBalance();
    }

    private static int getVerifiedAmount(String action) {
        final int MAX_DEPOSIT_AMOUNT = 10000;
        final int MAX_WITHDRAW_AMOUNT = 5000;

        if (!isValidAction(action)) {
            throw new IllegalArgumentException("\nInvalid action " + action);
        }

        while (true) {
            System.out.printf("\nEnter amount to %s: $", action);

            if (!scanner.hasNextInt()) {
                System.out.println("\nError: Amount must be a number");
                scanner.nextLine();
                continue;
            }

            int amount = scanner.nextInt();
            scanner.nextLine();
            if (amount <= 0) {
                System.out.println("\nError: Amount must be positive");
                continue;

            }

            switch (action.toLowerCase()) {
                case "deposit" -> {
                    if (amount > MAX_DEPOSIT_AMOUNT) {
                        System.out.printf("\nError: Maximum deposit amount is %d%n",
                                MAX_DEPOSIT_AMOUNT);
                        continue;
                    }
                }

                case "withdraw" -> {
                    if (amount > balance) {
                        System.out.println("\nError: Insufficient funds ");
                        checkBalance();
                        continue;
                    }

                    if (amount > MAX_WITHDRAW_AMOUNT) {
                        System.out.println(
                                "\nError: The maximum withdraw amount is $" + MAX_WITHDRAW_AMOUNT);
                        continue;
                    }
                }

            }

            return amount;
        }
    }

    private static boolean isValidAction(String action) {
        final String[] VALID_ACTIONS = {"withdraw", "deposit"};

        // using the streams method
        // return Arrays.stream(VALID_ACTIONS)
        // .anyMatch(validAction -> validAction.equalsIgnoreCase(action));

        for (String validAction : VALID_ACTIONS) {
            if (validAction.equalsIgnoreCase(action)) {
                return true;
            }
        }
        return false;
    }
}



/*
 * FUTURE IMPLEMENTATIONS
 * 
 * Log in with a PIN 
 * Add daily transaction limits 
 * Track transaction counts and history 
 * Currency formatting 
 * Decimal amounts support 
 * Transaction history tracking
 * Build admin dashboard
 * Add file persistence for balance
 * 
 * 
 */
