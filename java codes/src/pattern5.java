public class pattern5 {
    public static void main (String[] args) {
        for(int i=1; i<=6; i++) {
            //inner loop for spaces..
            for(int j=1; j<=6-i; j++) {
                System.out.print(" ");
            }

            //inner loop for stars..
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
