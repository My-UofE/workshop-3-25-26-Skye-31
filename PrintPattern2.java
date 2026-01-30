import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class PrintPattern2 {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        int size = -1;
        while (size < 1 || size > 5) {
            System.out.print("Enter the size (1-5): ");
            size = in.nextInt();

            if (size < 1) {
                System.out.println("too small!");
                continue;
            }
            if (size > 5) {
                System.out.println("too big!");
                continue;
            }
        }

        char[][] rows = new char[size*2][size*2];
        // Outer loop to print each of the rows
        for (int row = 1; row <= size; row++) {
            char[] row_list = new char[size * 2];
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {
                int digit = (row + col - 1);
                // System.out.println(col-1 + "-" + (size-col) + "-" + size);
                row_list[col - 1] = Character.forDigit(digit, 10);
                row_list[size*2 - col] = Character.forDigit(digit, 10);
            }

            rows[row - 1] = row_list;
            rows[size*2 - row] = row_list;
            // System.out.println(row_list);
        }

        for (char[] r : rows) {
            System.out.println(r);
        }
    }
}
