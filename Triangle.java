import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the triangle: ");
            int size = scanner.nextInt();

            System.out.print("Enter the symbol for the Triangle: ");
            char symbol = scanner.next().charAt(0);

            System.out.println("Right-Angled Triangle ");
            printRightAngledTriangle(size, symbol);

            System.out.println("Mirrored-Right-Angled Triangle ");
            printMirroredRightAngledTriangle(size, symbol);
            
            System.out.println("Centered Triangle ");
            printCenteredTriangle(size, symbol);
        }
    }

    private static void printRightAngledTriangle(int size, char symbol) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    private static void printMirroredRightAngledTriangle(int size, char symbol) {
        for (int row = 1; row <= size; row++) {
            // spaces
            int spaces = size - row;
            for (int space = 1; space <= spaces; spaces--) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    private static void printCenteredTriangle(int size, char symbol){
        for(int row = 1; row <= size ; row++){
            //spaces(only need the right space)
            for(int space = size-row; space < 0 ; space--){
                System.out.print(" ");
            }

            for(int col = 1; col < row ; col++){
                System.out.println(symbol);

            }

        }
    }
}
