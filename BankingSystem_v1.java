import java.util.Scanner;

public class BankingSystem_v1 {
    private static int balance = 0;

    public static void main(String[] args) {
        System.out.println("..................");
        System.out.println("BANKING SYSTEM");
        System.out.println("...................");

        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            int amount = 0;
            do {
                System.out.println("1. Check balance ");
                System.out.println("2. Deposit money ");
                System.out.println("3. Withdraw cash\n ");
                System.out.print("What would you like to do? ");
                choice = scanner.nextInt();

                if (choice < 0 || choice > 3) {
                    System.out.println("Enter a choice between 1 and 3");
                } else if (choice != 1) {
                    System.out.print("Enter amount: ");
                    amount = scanner.nextInt();
                }
            } while (choice < 0 || choice > 3);



            switch (choice) {
                case 1 -> checkBalance();
                case 2 -> deposit(amount);
                case 3 -> withdraw(amount);
            }
        }

    }

    private static int checkBalance() {
        System.out.println("Your current balance is $" + balance);
        return balance;
    }

    private static void deposit(int amount) {
        if(amount <= 0) return;
        balance += amount;
        System.out.println("You have deposited $" + amount);
        checkBalance();
    }

    private static void withdraw(int amount) {
        if(amount > balance) {
            System.out.println("You don't have sufficient amount on your account.");
            return;
        }
        balance -= amount;
        System.out.println("You have withdrawn $" + amount);
        checkBalance();
    }
}
