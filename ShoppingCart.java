import java.util.Scanner;
import java.util.Random;

public class ShoppingCart {

    public static void main(String args[]) {

        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.print("What would you like to buy?: "); String item = scanner.nextLine();
         * 
         * System.out.print("Whats the price for each?: "); double unitPrice = scanner.nextDouble();
         * 
         * System.out.print("How many would you like?: "); int qty = scanner.nextInt();
         * 
         * double totalPrice = unitPrice * qty; char symbol = '$';
         * 
         * System.out.println("\nYou have bought " + qty + " " + item + "(s)");
         * System.out.println("You total is " + symbol + totalPrice + "\n");
         * 
         * scanner.close();
         * 
         */

        // working with the Random class

       /* Scanner scanner = new Scanner(System.in);
        double adj;
        double base;
        double hyp;

        System.out.print("Enter the adjancent value: ");
        adj = scanner.nextDouble();

        System.out.print("Enter the base value: ");
        base = scanner.nextDouble();

        hyp = Math.sqrt(Math.pow(adj, 2) + Math.pow(base, 2));
        System.out.print("\nThe hypotenease is:  " + hyp);


        scanner.close();

        int h = scanner.nextInt();
        System.out.println(h);
        // Random random = new Random();
        // int randomNumber = random.nextInt(1,3);

        // System.out.println(randomNumber);
     */

        /* the printf method */

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        boolean isEmployed = true;
        double height = 30.6;

        // System.out.println("Hello " + name + "!");
        System.out.printf("Hello %s!%n", name);
        System.out.printf("He's name starts with %c.", firstLetter);
        System.out.printf("You are %d years old%n", age);
        System.out.printf("You are %f inches tall%n", height);
        System.out.printf("Is %s employed? %b%n", name, isEmployed);
    
    }
}
