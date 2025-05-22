public class _16multicatch {
    public static void main (String[] args) {
            try {
    
                int a[] = {1,2,3};
                int result;
    
                result = a[2] / a[3];
                System.out.println("\nResult is: " + result);
    
            }

            //writing the super class exception first with the cild classes will generate an error
            /*catch (Exception e) { //when you use "Exception" you dont need to write other exception names becuase, it is the parent class of all the remaining exceptions.
                System.out.println("\nGeneric code");
            }*/

            catch (ArrayIndexOutOfBoundsException ae) { //this catch will be caught first and the remaining catch blocks are bypassed
                System.out.println("\n" + ae);
            }
            catch (ArithmeticException aaee) {
                System.out.println("\n" + aaee);
            }
            catch (Exception e) {
                System.out.println("\nGeneric code");
            }
        }
    }
