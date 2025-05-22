import java.util.Scanner;

public class _7switch {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        //switch condition
        System.out.print("enter two numbers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        System.out.println("1. Addition\t2. Subtraction\t3. Multiplication\t4. Division");
        System.out.print("Choose an operaiton: ");
        int option = in.nextInt();

        switch (option) {
            case 1: System.out.print("Addition is: " + (n1 + n2) + "\n");
            break;

            case 2: System.out.print("Subtraction is: " + (n2 - n1) + "\n");
            break;

            case 3: System.out.print("Multiplication is: " + (n1 * n2) + "\n");
            break;

            case 4: System.out.print("Division is: " + (n1 / n2) + "\n");
            break;

            default: System.out.print("Not a valid option..\n");
        }

        in.close();
    }
}
