import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Nested loop to print the hash pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("#");  // Print hash symbol
            }
            System.out.println();  // Move to the next line after each row
        }

        // Close the scanner
        scanner.close();
    }
}
