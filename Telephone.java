public class Telephone {
    public static void main(String[] args) {

        displayPhone();

    }

    static void displayPhone() {
        char[][] telephone = {
                { '1', '2', '3' },
                { '4', '5', '6' },
                { '7', '8', '9' },
                { '*', '0', '#' }
        };

        for (char[] row : telephone) {
            for (char col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
