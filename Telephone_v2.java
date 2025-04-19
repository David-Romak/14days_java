import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Telephone_v2 {
    private static final List<Character> dialedNumbers = new ArrayList<>();
    private static boolean isMuted = false;

    public static void main(String[] args) throws InterruptedException {
        displayPhone();
        handleInput();
    }

    static void displayPhone() {
        char[][] telephone = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'},
            {'*', '0', '#'}
        };

        System.out.println("\n📞 \u001B[36mTELEPHONE KEYPAD\u001B[0m 📞");
        printBorder("top");
        
        for(int i = 0; i < telephone.length; i++) {
            System.out.print("│ ");
            for(int j = 0; j < telephone[i].length; j++) {
                System.out.print(getColoredKey(telephone[i][j]) + " │ ");
            }
            System.out.println();
            
            printBorder(i < telephone.length - 1 ? "middle" : "bottom");
        }
        
        displayDialStatus();
    }

    // Feature 1: Colored keys using ANSI escape codes
    private static String getColoredKey(char key) {
        return switch(key) {
            case '*' -> "\u001B[33m" + key + "\u001B[0m"; // Yellow
            case '#' -> "\u001B[35m" + key + "\u001B[0m"; // Purple
            case '0' -> "\u001B[32m" + key + "\u001B[0m"; // Green
            default -> "\u001B[34m" + key + "\u001B[0m";  // Blue
        };
    }

    // Feature 2: Animated button press
    private static void animateButtonPress(char key) throws InterruptedException {
        if(!isMuted) System.out.print("\u0007"); // System beep
        System.out.print("\r\u001B[31m[" + key + "]\u001B[0m");
        Thread.sleep(200);
    }

    // Feature 3: Dialing functionality
    private static void handleInput() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\u001B[3mPress keys (Enter after each), * to delete, # to dial, M to mute\u001B[0m");
        
        while(true) {
            String input = scanner.nextLine().toUpperCase();
            if(input.isEmpty()) continue;
            
            char key = input.charAt(0);
            if(key == 'M') {
                isMuted = !isMuted;
                System.out.println("🔔 Mute " + (isMuted ? "ON" : "OFF"));
                continue;
            }

            animateButtonPress(key);
            
            if(Character.isDigit(key) || key == '*' || key == '#') {
                if(key == '*') {
                    if(!dialedNumbers.isEmpty()) dialedNumbers.remove(dialedNumbers.size()-1);
                } 
                else if(key == '#') {
                    makeCall();
                    break;
                }
                else {
                    dialedNumbers.add(key);
                }
                redisplayPhone();
            }
        }
        scanner.close();
    }

    // Feature 4: Call handling with status
    private static void makeCall() throws InterruptedException {
        System.out.println("\n\u001B[32m📞 Dialing: " + getDialedNumber() + "...\u001B[0m");
        for(int i = 0; i < 3; i++) {
            if(!isMuted) System.out.print("\u0007");
            Thread.sleep(500);
        }
        System.out.println("\n✅ Connected!");
    }

    // Feature 5: Dynamic status display
    private static void displayDialStatus() {
        System.out.println("\nDialed: " + getDialedNumber());
    }

    private static String getDialedNumber() {
        return dialedNumbers.stream()
                           .map(String::valueOf)
                           .reduce("", String::concat);
    }

    // Feature 6: Screen redraw capability
    private static void redisplayPhone() {
        System.out.print("\u001B[2J\u001B[H"); // Clear console
        displayPhone();
    }

    // Enhanced border design
    private static void printBorder(String type) {
        String border = switch(type.toLowerCase()) {
            case "top"    -> "┌─────┬─────┬─────┐";
            case "middle" -> "├─────┼─────┼─────┤";
            case "bottom" -> "└─────┴─────┴─────┘";
            default       -> "───────────────────";
        };
        System.out.println(border);
    }
}