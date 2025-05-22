package Hacker_rank_programs;
import java.util.Scanner; // Importing Scanner class to take user input

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object for input

        // Printing the header line
        System.out.println("================================");

        // Loop to take 3 inputs and print formatted output
        for (int i = 0; i < 3; i++) {
            String str = sc.next();  // Reads a string (word)
            int num = sc.nextInt();  // Reads an integer

            /*
             * %-15s   → Left-aligns the string and makes it 15 characters wide.
             * %03d    → Ensures the integer is 3 digits long, adding leading zeros if needed.
             * %n      → Moves to a new line after printing each formatted line.
             */
            System.out.printf("%-15s%03d%n", str, num);
        }

        // Printing the footer line
        System.out.println("================================");

        sc.close(); // Closing the scanner to prevent resource leaks
    }
}
