import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class PrintPattern1 {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = in.nextInt();

        if (size < 1) {
            System.out.println("Size must be at least 1");
            System.exit(1);
        }

        // Outer loop to print each of the rows
        for (int row = 1; row <= size; row++) {
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println("");
        }
    }
}
