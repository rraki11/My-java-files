import java.util.Scanner;

public class _6ifelse {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("enter any number to check if it is even or not: ");
        int num = input.nextInt();

        //if and else conditions
        if (num % 2 == 0) {
            System.out.println("Yeah! it is Even..");
        } else {
            System.out.println("Opps! its Odd..");
        }

        System.out.println();
        System.out.println();

        System.out.print("three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        //if and else if conditions 
        if (a > b && a < c) {
            System.out.println(a + " is greater among three..");
        } else if (b > c) {
            System.out.println(b + " is greater among three");
        } else if (c > b && c > a) {
            System.out.println(c + " is greater among three..");
        } else {
            System.out.println("all are equal lol..");
        }

        System.out.println();
        System.out.println();

        input.close();
    }
}
