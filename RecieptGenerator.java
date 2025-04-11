import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RecieptGenerator {

    public static void main(String args[]) {

        /*
         * String string = "pizza"; string = String.format("%-9s", string); string =
         * string.replace(" ", "-"); System.out.println(string);
         */

        String[] items = {"Black", "American", "Milk"};
        int[] quantity = {2, 5, 7};
        double[] prices = {9.78, 3.5, 10.2};

        System.out.println("\n        ROMAC'S COFFEE        ");
        System.out.println("----------------------------------------");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD-MM-YYYY | HH:MM");
        System.out.println("Date: " + LocalDateTime.now().format(formatter) + "\n");

        // Header
        System.out.printf("%-20s %3s  %8s %10s%n", "Item", "Qty", "Price", "Total");

        double subtotal = 0;
        for (int i = 0; i < items.length; i++) {
            double total = quantity[i] * prices[i];
            subtotal += total;

            String unitPrice = String.format("$%-8.2f", prices[i]);
            String totalPrice = String.format("$%.2f", total);

            System.out.printf("%-20s %-7d %s %s%n", items[i], quantity[i], unitPrice, totalPrice);
        }

        double tax = 0.1 * subtotal;
        double discount = subtotal > 15 ? 0.05 * subtotal : 0;
        double total = subtotal + tax - discount;

        System.out.println("----------------------------------------");
        System.out.printf("Subtotal:%25s$%.2f%n", "", subtotal);
        System.out.printf("Tax (10%%):%23s$%.2f%n", "", tax);
        System.out.printf("Discount (5%%):%20s$%.2f%n", "", discount);
        System.out.printf("Total:%27s$%.2f%n%n", "", total);
        System.out.println("Thank you for choosing us!\n⭐️  Visit us again! ⭐️");
    }
}
