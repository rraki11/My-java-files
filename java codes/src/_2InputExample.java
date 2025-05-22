import java.util.Scanner;

public class _2InputExample {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take name input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your entered name is: " + name);

        System.out.println();

        // Take two numbers as input
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Calculate the sum and print it
        int sum = a + b;
        System.out.println("The sum is: " + sum);

        // Close the Scanner
        sc.close();
    }
}