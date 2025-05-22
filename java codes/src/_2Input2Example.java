import java.io.*;

public class _2Input2Example {
    public static void main (String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader(isr);

        String name;
        int a, b, sum;
        char rr;

        System.out.println("Enter a Name: ");
        name = br.readLine();

        System.out.println("Enter two integers: ");
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        sum = a + b;

        System.out.println("Enter a Character: ");
        rr = (char) br.read();

        System.out.println("The entered Name was: " + name);
        System.out.println("The sum is: " + sum);
        System.out.println("The entered Character was: " + rr);
    }
}
