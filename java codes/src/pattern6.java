import java.util.Scanner;

public class pattern6 {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);

        int n;
        System.out.print("enter no of rows you want: ");
        n = scan.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        scan.close();
    }
}
