public class _13multipleexceptionhandling {
    public static void main (String[] args) {
        try {
            int a = 19, b =7, c = 7;
            int result;
            int res = a /0;//after this it will directly go to the "catch" block
            System.out.println("\nRes: " + res);//this line will not be executed

            try {
                result = (a/(b-c));//after this it will directly go to the "catch" block
                System.out.println("\nResult: " + result);//this line will not be executed
            }
            catch (ArithmeticException e) {
                System.out.println("\n" + e);
            }
        }
        catch (ArithmeticException e) {
            System.out.println("\nDividing by ZERO is UNDIFINED");
        }
    }
}
