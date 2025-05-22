import java.util.Scanner;

public class _5homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your first name: ");
        String name1 = sc.next();

        System.out.print("enter your last name: ");
        String name2 = sc.next();

        System.out.println("hello " + name1 +" " + name2 + "! welcome to java");
        
        System.out.println();
        System.out.println();

        System.out.print("enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        
        System.out.print("addition is: " + add + "\n");
        System.out.print("subtraction is: " + sub + "\n");
        System.out.print("multiplication is: " + mul + "\n");
        System.out.print("division is: " + div + "\n");
        System.out.print("modulus is: " + mod + "\n");

        System.out.print("\n");
        System.out.print("\n");

        System.out.print("enter the length and breadth of a rectangle: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int perimeter = 2 * (length * breadth);
        int area = length * breadth;

        System.out.print("the perimeter of rectangle is: " + perimeter);
        System.out.print("\nthe area of the rectangle is: " + area + "\n");

        sc.close();
    }
}
