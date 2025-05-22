import java.util.Scanner;

public class _17anothermulticatch {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a;
            System.out.println("\nEnter something: ");
            a = Integer.parseInt(sc.next()); // May cause NumberFormatException
            System.out.println(a / 0);       // Will cause ArithmeticException
        }
        catch (ArithmeticException | NumberFormatException e) {
            // Multi-catch block for both exceptions
            System.out.println("\nException caught: " + e);
        }
        finally {
            sc.close(); // Ensuring Scanner is closed
        }
    }
}
