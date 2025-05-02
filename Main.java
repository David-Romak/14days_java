import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * 
         * 
         * Friend friend1 = new Friend("David");
         * Friend friend2 = new Friend("Romac");
         * Friend friend3 = new Friend("Kizito");
         * 
         * System.out.println(friend1.name);
         * System.out.println(Friend.numOfFriends);
         * 
         * //create an array of Friends;
         * Friend[] friends = new Friend[3];
         * 
         * friends[0] = friend1;
         * friends[1] = friend2;
         * friends[2] = friend3;
         * 
         * 
         * System.out.println(friends[0]);
         * 
         */

        /*
         * 
         * Dog dog = new Dog();
         * Cat cat = new Cat();
         * dog.eat();
         * dog.talk();
         * cat.eat();
         * 
         */

        /*
         * ArrayList<Integer> ints = new ArrayList<>();
         * ints.add(5);
         * ints.add(7);
         * ints.add(1);
         * 
         * 
         * System.out.println( ints.get(2));
         * // ints.remove(0);
         * // ints.set(1,88);
         * Collections.sort(ints);
         * 
         * 
         * System.out.println(ints);
         */

        /*
         * 
         * try (Scanner read = new Scanner(System.in)) {
         * ArrayList<String> foods = new ArrayList<>();
         * System.out.print("Enter # of food items: ");
         * int size = read.nextInt();
         * read.nextLine();
         * 
         * for (int i = 1; i <= size; i++) {
         * System.out.printf("Enter #%d: ", i);
         * String food = read.nextLine();
         * foods.add(food);
         * }
         * 
         * foods.set(2, "Gnuts");
         * System.out.println(foods);
         * }
         */

       /*
       try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();
            int num2 = 3;

            System.out.println(num2 / num1);
        } catch (ArithmeticException e) {
            System.out.println("You can not divide by zero you idiot! ");
        } catch (InputMismatchException e) {
            System.out.println("Xorry, that wasn't  a number!");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
        */


        try(FileWriter write = new FileWriter("B:\\zero 2 hero\\14days_java\\test.md")){
            write.write("My name is Romac...");
            System.out.println("File has been written to");
            System.out.println('h'+'i');
            System.out.println(5%7);
        }catch(FileNotFoundException e){
            System.out.println("File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
