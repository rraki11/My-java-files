public class SemException {
    public static void main (String[] args) {
        double arr[] = {7, 19};

        try {
            double div = (arr[0] + arr[1])/(arr[2]);
            System.out.println(div);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        finally {
            double division = (arr[0] + arr[1])/(arr[0]);
            System.out.println("finally block: " + division);
        }
    }
}