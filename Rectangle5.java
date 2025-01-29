import java.util.Scanner;

public class Rectangle5 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        // Loop through each row
        for (int i = 0; i < rows; i++) {
            // Loop through each column in the current row
            for (int j = 0; j < columns; j++) {
                // Print a star for each column
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
