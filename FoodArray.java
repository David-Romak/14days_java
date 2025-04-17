import java.util.Arrays;
import java.util.Scanner;

public class FoodArray {
  public static void main(String[] args) {
    /*
     * 
     * String[] foods = {"banana", "Gnuts"}; System.out.println(Arrays.toString(foods));
     * 
     * for (String food : foods ){ System.out.println("-" + food); }
     * 
     * String[] myFoods = new String[2]; myFoods[0] = "banana"; myFoods[1] = "Gnuts"; myFoods[2] =
     * "kipooli";
     * 
     * System.out.println(Arrays.toString(myFoods));
     * 
     */

    /*
     * Scanner scanner = new Scanner(System.in);
     * 
     * System.out.println("\n     Foods Array App     ");
     * System.out.print("How many food do you want? "); int size = scanner.nextInt();
     * scanner.nextLine();
     * 
     * String[] myFoods = new String[size] ;
     * 
     * for(int i= 0; i < size ; i++){ System.out.printf("Enter food type %d: ", i+1); myFoods[i] =
     * scanner.nextLine(); }
     * 
     * System.out.println("Here's your list"); System.out.println(Arrays.toString(myFoods));
     * 
     */
    add(2, 3, 6, 8);
    System.out.println(average(2, 3, 4, 5));


  }

  private static double add(double... numbers) {
    double sum = 0;
    for (double i = 0; i < numbers.length; i++) {
      sum += i;
    }

    return sum;
  }

  static double average(double... nums) {
    double sum = add(nums);
    double count = nums.length;

    return sum / count;


  }
}



/*
 * 
 */
