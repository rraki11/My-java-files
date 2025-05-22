public class Matrices {
    public static void main(String[] args) {
        int a[][] = {{1, 2}, {3, 4}};
        int b[][] = {{1, 2}, {3, 4}};
        int c[][] = new int[2][2];

        // Adding two matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        // Displaying the sum
        System.out.println("The sum of the matrices is: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println(); // Newline after each row
        }
    }
}
