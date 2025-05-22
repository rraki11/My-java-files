import java.util.Scanner;

public class pattern8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int rr = 0;
        System.out.print("enter number of rows: ");
        n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                rr = rr +1;
                System.out.print(rr + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
