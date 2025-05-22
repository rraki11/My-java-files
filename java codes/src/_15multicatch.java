public class _15multicatch {
    public static void main (String[] args) {
        try {

            int a[] = {1,2,3};
            int result;

            result = a[2] / a[3];
            System.out.println("\nResult is: " + result);

        }
        catch (Exception e) { //when you use "Exception" you dont need to write other exception names becuase, it is the parent class of all the remaining exceptions.
            System.out.println("\nGeneric code");
        }
        /*catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("\n" + ae);
        }
        catch (ArithmeticException aaee) {
            System.out.println("\n" + aaee);
        }*/
    }
}
