import java.util.Scanner;

public class pattern7 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        System.out.print("enter number of rows: ");
        n = scan.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
