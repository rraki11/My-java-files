public class SemNestedtrycatch {
    public static void main (String[] args) {
        double arr[] = {3,6,7,19};

        try {
            try {
            double div = arr[3] / arr[0] - arr[0] ;
            System.out.println("division: " + div);
            }
            catch (ArithmeticException e) {
                System.out.println("division by zero is infinity");
            }
            arr[4] = 20;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bounds");
        }

    }
}
