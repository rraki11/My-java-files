public class _12exceptionhandling1 {
    public static void main (String[] args) {
        try {

            int a = 19, b = 5, c = 5;
            int result;

            result = a / (b-c) ;//after this it will directly go to the "catch" block
            System.out.println(result);//this line will not be executed

        }
        catch (ArithmeticException e) {
            // System.out.println("\n" + e); returns this -> java.lang.ArithmeticException: / by zero
            System.out.println("\nDividing by ZERO is UNDEFINED");
        }
    }
}
