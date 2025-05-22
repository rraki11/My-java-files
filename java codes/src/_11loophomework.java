import java.util.Scanner;

public class _11loophomework {
    @SuppressWarnings("resource")
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i;
        int sum = 0;

        //printing the sum of n natural numbers..
        System.out.print("enter the nth number to sum them: ");
        int n = sc.nextInt();

        for(i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.print("the sum of nth number is: " + sum);
        System.out.println();

        //printing the table of the number..
        System.out.print("enter which table you want: ");
        n = sc.nextInt();

        for(i = 1; i <= 10; i++) {
            sum = n * i;
            System.out.println(n + "x" + i + "=" + sum);
        }

        sc.close();
    }
}
