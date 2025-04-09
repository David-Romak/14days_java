import java.util.Scanner;

public class HelloWorld {
    static boolean isAlive = true;
    static boolean checkPresence(String name, int age) {
        if (age > 200) {
            isAlive = false;
            return isAlive;
        }

        return isAlive;
    }



    public static void main(String[] args) {
        // System.out.println("hello world!");
        // System.out.print("hello world!\n new line will be here!... ");
        // System.out.println("hello world!");

        int age = 15;

        System.out.println(checkPresence("Obama", 100));
        System.out.println(25*4 + "cm²");

        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        
        String laptop = scanner.nextLine();
        System.out.println(amount);
        System.out.println(laptop);


        scanner.close();

        Test test = new Test();
        System.out.println(num);

    }
}